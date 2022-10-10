package com.example.kmmdemo.data

import com.example.kmmdemo.common.Result
import com.example.kmmdemo.common.Result.*

@Suppress( "TooGenericExceptionCaught")
abstract class CoreRepository {

    protected suspend inline fun <reified DataT : Any> safeApiCall(
        crossinline apiCall: suspend () -> DataT
    ): Result<DataT> =
        try {
            val response = apiCall()
            Success(response)
        } catch (e: Throwable) {
            Error(e)
        }
}
