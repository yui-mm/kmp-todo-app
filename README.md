# KMP TODO App

A cross-platform TODO application built with **Kotlin Multiplatform** and **Compose Multiplatform**.

## Platforms

- Android
- iOS
- Desktop (JVM)

## Features

- Add new tasks
- Mark tasks as completed
- Delete tasks
- Task counter with completion stats
- Material Design 3 UI

## Build & Run

### Desktop
```bash
./gradlew :composeApp:run
```

### Android
```bash
./gradlew :composeApp:assembleDebug
```

### iOS
Open the `iosApp/iosApp.xcodeproj` in Xcode and run.

## Tech Stack

- Kotlin 2.1.0
- Compose Multiplatform 1.7.3
- Material Design 3
- ViewModel (Jetpack Lifecycle)
