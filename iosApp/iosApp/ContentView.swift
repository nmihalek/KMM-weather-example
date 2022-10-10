import SwiftUI
import shared

struct ContentView: View {
    
    @State var currentWeather = CurrentWeather(temperature: 0, windSpeed: 0, measurementTime: 0)
    @State var dataError = ""
    
    let platform = GetPlatformHelper().execute()
    let getCurrentWeather = GetCurrentWeatherHelper()
	var body: some View {
        Text("Platform: \(platform)")
            .offset(y: -230)
        
        Text("Temperature: \(Int(currentWeather.temperature.rounded())) °C")
        Text("Wind speed: \(Int(currentWeather.windSpeed.rounded())) km/h")
        Text("Measurement time: \(currentWeather.measurementTime)h")
        
        if (!dataError.isEmpty) {
            Text("Error" + dataError)
        }

        Button("Get current weather") {
            Task {
                await loadData()
            }
        }.buttonStyle(.bordered)
            .offset(y: 230)
	}
    
    func loadData() async {
        do {
            let result = try await getCurrentWeather.execute() as! ResultSuccess<CurrentWeather>
            currentWeather = result.data!
        } catch {
            dataError = error.localizedDescription
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
