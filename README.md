<h1>Android Hotel Search Application</h1>
<p>This Android application communicates with Hotels.com API to display a list of hotels based on user input and a detailed view of a selected hotel. The application is built using Kotlin, with MVVM architectural pattern design, Kodein for dependency injection, and Coroutines for asynchronous calls, making it efficient.</p>
<h2>MVVM Architecture Pattern</h2>
<p>MVVM stands for Model-View-ViewModel. It is an architectural pattern that separates the presentation layer from the business logic layer, which makes the application easier to maintain and test. The three main components of the MVVM architecture are:</p>
<ul>
  <li>Model: It represents the data and the business logic layer of the application.</li>
  <li>View: It represents the UI of the application that the user interacts with.</li>
  <li>ViewModel: It acts as a mediator between the Model and View, providing data to the View and updating the Model based on the user's interactions.</li>
</ul>
<h2>Dependency Injection using Kodein</h2>
<p>Kodein is a dependency injection framework for Kotlin that provides an easy way to manage dependencies in an Android application. It helps to decouple components, making them more testable and maintainable. The Kodein framework is used in this application to manage dependencies between classes.</p>
<h2>Central Repository for Single Source of Truth</h2>
<p>A central repository is used in this application to provide a single source of truth for the data. This makes it easier to add databases in the future and to keep the data consistent across different parts of the application.</p>
<h2>Efficient Coroutines</h2>
<p>Coroutines are used in this application to make synchronous calls and to make the application more efficient. Coroutines help to manage the threads efficiently, which results in better performance and responsiveness.</p>
<h2>ViewBinding and DataBinding</h2>
<p>ViewBinding is used throughout the application to bind views to variables, making it easier to access views in the code. DataBinding is used at some parts of the project to bind data to views, making it easier to update the UI based on the data changes.</p>
<h2>Conclusion</h2>
<p>Overall, this Android application is built using the best practices and the latest technologies, making it efficient, maintainable, and scalable. The MVVM architecture pattern, Kodein dependency injection, central repository, efficient Coroutines, and ViewBinding/DataBinding are some of the key features that make this application stand out.</p>

![Screenshot1](https://github.com/nehalchaturvedi/HotelSearch/blob/master/ss1.png?raw=true)
![Screenshot1](https://github.com/nehalchaturvedi/HotelSearch/blob/master/ss2.png?raw=true)



