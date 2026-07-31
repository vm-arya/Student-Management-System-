# Student Management System

A simple console-based Student Management System built in Java.  
This project allows you to add, view, search, update, and delete student records using a menu-driven interface.

## Features

- Add new student records.
- View all stored students.
- Search students by roll number.
- Update student name and department.
- Delete student records.
- Prevent duplicate roll numbers.

## Technologies Used

- Java
- Scanner for user input
- ArrayList for in-memory storage

## Project Structure

- `Student` class: Stores student details such as roll number, name, and department.
- `Demo` class: Contains the main menu and CRUD operations.

## How It Works

The program runs in a loop and displays a menu with options.  
User input is taken from the console, and student records are managed in memory during runtime.

## Menu Options

1. Add Student  
2. View Students  
3. Search Student  
4. Update Student  
5. Delete Student  
6. Exit  

## How to Run

### Prerequisites
- Java JDK installed
- A terminal or command prompt

### Steps

1. Save the file as `Main.java`.
2. Open terminal in the project folder.
3. Compile the program:

```bash
javac Main.java
```

4. Run the program:

```bash
java Demo
```

## Example Usage

```text
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter your choice:
```

## Notes

- Data is stored only in memory.
- All records will be lost when the program exits.
- This is a beginner-friendly Java CRUD project.

## Future Improvements

- Save student data to a file or database.
- Add validation for inputs.
- Support sorting and filtering.
- Create a GUI version using Java Swing or JavaFX.

## License

This project is open-source and free to use for learning purposes.
