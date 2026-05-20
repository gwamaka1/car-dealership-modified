# Car Dealership Application

## Description of the Project

Car Dealership Application is a Java console application that simulates a dealership inventory and contract management system. It allows users to view vehicles, search for vehicles by different filters, add vehicles to inventory, remove vehicles from inventory, and process sales or lease contracts.

The application uses file I/O to load dealership inventory from a CSV file, save updated inventory back to the dealership file, and append completed sale or lease contracts to a contracts file. This project is intended for students and developers learning Java fundamentals such as object-oriented programming, inheritance, abstract classes, interfaces, collections, console input, and file persistence.

The project solves the problem of managing a simple car dealership workflow in a text-based environment without requiring a database or graphical user interface.

## User Stories

- As a dealership user, I want to view all vehicles so that I can see the full inventory.
- As a dealership user, I want to search vehicles by price so that I can find vehicles within a customer’s budget.
- As a dealership user, I want to search vehicles by make and model so that I can quickly find a specific vehicle.
- As a dealership user, I want to search vehicles by year so that I can filter vehicles by age.
- As a dealership user, I want to search vehicles by color so that I can match customer preferences.
- As a dealership user, I want to search vehicles by mileage so that I can compare vehicle usage.
- As a dealership user, I want to search vehicles by type so that I can find cars, trucks, SUVs, or other vehicle types.
- As a dealership user, I want to add a vehicle to inventory so that the dealership records stay updated.
- As a dealership user, I want to remove a vehicle from inventory so that unavailable vehicles are no longer listed.
- As a dealership user, I want to create a sales contract so that a customer can purchase a vehicle.
- As a dealership user, I want to create a lease contract so that a customer can lease a vehicle.
- As a dealership user, I want contracts to be saved to a file so that completed transactions are recorded.
- As a dealership user, I want sold or leased vehicles removed from inventory so that the inventory remains accurate.

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA installed
- Java SDK installed and configured
- A `dealership.csv` file available in the project directory
- A `contracts.csv` file available or created when contracts are saved

### Running the Application in IntelliJ

1. Open IntelliJ IDEA.
2. Select **Open** and navigate to the project folder.
3. Wait for IntelliJ to index the files and configure the project.
4. Find the main class that says Contract
## Technologies Used

- Java: Mention the version you are using.
- Any additional libraries or frameworks used in the project.

## Demo

Include screenshots or GIFs that show your application in action. Use tools like [Giphy Capture](https://giphy.com/apps/giphycapture) to record a GIF of your application.

https://media4.giphy.com/media/v1.Y2lkPTc5MGI3NjExaHZ5dmpwY3hieTBnZ2RraG05Z3ZjZ3czcXdvcGNjNTQ0OGVvdXpoOCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/U3OZcJDiBStrmKVUBC/giphy.gif

## Future Work

Outline potential future enhancements or functionalities you might consider adding:

- Add stronger input validation to prevent errors when users enter invalid menu choices or incorrect data types.
- Add the ability to view saved sales and lease contracts from inside the application.
- Add support for multiple dealership locations while keeping contracts saved in one shared contracts file.
- Improve price and monthly payment formatting so money values display with two decimal places.
- Add reporting features for total sales, leases, and dealership revenue.
- Replace CSV file storage with a lightweight database such as SQLite.

## Resources

List resources such as tutorials, articles, or documentation that helped you during the project.

- Java Documentation
- Java File I/O tutorials
- Java Collections Framework — ArrayList used for vehicle inventory management.
- IntelliJ IDEA
- Class notes and project instructions

## Team Members

- Gwamaka Mwamtobe

## Thanks

Express gratitude towards those who provided help, guidance, or resources:

- Thank you to Raymond for continuous support and guidance.