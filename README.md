# Tweetsy

Welcome to the Tweetsy App! This app is built using Jetpack Compose, Kotlin, Android Jetpack, MVVM, and Clean Architecture. It allows users to view the top tweets based on the selected category.

## Features

- View top tweets by category
- Modern UI using Jetpack Compose
- MVVM architecture for better separation of concerns
- Clean Architecture for maintainable and testable code

## Architecture

This app follows the MVVM (Model-View-ViewModel) pattern and Clean Architecture principles. Here's an overview of the project's structure:

- **models**: Contains data models.
- **api**: Tweetsy API from [https://JSONBIN.io]. Reading from public bin [https://api.jsonbin.io/v3/b/<BIN_ID>]
- **di**: Dependency Injection setup using Hilt.
- **screens**: Contains UI components, screens.
- **repository**: Repository connecting api with viewmodel
- **viewmodels**: Separate viewModels for specific screens.

## Technologies Used

- **Jetpack Compose**: For building modern and reactive UI.
- **Kotlin**: Programming language used.
- **Android Jetpack**: Libraries for architecture, UI, and other features.
- **Hilt**: For dependency injection.
- **Retrofit**: For network operations.
- **Coroutines**: For asynchronous programming.
- **Flow**: For reactive streams.

### Prerequisites

- Android Studio Hedgehog or later
- Java 11 or later
- Kotlin 1.9.0

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/akshayz14/tweetsy.git
