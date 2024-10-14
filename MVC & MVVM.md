### MVC - Model View Controller
### MVVM - Model View ViewModel

**MVC and MVVM are architectural Patterns used in Software development to seperate concerns and manage code organization. Both are popular in android development however they differ in how they manage the flow of data and the user interaction.** 

***Architectural Patterns provide a template or structuring and organizing code and components in a way that improve the system's maintainability***

## MVC
Components
- **Model**
  - Represents the data and the business logic of the application
  - It is also responsible for handling the data-related operations, such as fetching data from database or an API.
- **View**
  - The UI that displays data to the user is called the view.
  - It is responsible for rendering the UI components and displaying data to the world from the Model. 
- **Controller**
  - Acts as an intermediary between the model and the view. 
  - It processes the user inputs, updates the model, and determines which view should be displayed. 

![](/mvc.png)

**Example** In an android app, the view could be an activity or a fragment, the model could be a data class or a repository managing the data and the controller could be a class that handles the user input and is reponsible for updating the UI.

## MVVM
Components
- **Model**
  - Similar to MVC, it represents the data and the business logic of the app. 
- **View**
  - The user interface, which is typically an activity or a fragment in the app. 
- **ViewModel**
  - An Intermediary that holds the ui logic and data needed for the View. It communicates with the model and prepares observable data for the views. 

![](/mvvm.png)

**Example** In an android applicaiton, the view could be your activity or fragment, the model is the data repo or the data classes or other data sources. The view model is a class that holds LiveData or other Observable types, these view observers observe if there are any changes in the data and if there are any, it notifies the view and updates it. 

**Key Differences**

Difference|MVC|MVVM
---|---|---
Seperation of Concern|The controller often contains a mid of UI and business logic, making it less seperated| The view Model contains the UI Logic, and the model contains the business logic, providing a clearer seperation
DataBinding| not Supported in MVC, the view and controller must manually update each other| Often uses data binding libraries like adroid Data binding or Jetpack's View Model and LiveData which allow automatic updates of the UI when data changes
Testibility| Testing can be challenging because the UI and business logic are not clearly seperated | Relatively easier to test as ViewModel can be tested independent of the UI
Observer Pattern| Changes in the model are often propagated to the view manually | The viewModel can use observable data to automatically notify the view of changes happening to the data

---

**Conclusion:**  MVC and MVVM are both effective in managing the complexity of the application. MVC is simpler and more straight forward, but MVVM offers better seperation of concerns and support for data binding making it more modern and flexible choice. 

### ViewBinding in Android 
- ViewBinding is a library in android that generates binding classes for XML Layouts, providing a type-safe way to access views directly, eliminating the need of `findViewByID(...)`. 
- It improves code readability and reduces the chances of runtime errors due to invalid view access. 

**Key Features**  
- **Type Safety**: Provides a direct reference to views in your XML layout, reducing the need for `findViewByID(...)` and avoiding nullability issues.
- **Compile-Time Efficiency**: Generates binding classes at compile time, so you only access views that exists, reducing the chances of runtime errors.
- **[Avoiding Boilerplate code](https://en.wikipedia.org/wiki/Boilerplate_code)**: Simplifies code by reducing the number of Boilerplate codes and eliminates type casting. 
- **Lightweight and Faster**: Works faster than the conventional `findViewByID(...)` as it uses generated classes directly.

## ViewModel in Android
The ViewModel class in Android is a part of Android Architecuture Components. It is designed to store and manage UI related data in lifecycle concious way, which allows data to survive configuration changes, such as screen rotations

**Key Features**

- **Lifecycle-awareness**:ViewModel is tied to the lifecycle of the UI Controller (Activity or Fragment). It is automatically when the UI controller is destroyed permanently. 
- **Data Persistence**: ViewModel retains UI Data across configuration changes like screen rotations, preventing the need to reload data. 
- **Seperation of concerns**: Helps to keep the UI Controller (Activity or Fragment) free from business logic, making the code more modular and easier to test. 

**Point to Note:**
- ViewModel gets created when an object of the class that extends to ViewModel is created. 
- It gets destroyed when we go through `onCleared(...)` of Viewmodel. 
- See the lifecycle picture below

![vm](/vm.png)


- Learn more about ViewBinding [here](https://developer.android.com/topic/libraries/view-binding)
- Learn more about ViewModel [here](https://developer.android.com/topic/libraries/architecture/viewmodel)

## LiveData in Android

- LiveData is an Observable data holder class in Android that is part of Android Architecture components. 
- It is used to hold and manage UI-related data in a lifecycle consious way, meaning it respects the lifecycle of android components like activities and fragments.
- LiveData updates only the active observers(ie., Observers in `STARTED` or `RESUMED` state), ensuring that your app doesn't crash due to unexpected lifecycle changes

**Key Features of LiveData**
- **Lifecycle Awaerness**: 
  - Automatically handles the lifecycle of your app components.
  - Observers are only notified when they are in an active state, reducing memory overload & leaks. 
- **UI Updates**: 
  - Whenever the underlying data changes, UI is automatically updated. 
- **No Manual Lifecycle handling**: 
  - You don't need to manually start or stop observing data; Livedata handles that
- **Data Wrapping**:
  - LiveData can wrap any type of data, such as an integer, string or a custom type.

**Basic Structure**
- **LiveData**: This is read-only. It can be observed but not modified. 
- **MutableLiveData**: This is the mutable form of LiveData that allows data modification and can be observed as well. 

#### Assignment
- We Observed the changes on count variable which is an integer, Observe other primitive data types and also a custom data type of your own. 


