# WeatherApp

An Android application that provides real-time weather information using the OpenWeatherMap API. Built with Kotlin and following MVVM architecture.

## Features

- **Location-based Weather**: Automatically fetch weather data based on the user's current location.
- **City Search**: Search for weather information by entering a city name.
- **Detailed Weather Data**: Displays temperature, humidity, wind speed, weather conditions, and more.
- **Network Connectivity**: Includes checks for internet connectivity with user alerts.
- **Material Design UI**: Modern and intuitive user interface using Material Design components.

## Technologies Used

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit for API calls with Gson converter
- **UI Framework**: Android View Binding, Material Design 3
- **Location Services**: Android Location API
- **Minimum SDK**: API 24 (Android 7.0)
- **Build Tool**: Gradle with Kotlin DSL

## Prerequisites

- Android Studio (version 2022.3.1 or later recommended)
- An active OpenWeatherMap API key (free tier available at [openweathermap.org](https://openweathermap.org/api))

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/WeatherApp.git
   cd WeatherApp
   ```

2. **Open in Android Studio**:
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned directory and select it

3. **Configure API Key**:
   - Sign up for a free API key at [OpenWeatherMap](https://openweathermap.org/api)
   - Open `app/src/main/java/com/example/weatherapp/util/Constants.java`
   - Replace the `SUB_URL` constant with your API key:
     ```java
     public static final String SUB_URL = "/data/2.5/weather?&appid=YOUR_API_KEY_HERE&units=metric";
     ```

4. **Build and Run**:
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio or use `Shift + F10`

## Usage

1. **Grant Permissions**: On first launch, grant location permissions to enable automatic weather fetching.
2. **Current Location Weather**: The app will automatically display weather for your current location.
3. **Search by City**: Use the search functionality to enter a city name and fetch its weather data.
4. **Network Alerts**: If there's no internet connection, the app will display an alert dialog.

## Permissions

The app requires the following Android permissions:

- `ACCESS_FINE_LOCATION`: For precise location-based weather data
- `ACCESS_COARSE_LOCATION`: For approximate location data
- `INTERNET`: To make API calls to OpenWeatherMap
- `ACCESS_NETWORK_STATE`: To monitor network connectivity

## Project Structure

```
app/src/main/java/com/example/weatherapp/
├── model/          # Data models (WeatherModel)
├── service/        # API service classes (RetrofitInstance, WeatherApi)
├── util/           # Utility classes (Constants, NetworkAlertDialogCreator)
│   └── networkutil/ # Network-related utilities
├── view/           # Activity classes (MainActivity, WeatherActivity)
└── viewmodel/      # ViewModel classes (WeatherViewModel)
```

## API Reference

This app uses the OpenWeatherMap Current Weather Data API:
- Base URL: `https://api.openweathermap.org/data/2.5/weather`
- Parameters: `lat`, `lon` for location-based queries; `q` for city name queries
- Units: Metric (Celsius)

## Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



## Acknowledgments

- Weather data provided by [OpenWeatherMap](https://openweathermap.org/)
- Icons and UI inspiration from Material Design guidelines


