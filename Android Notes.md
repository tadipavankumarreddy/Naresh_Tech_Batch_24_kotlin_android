### Constraint Layout in android
Read About Constraint Layout [here](https://developer.android.com/develop/ui/views/layout/constraint-layout)

**Important Point to Note**
1. To position a view on the constraint layout, you are supposed to set atleast two constraints.
2. one of these two constraints must be a top contraint or a bottom constraint
3. one of the other constraints must be a left/start constraint or a right/end constraint. 
4. Simply, one constraint on horizontal axis and one constraint from vertical access has to be set. 

### Assignment
- Design a score tracker app interface using constraint layout

[Button](https://developer.android.com/develop/ui/views/components/button#java)

### Assignment:
> Please complete the TODO 8 & TODO 9 from the [Register Me](/RegisterMe/)

**Important Announcement:**
We don't have sessions tomorrow and the day after tomorrow on account of Vinayaka chaturdhi. Please close all the pending assignments by Monday. 

***Happy Ganesh Chaturdhi***

---

### Intents in Android

Official Documentation [link](https://developer.android.com/guide/components/intents-filters)

Basically an intent is a request object that you send to the android system. The android system will look into the request and acts accordingly. 

There are primarily two types of Intents in android
1. Implicit Intents
   -   Implicit intents are those intents that will invoke a system application to complete your request.
   -   Ex: Apps openining maps, youtube, calendar, dailer and other system applications need implicit intents.
  
2. Explicit Intents
   -   An Explicit intents requires to open one of the user installed applications to resolve your request. 
   -   Ex: You want to navigate from one activity to another in your application that your are developing. 

#### Material Design library for Android
- This library is designed, developed and maintained by Google for building nice UIs.

[Link for Official Website](https://m3.material.io/develop/android/mdc-android)

[Link for Components](https://github.com/material-components/material-components-android/tree/master/docs/components)


#### Assignment
Create **An Age Calculator** app. 
 
**Task:** The first activity should have fields for the user to enter their name and birth year. When the user clicks on a button, the app should navigate to the SecondActivity, which displays a message like, "Hello, [Name]! You are [Age] years Old!."

[Common Intents](https://developer.android.com/guide/components/intents-common)

#### Assignment

Please complete any two common intents other than maps, browser, dailer and settings. 

#### Activity LifeCycle
Lifecycle means from the time of creation till the time of destruction, whatever, the states that a component undergoes. 

Activity Lifecycle means all the stages that an activity goes through from the time of creation till the time of destruction of an activity.

[Official Documentation](https://developer.android.com/guide/components/activities/activity-lifecycle)

![image](/activity_lifecycle.png)

- Your activity is in running state as soon as it goes through `onResume()` method. 
- When the user taps on home button, the activity goes to background by going through `onPause()` & `onStop()` methods. 
- When the user brings an app back from backstack, the activity that is on foreground on that app, will be restarted by going though `onRestart()`, `onStart()` & `onResume()` -> Activity your activity is in running state. 
- If the user clicks on the backbutton, the activity is removed from the memory (Activity is destroyed) by going through `onPause()`, `onStop()` & `onDestroy()`.

**About Logcat**
The Log class is used for logging the messages to the Logcat, which is a command-line tool that displays System Messages, including stack traces when the app throws an error. The Log class provides several methods to send messages of different priority levels to the logcat. 

1. Log.v (Verbose):
   -  Priority Level : Lowest
   -  Used to log the most detailed information. It's meant for development purposed and provides more granular details about the code execution, such as the flow and state of the app.
   -  Log.v("TAG", "Your Message")
  
2. Log.d (Debug)
   -  Priority Level: Debug
   -  Used to log debugging messages. Its useful for development and debugging to track the flow and the staet of an app.
   -  Log.d("TAG", "Your Message")
  
3. Log.i (Information)
   -  Priority: Informational
   -  Used to log informational messages that highlight the progress of that applicaiton at a coarse-grained level. 
   -  These logs are usually enabled in production also. 
   -  Log.i("TAG","Message")

4. Log.w (Warn):
   -  Used to log potentially harmful situations. 

5. Log.e(Error)
   - Priority :Highest
   -  Used to log error messages that indicate the application has encountered a serious issue. 

**Acitivty Backstack (TASK)**  
[official doc link](https://developer.android.com/guide/components/activities/tasks-and-back-stack)

![image](/task.png)

### Assignment
Explain the four launcher modes in detail.Draw pictures to demonstrate how they are useful. 


## ListView
- This ui component is used to display list of items to the user
- This is a legacy approach
- Recyclerview is a replacement of Listview and is quite powerful than listview. 
- Listview only supports vertical collection of views. 
- No Support for Horizontal Scrolling. 

[Official Documentation](https://developer.android.com/reference/android/widget/ListView)

- Whenever there is a list of items (multiple Pieces of Data) to be displayed on a single view such as ListView, Spinner, RecyclerView and etc., We need to use an Adapter.
- For ListView and Spinner, we use ArrayAdapter.

### RecyclerView

[presentation](https://docs.google.com/presentation/d/1nFJqH0OSSZmjaycRzEGE6vvsm6jlxghQyoO15KKbkwc/edit?usp=sharing)

[Official Documentation Link](https://developer.android.com/develop/ui/views/layout/recyclerview)

[Excellent Codelab](https://developer.android.com/courses/pathways/android-development-with-kotlin-10)

Custom chrom tabs [Official Documentation](https://developer.chrome.com/docs/android/custom-tabs/guide-get-started)

### **Synchronous Vs Asynchornous programming**

These are two different ways of handling operations, especially those involve in waiting like I/O (reading, files, network requests,. etc)

**Synchronous Programming**
Here tasks are performed one after the other. The program waits for a task to complete before moving on to the next one. 

Major disadvantage is blocks.

**Asynchronous Programming**

Helps you perfrom tasks concurrently. The program does not wait for a task to complete; instead it goes on to the next task and comes back to the task when it's needed. 

***Two Important Points to note***
- Never block your UI Thread (Main Thread). 
- Do not access the android UI toolkit from any thread other than main thread. 

Async Task [Slides](https://docs.google.com/presentation/d/1A7anDTS8NQCunbxoJnqJqkSHNFCvRIn9moE7Zww-gds/edit#slide=id.g116d7d9d49_3_13)

Async Task [Official Doc](https://developer.android.com/reference/android/os/AsyncTask)

### Important Announcement
Starting from tomorrow ie., 18th of Sep 2024, Our sessions begin at 7:30 AM. 

**JSON Parsing Notes**
- What ever is present in between `{}` is called JSON Object
- What ever is present in between `[]` is called JSON Array
- Strings, integers and etc., will come in name and value pairs. You need to have the key (name) to extract the value. 


***Executors***
[Official Document](https://developer.android.com/reference/java/util/concurrent/Executor)

1. What is an Executor ?
   -  Executors provide a way to execute tasks (Runnables or Callable) in the background, using a pool of worker threads.
   -  Its a part of `java.util.concurrent` Package
2. Executor Inteface
   -  Has a simple interface that provides a method to execute
   - 
   ```java
   public interface Executor{
      void execute(Runnable command);
   }
   ```
3. Types of Executors
   -  Single Thread Executor
      -  It creates a single worker thread to execute tasks sequentially.
      -  use `newSingleThreadExecutor()`
   -  Fixed Thread Pool Executor
      -  A thread pool with a fixed number of worker threads. When all threads are busy, tasks wait in queue. 
      -  use `newFixedThreadPool(3)`
   -  Cached Thread Pool
      -  A thread pool that creates new threads as needed, but reuses the existing ones when available. It's suitable for handling short-lived tasks. 
      -  use `newCachedThreadPool()`
   -  Scheduled Thread Pool
      -  You can have a schedule to run your tasks
      -  use `newScheduledThreadPool(3)`
4. ExecutorService
   -  ExecutorService is more advanced version of Executor. It can manage the lifecycle of threads and provides additional features
      -  submitting tasks that return results
      -  Scheduling the tasks
      -  Managing the thread shutdown.
5. Submitting Tasks
   -  Runnables
      -  tasks (no result)
   -  Callables
      -  tasks (with a result)
6. Shutdown the executor
   -  Always shutdown the executor to free up the resources
      -  `shutdown()` method can be used. 
7. Handle exceptions
   -  Uncaught execeptions in threads can be handled using `Thread.UncaughtExeceptionHandler`. In the executors, you might need to handle exceptions inside the Runnable or Callable. 
8. Advanced Features
   -  **InvokeAll**: Executes a collection of Callable Tasks and retuns a list of Future Objects.
   -  **InvokeAny**: Executes a collection of Callable Tasks, returning the result of the first successful task. 


### Volley
Volley is an HTTP library that makes networking for Android apps easier and most importantly, faster. Volley is available on [GitHub](https://github.com/google/volley).

[Read more](https://google.github.io/volley/) about volley


### Parsing JSON (In an Easyway)
Step 1: Add Gson Library Dependency
- GSON is a library that serializes Java Pojo (plain Old Java Objects) or Kotlin Data classes to JSON and also deserializes the JSON data to Java pojos or Kotlin data classes. 
[GSON Library](https://github.com/google/gson)

Step 2: Copy the response of the URL (Through which you get the JSOn data) and paste it in [json2kt](json2kt.com) and download the equivalent classes (data classes) that represent the json response. 

Step 3: Follow this [tutorial](https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization) and parse the json data using gson library. 

Step 4: Use the data to present it to the user. 


To load Images use [Glide](https://github.com/bumptech/glide)


### Assignment
- Practice Google Books app
- Enhace the view of the app by adding cardview for recyclerview items.
- Add Details feature to the app. As soon as the user clicks on an item on the recyclerview, display the following details on the next Activity.
  - Book title
  - Book Author(s)
  - Description
  - Sale Info
- Using the similar coding, please explore [News API](https://newsdata.io/documentation). Display the current day news based on the category selected by the user. When the article is clicked, take the user to the details screen where further details should be presented. 

### Retrofit

[Official Link](https://square.github.io/retrofit/)

- This is an open source library that makes the networking task easy.

[Json Placeholder](https://jsonplaceholder.typicode.com/) is a fake rest api that supports `GET`, `POST` and etc. This will help in mastering the network apis. 

***Converter Factories***
Converters can be added to support other types. Sibling modules adapt popular serialization libraries for your convenience.

- Gson: com.squareup.retrofit2:converter-gson
- Jackson: com.squareup.retrofit2:converter-jackson
- Moshi: com.squareup.retrofit2:converter-moshi
- Protobuf: com.squareup.retrofit2:converter-protobuf
- Wire: com.squareup.retrofit2:converter-wire
- Simple XML: com.squareup.retrofit2:converter-simplexml
- JAXB: com.squareup.retrofit2:converter-jaxb
- Scalars (primitives, boxed, and String): com.squareup.retrofit2:converter-scalars


Use [postman](https://web.postman.co/) to test your APIs.

**Steps to add Retrofit**

1. Add the retrofit dependency 

```
implementation("com.squareup.retrofit2:retrofit:2.11.0")
```

2. Also Add the Converter factory dependency

```
implementation("com.squareup.retrofit2:converter-gson:2.11.0")
```

3. Add Model classes  
`FakeGet.kt`
```kotlin
data class FakeGet(
    var userId:Int? = null,
    var id:Int? = null,
    var title:String? = null,
    var body:String? = null
)
```

For Post Requests, usually we create two model classes

`PostRequest.kt`

```kotlin
data class PostRequest(
    val title:String, val body:String, val id:Int
)
```

`PostResponse.kt`

```kotlin
data class PostResponse(
    val id:Int, val title:String, val body:String, val userId:Int
)
```

4. Create an interface to list out all the type of requests that you want to perform using retrofit library as methods. 

`JsonTypicodeInterface.kt`

I want to do two requests
   - Get -> https://jsonplaceholder.typicode.com/posts/1
   - Post -> https://jsonplaceholder.typicode.com/posts
 - The common URL is "https://jsonplaceholder.typicode.com/", hence we can consider this as `BASE URL`

5. Make calls through retrofit

```kotlin
class MainActivity : AppCompatActivity() {

    var jsonTypicodeInterface:JsonTypicodeInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize retorift object
        val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Initialize the interface
        jsonTypicodeInterface = retrofit.create(JsonTypicodeInterface::class.java)
    }

    fun getRequest(view: View) {
        jsonTypicodeInterface?.getData()?.enqueue(object : Callback<FakeGet>{
            override fun onResponse(p0: Call<FakeGet>, p1: Response<FakeGet>) {
                Log.v("MAIN", p1.body().toString())
            }

            override fun onFailure(p0: Call<FakeGet>, p1: Throwable) {

            }
        })
    }

    fun postRequest(view: View) {
        jsonTypicodeInterface?.postData(PostRequest("Pavan","Trainer",12))?.
        enqueue(object : Callback<PostResponse> {
            override fun onResponse(p0: Call<PostResponse>, p1: Response<PostResponse>) {
                Log.v("MAIN",p1.body().toString())
            }

            override fun onFailure(p0: Call<PostResponse>, p1: Throwable) {

            }
        })
    }
}
```

### Notifications

[Official Documentation](https://developer.android.com/develop/ui/views/notifications)

[Slides](https://docs.google.com/presentation/d/1D2n0-V0qG7H0YV5ZWx4rtJpjuHDBJ6m7vcvEmdYR8Ew/edit?resourcekey=0-NjY_l12AwzTN0Znqt7KY6w#slide=id.g116d7d9d49_3_13)

A `PendingIntent` is a reference to a token maintained by the system. Application A can pass a PendingIntent to application B in order to allow application B to execute predefined actions on behalf of application A; regardless of whether application A is still alive.

[Official Documentation](https://developer.android.com/privacy-and-security/risks/pending-intent)

Basically the pending intent can be created in three ways
- getActivity() -> This is used when you want to open the current apps activity from a remote location (can be from another app or the same app's other component)
- getBroadcast() -> This is used when you want to send the broadcast defined in your application from a remote location. 
- getService() -> this is used when you want to start a service defined in your application from a remote location.

*All these methods require four arguments to be passed*

- Context
- Request Code (Any Integer - this uniquely represents the pending intnet)
- Intent (Actual action to be performed)
- Pending Intent Flags (Defines what you want to do with an existing pending intent [Official Documentation](https://developer.android.com/reference/android/app/PendingIntent#constants_1))


### Assignment 
Please explore the other styles of notifications and setStyle Method of NotificaitonBuilder. 

### Broadcast Receivers
[Official Documentation](https://developer.android.com/develop/background-work/background-tasks/broadcasts)  
[Slides](https://docs.google.com/presentation/d/1qF9Yeau7uHIP7_aOHWgPU_RnfxACZzGyAZIzcJWz0R0/edit#slide=id.g116d7d9d49_3_13)

#### Assignment:
Try sending a custom broadcast to another app component.


