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





