import SwiftUI
import shared

@main
struct iOSApp: App {
    init() {
        CommonModuleKt.doInitKoinIOS()
    }
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
