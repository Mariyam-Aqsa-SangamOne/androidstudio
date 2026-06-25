## GitHub Repository Search App using MVVM Architecture

## Step 1: Download Android Studio                                                                     
Download [Android Studio](https://developer.android.com/studio)                                                                       

## Step 2: Install Android Studio                                                                                                                                                                                                               
Install Android Studio.                                                         
                                                         
## Step 3: Launch Android Studio                                                                                                                                                                             
Launch Android Studio.                                                                                                                                                                                 
## Step 4: Android Studio "New Project" "Empty Activity" "Next", Enter Project Details                                                           
Project Name: TriviaApp                                                      
Package Name: Use the automatically generated package name. You can change "example" to your organisation's name.                                           
Language: Kotlin                                                             
Build Configuration Language: Kotlin DSL                                                             
Minimum SDK: Select the default recommended SDK or API 24 and above.                                                           
                                                           
Click "Finish". Android Studio will create the project and download the required dependencies. Wait until Android Studio completes the Gradle synchronization. Make sure there are no build errors by checking the status bar at the bottom.                                                           
                                                           
## Step 5: Understanding the Project Structure. Note the following folders and files                                                           
- manifests                                                           
- kotlin + java                                                           
- res                                                           
                                                           
### manifests folder                                                           
- AndroidManifest.xml file containing App name, Activities, Permissions, App Configuration                                                           
                                                           
### kotlin + java folder                                                           
- MainActivity.kt - starting point of the application.                                                           
  - onCreate() method                                                           
  - setContent() method - displays the Compose UI.                                                           
                                                           
### res                                                           
- drawable - to store resources used by the application. 

## Step 6: Creating Android Emulator                                                           
- Tools-Device Manager-Create Device-Select Phone Model-API-Android Version. eg Pixel 7, Pixel 9                                                           
- Choose a system image, download, install. The emulator will now be available in Device Manager.                                                           
                                                           
## Step 7: Start Emulator                                                           
- Click the Play button beside the created virtual device.                                                           
- Wait for the Android phone interface to load completely.                                                           
                                                           
## Step 8: Run the Default Application                                                           
- Click the Run button in Android Studio, Select the emulator, Wait for the application to install.                                                           
                                                           
The application displays the default "Hello Android" screen.                                                             
Android Studio installation is correct.                                                             
Emulator setup is successful.                                                             
The Kotlin project can run successfully. 
Run the Default Application                                                             
                                                           
## Step 9:Connecting and Configuring a Physical Android Device for Testing                                                           
- Physical mobile device connected to USB instead of Emulator                                                           
                                                           
## Step 10: Enable Developer Options on the Mobile Device                                                           
By default, Android phones do not allow application debugging through USB. Therefore, Developer Options must be enabled.                                                           
                                                           
- Unlock the mobile phone.                                                           
- Open the Settings application.                                                           
- Scroll down and select About Phone.                                                           
- Locate the option: Build Number                                                           
- (The exact location may differ depending on the phone manufacturer.)                                                           
- Tap the Build Number option continuously 7 times.                                                           
- Enter the device password, PIN, or pattern if prompted.                                                           
- A message such as "You are now a developer" will appear.                                                           
- Developer Options are now enabled.                                                           
                                                           
## Step 11: Enable USB Debugging                                                           
USB Debugging allows Android Studio to communicate with the mobile device.                                                           
                                                           
- Go back to the main Settings screen.                                                           
- Open Developer Options.                                                           
- (It may be located under Additional Settings, System, or a similar section depending on the phone.)                                                           
- Locate the option: USB Debugging                                                           
- Turn USB Debugging ON.                                                           
- A confirmation message will appear.                                                           
- Click Allow or OK to enable it.                                                           
                                                           
## Step 12: Connect the Mobile Device to the Computer                                                           
- Use a USB cable to connect the mobile phone to the computer.                                                           
- Unlock the mobile phone.                                                           
- When a message appears asking "Allow USB Debugging?", select Allow.                                                           
- It is recommended to check "Always allow from this computer" so that the confirmation does not appear every time the device is connected.                                                           
                                                           
## Step 13: Select the Correct USB Connection Mode                                                           
- Some phones connect only for charging by default.                                                           
- Pull down the notification panel on the phone.                                                           
- Tap the USB connection notification.                                                           
- Select a mode such as File Transfer (MTP) or Transferring Files.                                                           
- This allows the computer and Android Studio to properly detect the device.                                                           
                                                           
## Step 14: Verify That Android Studio Detects the Device                                                           
Open Android Studio.                                                             
Look at the device selection dropdown near the top toolbar.                                                             
Verify that your mobile device name appears in the list. eg: Samsung Galaxy M14, Pixel 9. If the device appears, Android Studio has successfully connected to the phone.                                                           
                                                           
## Step 15: Run the Application on the Mobile Device                                                           
- Select the connected mobile device from the device dropdown.                                                           
- Click the Run button in Android Studio.                                                           
                                                           
Android Studio will:                                                           
- Build the application.                                                           
- Install the APK on the mobile device.                                                           
- Launch the application automatically.                                                           
- Wait until the application opens on the phone....                                                           
                                                           
## Step 16: Understanding the Default Application                                                           
Open the Main Kotlin File                                                             
After the project has been created successfully:                                                             
In the left panel of Android Studio, expand:                                                           
- kotlin + java                                                           
- package name (example: com.example.triviaapp)                                                           
- MainActivity.kt                                                           
- Double-click MainActivity.kt to open the file.                                                           
                                                           
## Step 17: Understand the Default Code Generated by Android Studio                                                           
By default, Android Studio creates a basic Jetpack Compose application.                                                             
The important sections are:                                                           
                                                           
### 17.1. MainActivity Class                                                           
```kotlin                                                           
class MainActivity : ComponentActivity()                                                           
```                                                           
This is the starting point of the application.                                                             
When the user opens the application:                                                           
- Application starts                                                           
- MainActivity is created                                                           
- onCreate() method executes                                                           
                                                           
### 17.2. The onCreate() Method                                                           
```kotlin                                                           
override fun onCreate(savedInstanceState: Bundle?)                                                           
```                                                           
This method runs automatically when the application starts.                                                             
It is responsible for performing the initial setup of the application.                                                           
                                                           
### 17.3. setContent()                                                           
Inside onCreate(), you will find:                                                           
```kotlin                                                           
setContent {                                                           
}                                                           
```                                                           
This tells Android: "Everything written inside this block should be displayed as the application's user interface."                                                           
                                                           
### 17.4. Composable Functions                                                           
You will see functions starting with                                                           
```kotlin                                                           
@Composable                                                           
```                                                           
Example:                                                           
```kotlin                                                           
@Composable                                                           
fun Greeting() {                                                           
}                                                           
```                                                           
A composable function is a function used to create user interface elements such as:                                                           
- Text                                                           
- Images                                                           
- Buttons                                                           
- Layouts                                                           
                                                           
Think of it as a reusable piece of the screen.                                                           
                                                           
### 17.5. Preview Function                                                           
At the bottom of the file, there is a preview function.                                                             
Example:                                                           
```kotlin                                                           
@Preview                                                           
```                                                           
This allows Android Studio to display a preview of the user interface without running the emulator.                                                             
It is only used during development and does not affect the final application.                                                           
                                                           
## Step 18: Run the Default Application                                                           
Before making any modifications:                                                           
- Click the Run button.                                                           
- Select the Android emulator.                                                           
- Wait for the application to install.                                                           
                                                           
Expected output: Hello Android                                                           
                                                           
## Step 19:Step 9: Understanding the Application Goal

The purpose of this application is to fetch trivia questions from an online API and display them in a scrollable list.

The application will:

Connect to the Open Trivia Database API
Retrieve trivia questions
Display questions and answers
Automatically load data when the application starts 

## Step 20: Understanding the API

The application uses the Open Trivia Database.

Example API URL:

https://opentdb.com/api.php?amount=10&category=18&type=boolean

amount=10 → Retrieve 10 questions
category=18 → Computer Science category
type=boolean → True/False questions

## Step 21: Enable Internet Permission

Open Manifests,AndroidManifest.xml

Add the following permission:

```xml
<uses-permission android:name="android.permission.INTERNET">
```                                                        
Android applications cannot access the internet unless this permission is declared.
                                                           
## Step 20: Add Required Dependencies
Gradle Scripts, build.gradle.kts (Module:app)

Add:

implementation("com.squareup.retrofit2:retrofit:2.11.0")
implementation("com.squareup.retrofit2:converter-gson:2.11.0")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

Click Sync Now.                                      
                                                           
## Step 21: Step 13: Understanding the Dependencies
Retrofit
Used for making HTTP requests.

Connects to the API
Sends requests
Receives responses.

Gson Converter
Used for JSON parsing.

Converts JSON into Kotlin objects
Removes the need for manual parsing 

ViewModel Compose
Used for state management.

Stores UI state
Survives configuration changes
Separates business logic from UI                                                  
                                                           
## Step 22:Package Structure

data
model
network
utils

These packages separate different responsibilities of the application.                                           
                                                           

## Step 23: Create the Model Package

Right-click the package name.

New → Package

Create:
model

Stores data received from the API.

## Step 24: Understand the JSON Response

The API returns data similar to:

```json
{
  "response_code": 0,
  "results": [
    {
      "question": "Linux was created by Linus Torvalds.",
      "correct_answer": "True",
      "incorrect_answers": ["False"]
    }
  ]
}
```
Observe that the response contains:

response_code
results

Each result contains:

question
correct_answer
incorrect_answers


## Step 25: Create Trivia.kt

Right-click Model package. 

Create:
Trivia.kt

Add:

```kotlin
 data class Trivia(
    val question: String,
    val correct_answer: String,
    val incorrect_answers: List<String>
)
```

Represents a single trivia question.

## Step 26:  Understanding Trivia.kt

Each object of Trivia stores:

One question
One correct answer
One or more incorrect answers

Example:

Question: Linux was created by Linus Torvalds.
Correct Answer: True
Incorrect Answers: False

## Step 27:  Create Response.kt

Right-click the model package

create:
Response.kt

Add:

```kotlin
data class Response(
    val response_code: Int,
    val results: List<Trivia>
)
```

Represents the complete API response.

## Step 27: Understanding Response.kt

The API does not directly return a Trivia object.

Instead:

A Response object is returned.
The Response object contains a list of Trivia objects.

Flow:

API → Response → List of Trivia → UI


## Step 28: Create the Network Package

Create:
network

Purpose:

Contains files responsible for API communication.

## Step 29: Create MockApi.kt

Inside network package create:
MockApi.kt

Defines API endpoints.
Retrofit uses this interface to understand:
Which URL to call
Which parameters to send
Which object should be returned

## Step 30: Add the GET Endpoint

Inside MockApi.kt add:
```kotlin
@GET("api.php")
suspend fun trivia(
    @Query("amount") amount: Int,
    @Query("category") category: Int,
    @Query("type") type: String
): Response
```

Requests trivia questions from the server.

## Step 31: Understanding Query Parameters

The parameters sent to the API are:
amount
Determines how many questions should be returned.

category
Determines the category of questions.
Example: 18 → Computers

type
Determines the question type.
Example: boolean → True/False questions

When these parameters are combined, Retrofit automatically generates the final URL and sends the request.

## Step 32: Create ApiClient.kt

Inside the network package create:
ApiClient.kt

ApiClient is responsible for configuring Retrofit and creating an implementation of the MockApi interface.

Without ApiClient:

Retrofit cannot be initialized.
API calls cannot be made.

Inside ApiClient.kt add: 

```kotlin
object ApiClient {
    val mockAPI: MockApi by lazy{
        Retrofit.Builder().baseUrl("https://opentdb.com/")
            .addConverterFactory(
                GsonConverterFactory.create()).build().create(MockApi::class.java)
    }
}
```


## Step 33: Understanding ApiClient.kt code

The base URL represents the common part of every API request.
Correct:
https://opentdb.com/

Incorrect:
https://opentdb.com/api.php?amount=10&category=18&type=boolean

The remaining parameters will be supplied through Retrofit query parameters.

GsonConverterFactory converts JSON into Kotlin objects.

Without Gson:
Manual JSON parsing would be required.

```kotlin
val mockAPI: MockApi
```
provides access to API endpoints defined in MockApi.

This object will later be used by the repository layer.

## Step 34: Create Data Package

Create:
data

Acts as a bridge between:

ViewModel
API Layer

This keeps networking logic separate from UI logic.

## Step 35: Create TriviaPath.kt

Inside the data package create:
TriviaPath.kt

Responsible for fetching trivia questions from the API.

The ViewModel should not directly communicate with Retrofit.

Instead:
ViewModel → Repository → API

Inside TriviaPath.kt add:

```kotlin
class TriviaPath {
    suspend fun triviaFacts(amount:Int, category:Int,type: String): Response{
        return ApiClient.mockAPI.trivia(amount,category,type)
    }
}
```

Requests trivia questions from the API and returns Response which contains a list of Trivia objects.

## Step 36: Understanding Why Suspend Functions Are Used

Network operations take time.
Android does not allow long-running operations on the main thread.

Therefore suspend is used.

Benefits:

Prevents UI freezing.
Keeps application responsive.
Allows coroutine support.

## Step 37: Create UIState.kt

Inside ui.theme create:

UIState.kt

Stores all information required by the screen.

This allows the UI to react automatically whenever data changes.

Add the below code to UIState.kt:

```kotlin
data class UIstate (
    val isLoading: Boolean = false,
    val projects: List<Trivia> = emptyList(),
    val response_code: Int = 0,
    val errorMsg: String? = ""
)
```

### Step 38: Understanding UIState.kt

data class UIState stores:
isLoading -> Indicates whether data is currently being downloaded.
projects -> Stores the list of trivia questions.
response_code -> Stores API response status.
errorMsg -> Stores error messages.

Jetpack Compose works using state.

Whenever UIState changes:
Compose automatically recomposes.
The screen updates automatically.
No manual refresh is required.

## Step 39: Create TriviaViewModel.kt

Inside ui.theme create:
TriviaViewModel.kt

Acts as the business logic layer.

Responsibilities:
Request data from repository
Handle exceptions
Update UI state
Communicate with UI

Inside TriviaViewModel.kt add:

```kotlin
class TriviaViewModel : ViewModel() {

    val trivia = TriviaPath()
    val _uistate = MutableStateFlow(UIstate())
    val uistate = _uistate.asStateFlow()
    fun triviaList(){
        viewModelScope.launch{
            _uistate.value = _uistate.value.copy(
                isLoading =  true,
                errorMsg=null
            )
            try{
            val response = trivia.triviaFacts(
                amount= 10,
                category=18,
                type = "boolean"
            )
            _uistate.value = _uistate.value.copy(
                isLoading = false,
                projects = response.results
            )
            } catch(e:Exception){
            _uistate.value = _uistate.value.copy(
                isLoading = false,
                errorMsg = e.message
            )
            }
        }
    }
}
```

## Step 40: Understanding TriviaViewModel.kt

Make TriviaViewModel extend ViewModel

```kotlin
class TriviaViewModel : ViewModel()
```

Provides lifecycle awareness.
Benefits:
Survives screen rotation.
Preserves data.
Avoids unnecessary API calls.
Step 39: Create Repository Object

Inside TriviaViewModel create:
```kotlin
val trivia = TriviaPath()
```
Allows the ViewModel to access repository functions.

```kotlin
MutableStateFlow(UIState())
```
Stores current screen state.
Whenever the state changes:
Compose automatically updates the UI.

Expose state using:
```kotlin
asStateFlow()
```
Allows the UI to read state.
Prevents accidental modification from outside the ViewModel.

```kotlin
fun triviaList()
```
Responsible for:
Starting loading
Calling API
Receiving results
Updating UI

Inside triviaList():
```kotlin
viewModelScope.launch
```
Launches a coroutine tied to the ViewModel lifecycle.
Benefits:
Automatically cancelled when ViewModel is destroyed.
Safe for API calls.

Before calling the API:
Update:
```kotlin
isLoading = true
```
Shows the loading indicator while data is downloading.

Call:
```kotlin
trivia.triviaFacts(
    amount = 10,
    category = 18,
    type = "boolean"
)
```
Fetches ten computer science True/False questions.

After receiving data:
Update:
```kotlin
projects = response.results
```
Stores downloaded questions.
The UI will automatically update.

Wrap API calls inside:
try
and
catch
Handles:
Network failures
Server issues
Invalid responses

Inside catch block:
Update:
```kotlin
errorMsg = e.message
```
Purpose:
Displays meaningful errors to users.

After success or failure:
Update:
```kotlin
isLoading = false
```
Removes loading indicator.

## Step 41: Create MainScreen.kt

Inside ui.theme create:
MainScreen.kt

MainScreen is responsible for displaying the user interface of the application.
It acts as the presentation layer and observes data coming from the ViewModel.
Responsibilities:
Display title
Display loading indicator
Display errors
Display trivia questions
Display answers

## Step 42: Create MainScreen Composable Function
Create:
```kotlin
@Composable
fun MainScreen(triviaViewModel: TriviaViewModel)
```

This function describes what should be displayed on the screen.
Jetpack Compose automatically redraws the screen whenever state changes.

## Step 43: Observe UIState
Inside MainScreen():

```kotlin
val uiState by triviaViewModel.uistate.collectAsState()
```

Converts StateFlow into Compose State.
Benefits:
Automatically updates UI
Removes manual refresh logic
Keeps UI synchronized with ViewModel

## Step 44: Understanding Why collectAsState() Is Needed

The ViewModel exposes:
StateFlow UIState

Compose cannot directly observe StateFlow.
Therefore collectAsState() is required.
This allows Compose to react whenever UIState changes.

## Step 45: Automatically Load Data

Inside MainScreen add:
```kotlin
LaunchedEffect(Unit) {
    triviaViewModel.triviaList()
}
```

Automatically loads trivia questions when the screen opens.
Without this:
Screen opens
No API request is made
No questions appear

## Step 46: Understanding LaunchedEffect

LaunchedEffect runs a block of code when the composable enters the composition.
Because Unit never changes,the API request runs only once.

Execution Flow:
Screen Opens
↓
LaunchedEffect Executes
↓
ViewModel Calls API
↓
Response Received
↓
Questions Display

## Step 47: Create Main Layout

Use:
Column()

Arranges UI elements vertically.
The screen contains:
Heading
Result Count
Loading Indicator
Error Message
Question List

## Step 48: Add Screen Heading

Display Trivia Quiz List using Text()
Provides context to the user regarding the application.

Styling:
HeadlineLarge typography
Bold font weight
Center aligned

Use Spacer() to add space before the next element.

## Step 49: Display Result Count
Add another column within the parent column()

Show:
Result Count: X
using Text()

Displays the number of questions retrieved from the API.

Example:
Result Count: 10
This confirms successful API retrieval.

## Step 50: Display Loading Indicator
Use:
```kotlin
CircularProgressIndicator()
```
Provides visual feedback while data is downloading.
The indicator appears when:
```kotlin
uiState.isLoading == true
```

## Step 51: Display Error Messages

Use:
```kotlin
uiState.errorMsg
```

Shows error information if API calls fail.
Examples:
No internet connection
Timeout
Invalid response

Error messages are displayed in red color.

## Step 52: Create Scrollable List

Use:
```kotlin 
LazyColumn{}
```
Displays multiple questions efficiently.

Benefits:
Better performance
Loads items as needed
Supports large datasets

## Step 53: Iterate Through Questions
Use:
```kotlin
items(uiState.projects)
```

Displays each Trivia object returned by the API.
Each item represents one trivia question.

## Step 54: Display Each Question Inside a Card

Use:
```kotlin
Card()
```

Provides visual separation between questions.
Benefits:
Improved readability
Modern Material Design appearance

Card Features:
Rounded corners
Elevation
Background color

## Step 55: Display Question Text

Inside the Card display:
```kotlin 
display.question
```

Shows the trivia question.
Example:
Question:
Linux was created by Linus Torvalds.

## Step 56: Handle Encoded HTML Characters

Some API questions contain HTML entities.
Examples:
&#039;
&quot;

These should not be shown directly to users.
To solve this problem create:

utils package.

## Step 57: Create HtmlExtensions.kt

Inside utils create:
HtmlExtensions.kt

Add:
```kotlin
fun String.decodeHtml(): String
```

Converts encoded HTML entities into normal characters.
Examples:
&#039; → '
&quot; → "

## Step 58: Display Decoded Questions

In MainScreen.kt,
Instead of:
```kotlin
display.question
```
Use:
```kotlin
display.question.decodeHtml()
```

Ensures questions appear correctly.
Example:
Before:
Linux&#039; creator
After:
Linux' creator

## Step 59: Remove the Default Composable Function and Preview

Open MainActivity.kt

When a new Jetpack Compose project is created, Android Studio generates a sample composable function and preview function.

Example:
```kotlin
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
```

```kotlin
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TriviaAppTheme {
        Greeting("Android")
    }
}
```
These functions were created only to demonstrate Jetpack Compose and are not required for the Trivia application.

Delete:
The default composable function (Greeting())
The preview function (GreetingPreview())

Removes unnecessary code.
Keeps MainActivity focused on launching the actual application screen.
Prevents confusion when reading the code.

## Step 60: Connect MainScreen to MainActivityUpdate MainActivity.kt

In MainActivity.kt

Create the ViewModel:
```kotlin
val viewModel: TriviaViewModel = viewModel()
```
Replace the default generated composable call with:
```kotlin
MainScreen(viewModel)
```

Creates the ViewModel.
Connects the ViewModel to the UI.
Displays the MainScreen when the application starts.

The final setContent block should look similar to:
```kotlin
setContent {
    TriviaAppTheme {
        val viewModel: TriviaViewModel = viewModel()
        MainScreen(viewModel)
    }
}
```

## Final Project Structure
com.sangamone.triviaapp
│
├── data
│   └── TriviaPath.kt
│
├── model
│   ├── Trivia.kt
│   └── Response.kt
│
├── network
│   ├── ApiClient.kt
│   └── MockApi.kt
│
├── utils
│   └── HtmlExtensions.kt
│
├── ui.theme
│   ├── MainScreen.kt
│   ├── TriviaViewModel.kt
│   └── UIState.kt
│
└── MainActivity.kt
                                                                 
## Authors
- Masseeha - GitHub: [@masseeha](https://github.com/masseeha-sangamone)
- Kishan Dharan - GitHub: [@Kishandharan](https://github.com/Kishandharan)
- Mariyam Aqsa Rafiq - GitHub: [@Mariyam-Aqsa-SangamOne](https://github.com/Mariyam-Aqsa-SangamOne)
