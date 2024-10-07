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

