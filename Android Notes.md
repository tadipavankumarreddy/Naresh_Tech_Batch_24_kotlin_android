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

### SharedPreferences
- This is a part of Persistant storage options in android. 
- SharedPreferences are used to store small amounts of primitive data
- Usally, data such as highestscores in the game, session keys and etc can be stored/
- Shared Preferences are internal to the application which means that the external applications or the user himself cannot access this file directly. Also, these files gets deleted when the user uninstalls the application.
- There is a replacement of sharedpreferences concept with advanced features, DataStore.
- [Official Documentation Link](https://developer.android.com/training/data-storage/shared-preferences)

### SQLite
- SQLite is an opensource database created for light weight processes
- You can store small amount of relational data in the local device. 
- To store relational data in android, SQLite is the only option. 
- RoomDatabase is also built on SQLite 
- Please practice the following queries on [SQLiteOnline.com](https://sqliteonline.com/)

**SQLite Queries**  
- Create a Table
  - CREATE TABLE person(
  person_id integer PRIMARY key AUTOINCREMENT,
  person_name text,
  person_age integer
);

- Insert Data 
  - INSERT INTO person (person_name,person_age) VALUES ('Rama',22), ('Pavan', 32) ;

- Retrieve The Data
  - select * from person;

- Update the data
  - UPDATE person set person_age = 34 WHERE person_id = 2;

- Delete an entry
  - DELETE from person where person_id = 2;

- DROP the table
  - DROP TABLE person;

- **SQLiteDatabse** is a class in android that creates and helps in managing the data. 
  
- To make the SQLite Transactions easy, we have a helper class called `SQLiteOpenHelper`.

- `SQLiteOpenHelper` gives us two methods to override. They are `onCreate(SQliteDatabase db)` & `onUpgrade(SQliteDatabase db, version)`
  
- `onCreate(...)` is used to create the tables for your database. This usally runs only once. However, if there is a scheme update of the database as the versions get upgraded, this works at that time as well. 
  
- `onUpgrade(...)` is used to restructure the tables when there is a version change.

#### Assignment
Experiment the same code given for SQLite Databases app. Add the 
following functionality  
   1. UPDATE
   2. DELETE
   3. DROP

### Content Provider in Android
![Content Provider](/content_provider.png)

[Official Documentation](https://developer.android.com/guide/topics/providers/content-provider-basics)

- Content Provider is a layer built on top of a database in an  application from where you want to share your data to other applications to use. You can visualize Contacts app here. Because contacts app shares its data to other applications such as Whatsapp, instagram, facebook and etc., on your permission. 
- To access data from other applications or modify or delete it, you need to have contentResolver component in your app. 
- The Content Provider can be recognized by a unique string called the ContentURI. If you know it only then you can request the data. 
- All the content URIs should have a prefix as "content://".
  
#### Assignment
- Research about android application sandboxing and prepare a document. 
- Create an app that reads your contacts and writes them. Refer to the [official documentation link](https://developer.android.com/identity/providers/contacts-provider)

### Alarm Manager in Android
- Alarm manager schedules the Tasks in regular time intervals
- Not an actual Alarm clock
- Clock of the AlarmManager is of Two Types
  - Elapsed Real time
    - Is the time calculated since the system boot
    - Can also be termed as "Relative Time Clock"
    - This type of clock is recommended for AlarmManager as it is not the exact time. 
  - Real Time Clock (RTC)
    - It is the real clock
- WakeUp Behavior
  - WAKE_UP 
    - When the alarm ticks in if you want to wake up your device, this type of behavior needs to be selected
  - NOT_WAKE_UP
    - When the alarm ticks in if you do not want to wake up your device, this type of behavior needs to be selected
- Based on The Types of clocks and the wake up behavior, there are four alarms that we can use
  
Wake Up Behavior| RTC|ELAPSED REAL TIME  
---|---|---
Wake Up | RTC_WAKE_UP | ELAPSED_REALTIME_WAKE_UP
Does not wake Up| RTC | ELAPSED_REALTIME

- Alarm Manager [Official Documentation](https://developer.android.com/reference/android/app/AlarmManager)
- Alarm manager [Google Training Slides](https://docs.google.com/presentation/d/1Xz5TVqIsKWR2J1-OdZHrSh3mE52AIAWeVhhVNkVdnQE/edit#slide=id.g116d7d9d49_3_13)

#### Assignment
- Improvise the UI of the HydrationRemainder App
  - Track the users consumption of water in a day
- Refer to these outstanding projects on github
  - [Project One](https://github.com/KeyurDiwan/Water-Reminder)
  - [Project Two](https://github.com/sinansonmez/WaterTracker)

### JobScheduler
- This is also a scheduling algorithm just like your alarm manager
- It is intelligent than alarm manager
- It works based on Conditions but not on the time.
  - For certain jobs to be done, you need certain conditions in the device to meet
    - Internet Connection
    - Device Idle state is required
    - Device Should be charging state
- JobScheduler is only added from API 21. 
- JobScheduler is not backwards compatible (meaning, you cannot use this before api 21)'
- Three Major Components involved
  - JobScheduler
    - Is responsible to schedule a job
  - JobService
    - Is the palce where you define your task
    - There are two methods to override (These two methods run on Main Thread). They return boolean data type value
      - onStartJob(...) 
      - Runs on Main thread
      - hence when you have a long running task, you need to off load the task to the worker thread and from the worker thread you can notify the JobSchduler about the completion of the task (when the task is complete, you need to call jobFinished(...))
      - You define your task here. 
        - true
          - When the work is offloaded to a worker thread.
        - false
          - When the job is done.
      - onStopJob(...)
        - You write logic to cancel the task here
        - true
          - When the task has to be rescheduled
        - false
          - When there is no need of rescheduling the Task
  - JobInfo
    - Is used to set the conditions based on which the JobScheduler algorithm decides weather to run the task or not. 

[Learn More here](https://docs.google.com/presentation/d/1jWZ10wsLZTPhTl2jcPpa-PpkIbfJAeoVKfUv-eQoSCk/edit#slide=id.g18e75634d0_0_172)

[Documentation](https://developer.android.com/reference/android/app/job/JobScheduler)

### Work Manager
- This is an Advanced library than JobScheduler
- WorkManager is the recommended solution for persistent work.
- Work is persistent when it remains scheduled through app restarts and system reboots. Becasue, most background processing is complicated and is best accomplished through persistent work
- WorkManager handles three types of persistent work
  - Immediate:
    - Tasks that must begin immediately and complete soon.
    - One Time running tasks
    - OneTimeWorkRequest and worker for expedited work, call setExpedited(...) on your oneTimeWorkRequest.
  - Long Running:
    - Tasks that might run for longer, potentially longer than 10 minutes
    - OneTime or Periodic
    - Any WorkRequest or Worker call setForeground(...) in the worker to handle the notification.
  - Deferrable:
    - Scheduled Tasks that start at a later time and can run periodically.
    - OneTime or Periodic
    - PeriodicWorkRequest and Worker  
[Official Documentation](https://developer.android.com/topic/libraries/architecture/workmanager)

#### Assignment 
Please work with the app in the [codelab](https://developer.android.com/codelabs/basic-android-kotlin-compose-workmanager#0)

### Fragments in Android
A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments can't live on their own. They must be hosted by an activity or another fragment. The fragment’s view hierarchy becomes part of, or attaches to, the host’s view hierarchy

[Official Link](https://developer.android.com/guide/fragments)

**Primary Usecases**
- Modular UI Components
  - Fragments allow developers to break down an activity's user interface into smaller, managable pieces. It makes it easier to reuse the code and UI Components across different parts of the applicaiton or even in different activities. 
- Flexible layouts for Multiple Screen Sizes
  - Fragments are ideal for creating responsive layouts. In Devices with larger screens (like tablets), you can show multiple fragments side by side, while on smaller screens (like phones) you can display them one after the other.
- Reusability
  - Since fragments are self-contained UI components, they can be reused in different activities or even within different parts of the same activity. This reduces the amount of boilerplate code and can also speed up development. 

**Imp Note**: For a Fragment to be shown to the user, there must be an activity or another fragment running and that should act as a host. A Fragment cannot be used independently. 

![fragment](/fragment-view-lifecycle.png)

### Fragment Lifecycle
1. onAttach()
   1. **When it happens**: It is called when the fragment is first attached to its parent activity. 
   2. **What you can do**: This is where you can access the parent activity or set up any initial resources.
2. onCreate()
   1. **When it happens**: It is called when the fragment is first created, right after being attached to the activity. 
   2. **What you can do**: You can initialize Non UI Components, like setting up data, ViewModels etc.,
3. onCreateView()
   1. **When it happens**: called when the frament's UI needs to be created (ie., that the layout is inflated)
   2. **What you can do**: Inflate the fragment's UI 
4. onActivityCreated()
   1. **When it happens**: called after the activity's `onCreate()` method finishes. 
   2. **What you can do**: This is a good place to interact with the activity's views and complete the final initialization.
5. onStart()
   1. **When it happens**:Called when the fragment becomes visible to the user
   2. **What you can do**: start things that need to happen when the fragment is visible (ex: Starting animations or loading data)
6. onResume()
   1. **When it happens**: Called when the frament is now interacting with the user
   2. **What you can do**:Start things that need to happen when the fragment is actively used. 
7. onPause()
   1. **When it happens**:Called when the fragment is no longer in the foreground but still visible
   2. **What you can do**:Pause any active processes, like animations or network requests to save resources.
8. onStop()
   1. **When it happens**:called when the fragment is no longer visible to the user
   2. **What you can do**: release the resources, stop animations, and save any necessary data
9.  onDestroyView()
    1. **When it happens**:Called when the viewhierarchy of the fragment is destroyed (But the fragment itself may still exist)
    2. **What you can do**:clean up view references, remove any bindings or free resources related to the UI.
10. onDestroy()
    1.  **When it Happens**: Called when the fragment is no longer needed
    2.  **What you can do**: Stop background tasks
11. onDetach()
      1. **When it happens**: Called when the fragment is detached from its parent activity
      2. **What you can do**: Final cleanup.

---
**Fragment Lifecycle Flow**
1. Created -> onAttach() -> onCreate() -> onCreateView() -> onActivityCreated() -> onStart() -> onResume()
2. When the fragment is no longer visible, it follows this flow:
- onPause() -> onStop() -> onDestroyView() -> onDestroy() -> onDetach()

### Assignment
- On the tab navigation application, for the red, green and blue fragments -> try to add UI and get it working. 
- SEnd more arguments from first fragment to the second.

### Navigation Components (android)
- Core Components
  - **Navigation Graph (NavGraph)**:
    - The naigation graph is an XML file that defines all the destinations (Fragments / activities) and actions (transitions) in the app. 
  - **NavController**:
    - Manages navigation with in the app, controlling the back stack and executing navigation actions. 
  - **NavHostFragment**:
    - A container that hosts the fragments and manages the navigation within it. 
[Link to the official Documentation](https://developer.android.com/guide/navigation)

### assignments
- Please explore `Master-detail` flow [Link](https://developer.android.com/training/tv/playback/leanback/details)
- Please explore `Navigaion-drawer` [Link](https://developer.android.com/guide/navigation/integrations/ui)

### Firebase
Firebase is a platform developed by Google that provides various tools and services to help developers build high quality apps, increase user engagement and scale effortlessly. In includes variety of products that can help with things like authentication, analytics, databases, cloud storage and more. 

**Key Features of Firebase**:
- **Firebase authentication:** Simplifies the process of authentication by providing ready to use SDKs for authentication using passwords, phone numbers, Google, Facebook, Linkedin and more. 
- **Firebase Realtime database:** A NoSQL database that allows real-time data synching between the clients and the server.
- **Cloud Firestore:** A flexible, scalable database for app development that is newer than Realtime Databases, with more advanced querying capabilities.
- **Firebase Cloud Messaging(FCM):** A service for sending notifications to your users on ios, android and the web.
- **Firebase Analytics:** Provides detailed insights into your app's user behavior. 
- **Firebase Cloud Functions:** Allows you to run backend code in response to events triggered by firebase features. 

**Relevant Links**
- [Firebase Official Documentation](https://firebase.google.com/)
- [Firebase Friendly chat codelab](https://firebase.google.com/codelabs/firebase-android#0)
- [Firebase real time databases](https://firebase.google.com/docs/database)

### Firebase real time databases
Firebase realtime database is one of the core products of firebase, and it allows you to store and sync data between your users in real time. 

**How Firebase RTDB(Real time database) Works ?**
- **NoSQL Database:** It stores data as JSON tree, which is different from traditional row-coloumn databases. This is great for hierarchical data. 
- **Real Time Synchronization:** Data is synchronized across all clients connected to the database in real time. This is ideal for apps that requires instantaneous data updates, such as chat apps or collaborative tools. 
- **Offine Support:** Firebase RTDB has built in support for offline data access. Data changes are saved locally and synchronized with the server when connnectivity is restored. 

### Room Databases in Android
- Room is not seperate database. It is based on SQLite only. But this is an abstract layer built on top of SQLite using ORM (Object Relational Mapping). This simplifies the use of databases in your android apps.

[Official Room doc](https://developer.android.com/training/data-storage/room)

**Components in Room Database:**
- Entity
  - This is a class in which you will represent the entire database table. 
  - class name = table name
  - variable name = column names
- DAO (database access object)
  - This is an Interface and by delaring the methods, the SQL queries are auto generated in the background. 
- RoomDatabase 
  - This is an entry abstract class where database trasactions can be started. 

Do not forget to add `id("kotlin-kapt")` in the plugins section of `build.gradle (app:Module)`

#### Assignment
- Try completing the [code lab](https://developer.android.com/codelabs/android-room-with-a-view-kotlin#0)
- Try adding functionality for delete operation.
- Try using App Inspector tool for network requests (You can use old projects and see how the get & Post requests are working)


### [DataStore](https://developer.android.com/topic/libraries/architecture/datastore)
DataStore is part android jetpack components. It is the official replacement of Shared Preferences. 
- It is a data storage solution in Android
- Provides a simple, efficient and safe way to store key-value pairs and structured data.
- Offers two types of Data Stores:
  - **Preferences Data Store:**
    - used for storing simple Key-value pairs
  - **Proto Data Store:**
    - Used for storing complex data in a structured way using [protocol buffers](https://protobuf.dev/).
  - **Key Features**
    - **Asynchronous:** Data store operations are perfromed Asynchornously, making it suitable for modren android development practices.
    - **Type-Safe:** Data store uses kotlin;s type system to ensure that the data is stored and retrieved in a type-safe manner using protocol buffers. 
    - **Built on Kotlin Coroutines:** It leverages the kotlin coroutines for asynchronous programming, making it easier to read and maintain data. 
  
#### Assignment
Please explore Protocol buffers

### Jetpack UI compose
- A modren ui toolkit to build User Interfaces on android using kotlin.
- Declarative approach to create ui screens that are less error prone, easy to debug and maintain, reduces boilerplate.

#### Resources 
- Introduction to JetPackUI compose [slides](https://docs.google.com/presentation/d/1PhChTOt0D7n8cRZ4czL9nhFRjATRQWhHPTN9p-pgq9w/edit?usp=sharing)
- Jepack UI Compose Course from [developers.android.com](https://developer.android.com/courses/jetpack-compose/course)
- Try [this](https://developer.android.com/develop/ui/compose/layouts/basics#:~:text=Use%20Column%20to%20place%20items%20vertically%20on%20the%20screen.&text=Similarly%2C%20use%20Row%20to%20place,of%20the%20elements%20they%20contain.&text=Use%20Box%20to%20put%20elements%20on%20top%20of%20another.) tutorial as well 

#### Assignment
In the `Favorite Movies JUC` app, get the items clicks listened. 

### Coroutines

Co - Cooperative  
Routine - Function   

#### What are Coroutines ?
- If we have multiple long running tasks, you create multiple threads for each of them. When there are multiple threads in the background, the system may run `Out Of Memory`. We can create a single background thread and create multiple coroutines to perform the multiple background operations. By Using memory that is required for running one single thread, we can handle multiple background tasks.

- Light-weight threads
- Like threads, coroutines can run in parllel, wait for each other and communicate with each other
- coroutines != thread
- Coroutines are cheap (in terms of memory)
- you can create thousands of coroutines without any memory issues. 

#### Simple Program 
```kotlin
import kotlin.concurrent.thread

fun main() {
    println("Current thread : ${Thread.currentThread().name}")

    thread{
        // Now you have created a thread
        // Let's fake some work here
        Thread.sleep(1000)
        println("This runs in ${Thread.currentThread().name}")
    }
}
```

Note: Threads run in parallel.

#### Coroutine Example
```kotlin
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    println("Current thread : ${Thread.currentThread().name}")

    // launch is one of the corotuines builder
   GlobalScope.launch {
       println("Current thread : ${Thread.currentThread().name}")
       Thread.sleep(1000)
       println("Current thread : ${Thread.currentThread().name}")
   }

    GlobalScope.launch {
        println("Current thread : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Current thread : ${Thread.currentThread().name}")
    }

    Thread.sleep(3000)
}
```

#### delay() vs Thread.sleep()
- Thread.sleep(1000) -> blocks the thread for 1 second. Now, the thread gets lazy.
- delay(1000) -> Only suspened the corotuine for 1 second.
  - this is not going to block the thread at all.
  - While your current coroutine is suspened, the other corotuines can still run on the same thread. 

```kotlin
package com.nareshtech.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    println("Current thread : ${Thread.currentThread().name}")

    // launch is one of the corotuines builder
   GlobalScope.launch {
       println("Current thread : ${Thread.currentThread().name}")
       delay(1000) // This is just suspending the coroutine for 1 sec.
       // Its not blocking the thread
       println("Current thread : ${Thread.currentThread().name}")
   }

    GlobalScope.launch {
        println("Current thread : ${Thread.currentThread().name}")
        delay(1000)
        println("Current thread : ${Thread.currentThread().name}")
    }

    Thread.sleep(3000)
}
```

#### Suspend Modifier
- A function with `suspend` modifier is known as suspending function. 
- Suspending function can only be called from a corotuine context or from another suspending function. 
- They cannot be called from outside the corotuine context. 
- `delay(...)` is a suspending function. 

If you want to block the thread on which the corotuine is running, you can use a coroutine builder called `runBlocking`

```kotlin
runBlocking{
  delay(3000)
}
```

```kotlin
package com.nareshtech.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Coroutine runs on ${Thread.currentThread().name}")
        GlobalScope.launch {
            println("Coroutine runs on ${Thread.currentThread().name}")
            delay(1000)
        }

        delayForSometime(2000)
        println("Coroutine runs on ${Thread.currentThread().name}")
    }
}

suspend fun delayForSometime(i:Long){
    delay(i)
}
```

#### Coroutine builders

Functions that are used to create corotuines are called coroutine builders

##### Most important functions to create a coroutines.
1. launch 
   - GlobalScope.launch{}
     - Creates a coroutine at global (app) level which can survive the entire lifecycle of an app. 
   - launch{}
     - Creates a coroutine in local scope. Meaning, the corotuine created throguh this scope gets destroyed with in the activity. 
   - This corotuine never blocks the thread in which it is running. 
   - Launch corotuine is also called as `Fire and Forget`
   - Launchs a new coroutine without blocking the current thread.
     - Inherits the thread & Corotuine scope of the immediate parent coroutine.
   - launch returns a reference to `Job` object.
   - Using this `Job` Object, you can cancel or wait for the coroutine to finish. 
2. async
   - GlobalScope.async{}
     - Creates a Coroutine in global scope (app level)
   - async{}
     - Creates a coroutine in local scope
   - You can return a value after the execution of code from async coroutine where it is not possible to return a value from a launch coroutine. 
   - Never blocks the thread. 
   - Async returns a DefferedJob Object in which we get to have data, we can also cancel the corotuine or wait for it to return data and finish. 
3. runBlocking

[Official docs](https://developer.android.com/kotlin/coroutines)

In Android, Coroutine Dispatchers are essential in managing which threads coroutines run on. 
Dispatchers control the context where a coroutine will execute, allowing you to specify whether it should run on main thread, a background thread, or a custom thread pool. 

1. Dispatchers.Main
   - **Purpose**: Runs on Main (UI) Thread
   - **Usecase**: Any work that needs to interact with the UI, such as updating Views or handling user interactions, should run on this Dispatcher
   - 
   ```kotlin
   GlobalScope.launch(Dispatchers.Main){
    // Update the UI or respond to user interaction
   }
   ```
2. Dispatchers.Io
   - **Purpose**: Optimized for I/O tasks like reading from or writing to a database or file, and for network requests.
   - **Usecase**: Suitable for operations that involve data handling but should not block the main thread.
   - 
   ```kotlin
   GlobalScope.launch(Dispatchers.IO){
    // Perfrom some network request
    val data = fetchDataFromNetwork()
    withContext(Dispatchers.Main){
      // Update the UI
    }
   }
   ```
3. Dispatchers.Default
   - **Purpose**: Optimized for CPU-Intensitve work, like complex caluclations, sorting, and processing large data sets. 
   - **Usecase**: Use this when you have tasks that require significant processing power but don't need immediate UI updates
   - 
   ```kotlin
   GlobalScope.launch(Dispatchers.Default){
    val result = performHeavyCalculation() // cpu-intensive task
    withContext(Dispatchers.Main){
      // Update UI
    }
   }
   ```
4. Dispatchers.Unconfined
   - **Purpose**: Stars the coroutine in the caller's thread and only switches context if it suspends. After the suspension, it resumes in the thread where it started. 
   - **Usecase**: This is rarely used in android. It is useful for tasks that don't require a specific thread or dispatcher, but its generally recommended to stick with other dispatchers for predictable behavior. 

### Services in Android
*A Service is an application component that can perform long-running operations in the background. It does not provide a user interface. Once started, a service might continue running for some time, even after the user switches to another application. Additionally, a component can bind to a service to interact with it and even perform interprocess communication (IPC). For example, a service can handle network transactions, play music, perform file I/O, or interact with a content provider, all from the background.*

***Caution: A service runs in the main thread of its hosting process; the service does not create its own thread and does not run in a separate process unless you specify otherwise. You should run any blocking operations on a separate thread within the service to avoid Application Not Responding (ANR) errors.***

#### Three Types of Services
1. **Foreground Service**
   - A kind of service that notifies the user about its running through a notification. 
   - When you use a foreground service, you must display a notification so that the users are actively aware that the service is running. This notification cannot be dismissed unless the service is either stopped or removed from the foreground. 
2. **Background Service**
   - A background service performs an operation that is not directly noticed to the user. For Example, if an app used a service to compact its storage, that would usually be a background service. 
3. **Bound Service**
   - A service is bound when an application component binds to it by calling `bindService()`. A Bound service offers client server interface that allows components to interact with the service, send requests and even do so across the processes leading to Interprocess communication (IPC).

[Official Documentation](https://developer.android.com/develop/background-work/services)

#### Important Methods in Services

***onStartCommand(...)***
- The System invokes this method by calling `startService()` when another component (such as an Activity) requests that the service be started.
- When this method executes, the service is started and can run in the background indefinitely. 
- If you implement this, It is your responsibility to stop the service when its work is complete by calling `stopSelf(..)` [with in the service class] or `stopService(...)`.
- If you only want to provide binding [for bound services], you don't need to implement this method. 

***onBind(...)***
- The system invokes this method by calling `bindService(...)` when another app component want to bind with the service (to perform RPC). 
- In your implementation of this method, you must provide an interface that clients use to communicate with the service by returning an IBinder.
- You must always implement this method; However, if you don't want to allow binding you should return null. 

***onCreate(...)***
- The system invokes this method to perfrom one-time setup procedures when the service is initially created (before it calls either the onStartCommand(...) or onBind(...))
- If the service is already running, this method is not called. 

***onDestroy(...)***
- The system invokes this method when the service is no longer used and is being destroyed. 
- Your service should implement this method to clean up any resources such as threads, registered listeners, or Receivers. 
- This is the last call that the service receives.

[Media player Android](https://developer.android.com/media/platform/mediaplayer)
[Media 3 Exo Player android](https://developer.android.com/media/media3/exoplayer)

[Learn about the constants returned from onStartCommand(...)](https://developer.android.com/reference/android/app/Service#START_STICKY)


#### Testing in Android
When you implemented your first feature in android app, you ran your application on a physical device and also sometimes on emulator to verify the code works & works as expected. This means you already tested an application, albeit a manual test.

**Types of Tests**
- **Functional Testing**: Does my app do what it's supposed to do ?
- **Performance Testing**: Does it do it quickly and efficiently?
- **Accessibility Testing**: Does it work well with Accessibility services ?
  
**scope**  
Tests also vary depending on the size, or degree of isolation
- **Unit tests**: these can also be called as **Small tests**. These tests will only verify a small portion of your application such as a method or a class. 
- **End to End Tests**: We may test the entire screen or user flow. 
- **Integration Tests:** these are medium tests where it happens between two or more unit tests.

**We shall look into two tests in Android using kotlin**  
- **Unit Testing**: Tests the logic without involving the android framework.
- **UI Testing with Espresso**: Ensures the UI behaves as expected, testing user Interactions like entering text and pressing buttons. 

[Documentation](https://developer.android.com/training/testing/fundamentals)  
[Explore Mockito](https://site.mockito.org/)  
[Try to use Google's Roboelectric](https://site.mockito.org/)  


**Build Flavours**

you can make the same available in multiple flavors such as (free & Paid). 
you need not to create two different projects and everything can be done under one single project using build flavors. 

**To create the build flavors:**

```groovy
 flavorDimensions += "version"
    productFlavors {
        create("demo") {
            // Assigns this product flavor to the "version" flavor dimension.
            // If you are using only one dimension, this property is optional,
            // and the plugin automatically assigns all the module's flavors to
            // that dimension.
            dimension = "version"
            applicationIdSuffix = ".demo"
            versionNameSuffix = "-demo"
        }
        create("full") {
            dimension = "version"
            applicationIdSuffix = ".full"
            versionNameSuffix = "-full"
        }
    }
  ```

  The above code adds two flavors namely, demo & full. 
  Full version can have additional features and they can be built under the same project. 

  




### Types of Location Access in Android
In Android, You can control location access in different ways, allowing users to choose how and when the app can access their location:

1. **Allow Only while using the app**
   - Also know as "While-In-Use" or "foreground-only" access
   - Added in android 10.
   - Allows location access only when the app is actively used. 
2. **Allow One-time**
   - Grants location access for single session. When the user closes the app, access is revoked. 
3. **Allow All the Time**
   - Provides the background access to the user;s location at any time.
   - **Note:** Your app must comply with [Google's Location Policies](https://support.google.com/googleplay/android-developer/answer/9799150?hl=en) for background location access.
4. **Deny**
   - The user can deny location access, preventing the app from accessing the location data. 

---

### Location Providers in Android

Primarily android uses two location providers

1. **NETWORK_PROVIDER**
   - Retrives location based on cell-towers, Wi-Fi, and other network signals.
   - Require `ACCESS_COARSE_LOCATION` permission. 
2. **GPS_PROVIDER**
   - Provides location data based on satellite signals for high accuracy.
   - Require `ACCESS_FINE_LOCATION` permission. 

your app can access supported location services using classes in `com.google.android.gms.location` package. 

---

### Key classes for Location in Android
1. **FusedLocationProviderClient**
   - The central component of the Location Framework.
   - Use this class to request location updates and retrive the last known location. 
2. **LocationRequest**
   - A data object containing parameters like update intervals, priority, and accuracy.
   - Pass this object to `FusedLocationProviderClient` to specify the conditions for location updates. 
3. **LocationCallback**
   - Used to retrieve notifications when the device's location changes or becomes unavailable. 
   - Pass this as callback to `LocationResult` to capture and handle location data.

---
### The End
---