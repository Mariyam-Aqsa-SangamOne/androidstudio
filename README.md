## GitHub Repository Search App using MVVM Architecture

## Step 1: Setting up and testing mockoon
Install mockoon from https://mockoon.com/download/

1.1. Click on File -> New Local Environment -> Save a file name; eg:mockgit

1.2. Routes -> after / add path name; eg: repositories

1.3. Creating Responses
Response 1:
- Under Status and body, Add sample JSON data to simulate GitHub repository search results.
- Add Rules (parameters)
  - Rule 1: Query Parameter -> name equals kotlin
  - Rule 2: Query Parameter -> page equals 1
    These rules are connected through an AND
Response 2:
- Add another response by clicking on + icon left side to Response 1.
- Under Status and Body paste the content you want to fetch, this time replace "kotlin" with "java" wherever it applies.
- Add Rules (parameters)
  - Rule 1: Query Parameter -> name equals java

1.4. Go to settings to find your API URL. eg: 3001

1.5. Click on Start local server icon on the top left to start the mock server.

1.6. You can paste the url on any web browser in the following format to test your mock server.
localhost:3001/repositories?name=java 

1.7. Your mock server is ready for use.

## Step 2: Android Studio Project:
Create a new Android Studio project using Kotlin and Jetpack Compose.

## Step 3: Updating Android manifest.xml :Internet permission and cleartext traffic setting 
- Under AndroidManifest.xml file add:
    - uses-permission android:name="android.permission.INTERNET"/ within angular brackets
- Inside the '<application>' tag add:
    - android:usesCleartextTraffic="true"

## Step 4: Adding dependencies:
Under build.gradle.kts(:app) add:

- implementation("com.squareup.retrofit2:retrofit:2.11.0")
- implementation("com.squareup.retrofit2:converter-gson:2.11.0")
- implementation("io.coil-kt:coil-compose:2.7.0")
- implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

## Step 5: Creating data models :
5.1. Create a package named 'model'
This package contains classes that represent the data received from the API
  - Create class 'GitHubRepo'
     Purpose:
     - Represents a single GitHub repository
     - Stores repository details such as name,description,owner information etc.
  - Create class 'SearchResponse'
    Purpose:
    - Represents the complete API response.
    - Contains metadata such as page number, availability of more results, and the list of repositories returned by the     search.
  
## Step 6:Creating the network layer:
6.1. Create a package named network.
This package handles communication with the backend API.
    6.2. Create an interface named MockAPI 
    Purpose
    - Defines the API endpoints using Retrofit annotations.
    - Specifies request parameters and expected response types.
    6.3. Create an object named APIClient
    Purpose
    - Configures Retrofit.
    - Stores the base URL of the Mockoon server.
    - Creates an implementation of the MockAPI interface.
6.4.Create Repository
- Create a package named data.
    - A class named Repository.
      Purpose
      - Acts as an intermediary between the ViewModel and the API layer.
      - Handles API requests through APIClient.
      - Keeps networking logic separate from the UI layer.

## Step 7: Building the UI layer

7.1.Under the existing package ui.theme,
 - Create class UIState
   Purpose
   - Stores the current state of the screen.
   - Maintains information such as loading status, search text, repository list, and error messages.
- Create class GitSearchViewModel
  Purpose
  - Acts as the business logic layer of the application.
  - Receives user actions from the UI.
  - Requests data from the Repository.
  - Updates the UIState based on API responses.

7.2. Create the Search screen file 
Create a Kotlin file under the same package named "SearchScreen"
  Purpose
  - Contains the Compose UI displayed to the user.
  - Provides the search text field and search button.
  - Observes UIState and displays loading indicators, errors, or repository results accordingly.

## Step 8: Connecting everything through main activity
Call the SearchScreen() composable function from MainActivity to display the application's user interface.
  Purpose
  - Serves as the entry point of the application.
  - Creates and displays the SearchScreen.
  - Connects the ViewModel with the UI.
