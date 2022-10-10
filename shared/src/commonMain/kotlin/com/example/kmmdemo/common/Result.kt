@file:Suppress("USELESS_CAST")
package com.example.kmmdemo.common

sealed class Result<out DataT : Any> {

    data class Success<out DataT : Any>(val data: DataT? = null) : Result<DataT>()
    data class Error(val error: Throwable?) : Result<Nothing>()

    suspend fun collect(onSuccess: (DataT?) -> Unit, onError: ((Throwable?) -> Unit)?) {
        when (this) {
            is Success -> onSuccess(data)
            is Error -> onError?.invoke(error)
        }
    }

    suspend fun <DataU: Any> map(mapper: (DataT?) -> DataU): Result<DataU> =
        when (this) {
            is Success -> {
                Success(mapper.invoke(data))
            }
            is Error -> {
                Error(error = error)
            }
        }

    fun isSuccess(): Boolean = this is Success

    fun isError(): Boolean = this is Error
}

@Suppress("TooGenericExceptionCaught")
suspend fun <DataT: Any> Result<DataT>.collectOrError(onSuccess: (DataT) -> Unit, onError: ((Throwable?) -> Unit)?) =
    when (this) {
        is Result.Success -> {
            try {
                onSuccess.invoke(data!!)
            } catch (e: Throwable) {
                onError?.invoke(e)
            }
        }
        is Result.Error -> {
            onError?.invoke(error)
        }
    }
