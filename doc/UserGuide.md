# **User Guide**
## **Overview** 

The Music Library Management System allows users to manage a collection of songs. Users can add songs, save their library to a CSV file, and load it back from the file. Each song contains information such as the title, artist, album, duration, and release year.

--

## **Features**

- **Add Songs:** 
    - Users can add songs to the library, including details like title, artist, album, duration, and release year.

- **Save Library:** 
    - Users can save the current song library to a CSV file for persistent storage.

- **Load Library:** 
    - Users can load a previously saved song library from a CSV file.

- **View Songs:** 
    - Users can view all songs in the library after loading.

## **Getting Started**

### **Prerequisites**

- Java Development Kit (JDK) installed on your machine (version 8 or higher).
- Visual Studio Code (VSC).
- Ensure **JUnit-platform-console-standalone-1.7.2.jar** is located in the **lib** directory. 

### **Running the Application**

1. Clone the Repository: Download the source code to your local machine.
2. Open in VSC: Open the project Visual Studio Code.
3. Compile the Code: Ensure all files are compiled without errors.
4. Run the Application: Execute the Client class to start the program.
5. Follow the Prompts: Interact with the console to add songs and manage your library.

### **Sample Usage**

1. The application will prompt you to enter a filename for saving your library. Enter a valid filename (e.g., library.csv).
2. After saving, the application will load the library from the specified CSV file and display all songs.