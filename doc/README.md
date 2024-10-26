# **Music Library Management System**

## **Project Specifications and Sample Output**

---

## **Project Overview**

The Music Library Management System is a Java-based application designed to organize and manage song libraries efficiently. It supports the creation of song catalogues or playlists and offers navigation features such as moving to the previous or next song, as well as shuffle play. The system is designed for artists (both solo artists and bands), with songs that can be either singles or part of albums.

---

## **Functional Requirements**

### **1. Song and Artist Management**

- **Artists:**
  - The application supports artists, which can be **bands or solo artists**.

- **Songs:**
  - Each artist can have **multiple songs**, which can either be **singles** or part of an **album**.

- **Song and Artist Input:**
  - For each song and/or artist, users must specify:
    - **Song Title** (e.g., Gods Plan, Family Ties).
    - **Artist Name** (e.g., Drake, Kendrick Lamar).
    - **Album Name** (e.g., Scorpion, The Melodic Blue)
    - **Duration:** **minutes:seconds**.
    - **Release Year:** **DD/MM/YYYY**.

### **2. Playlist Creation and Management**

- **Create Playlist:**
  - Users can create custom **playlists** from songs in the library.

- **Navigation within Playlists:**
  - The system provides the ability to:
    - **Move to the next song**
    - **Go back to the previous song**
    - **Restart the playlist** after reaching the end.

### **3. Shuffle Play**

- **Random Song Playback:**
  - The application offers a **shuffle play** feature, allowing users to listen to songs in a random order within a playlist.

### **4. Play History**

- **Track History:**
  - The system maintains a **play history**, showing the most recently played songs and the order in which they were played.

### **5. Library Organization**

- **Filter and Search:**
  - Users can **filter songs** by artist, album, or year.
  - The system also provides a **search function** for quickly locating specific songs or albums.

- **Sorting Options:**
  - Songs can be **sorted** by title, artist, album, or release year.

### **6. Library Output**
  - The library is outputted in **CSV (Comma-Separated Values)** format for easy readability and compatibility with Office and Google applications.

---

## **Non-Functional Requirements**

### **1. Persistence and Compatibility**

- **CSV Format:**
  - Song libraries and playlists can be exported to and imported from **CSV (Comma-Separated Values)** format, ensuring compatibility with spreadsheet applications like Microsoft Excel and Google Sheets.

### **2. Performance and Scalability**

- **Efficient Searching and Sorting:**
  - The system should efficiently handle libraries with a **large number of songs**, ensuring quick searches, filtering, and sorting.

- **Responsive Playback:**
  - Playback features, such as moving between songs and shuffle play, should be fast and seamless, even with extensive playlists.

### **3. Flexibility and Maintainability**

- **Modular Design:**
  - The application is designed with **a modular structure**, making it easy to extend and maintain.

- **Dynamic Adjustment:**
  - Users can modify playlists and add new songs to the library dynamically, without needing to restart the application.

### **4. Error Handling and Validation**

- **Input Validation:**
  - The system checks for **valid input values** (e.g., valid song duration, non-empty titles, valid file formats).

- **Conflict Resolution:**
  - Provides **error messages and feedback** when incorrect inputs or duplicate songs are detected.

### **5. Documentation and Usability**

- **Comprehensive Documentation:**
  - The application includes a **user guide** for managing songs, playlists, and playback features, as well as a **developer guide** detailing code structure and extension points.

- **User-Friendly Interface:**
  - Although no GUI is required, the application ensures clear and intuitive command-line interactions for ease of use.

---

## **Technical Specifications**

### **1. Programming Language and Environment**

- **Language:**
  - Developed using **Java SE 11 or higher**.

- **Development Tools:**
  - Utilizes **Maven or Gradle** for project management and dependency handling.
  - **JUnit** framework employed for testing purposes.

### **2. Data Structures**

- **Song and Artist Representation:**
  - Songs, artists, and albums are represented as **objects** containing relevant metadata (e.g., title, artist, duration).

- **Library and Playlist Management:**
  - **Collections** (such as Lists and Maps) are used to organize songs, artists, and playlists efficiently.

### **3. Algorithms and Logic**

- **Navigation Logic:**
  - Provides a simple way to **navigate** through playlists:
    - Sequential playback: next and previous song.
    - Shuffle playback: random order within a playlist.

- **Sorting and Filtering Logic:**
  - Implements efficient sorting algorithms to allow songs to be ordered by various criteria (e.g., by title, artist, or release year).

### **4. Testing and Quality Assurance**

- **Unit Testing:**
  - Thorough unit tests are implemented for:
    - **Song metadata validation**
    - **Playlist management**
    - **Shuffle play and sequential navigation**

- **Integration Testing:**
  - Ensures that the system integrates smoothly with file handling and persistent data storage.

- **CSV Validation:**
  - Verifies that generated CSV files adhere to correct formatting and are **readable by standard software**.

### **5. Documentation**

- **Code Documentation:**
  - All classes and methods are documented using **Javadoc** for clarity and ease of maintenance.

- **User Guide:**
  - A step-by-step guide is included, detailing how to create, manage, and navigate playlists and song libraries.

- **Developer Guide:**
  - The developer guide covers system architecture, design decisions, and how to extend the system.

---

## **Project Milestones**

### **Milestone 1: Core Functionality Implementation**

- **Duration:** 2 Weeks
- **Deliverables:**
  - Implementation of song and artist data structures.
  - Basic playlist creation and navigation functionality.

### **Milestone 2: Scheduling and Conflict Management**

- **Duration:** 2 Weeks
- **Deliverables:**
  - Development of the shuffle play functionality.
  - Implement sequential song navigation (next and previous song).

### **Milestone 3: CSV Output and Persistence**

- **Duration:** 2 Weeks
- **Deliverables:**
  - Add the ability to save and load song libraries and playlists in CSV format.
  - Ensure compatibility with standard spreadsheet applications.

### **Milestone 4: Testing and Optimization**

- **Duration:** 2 Weeks
- **Deliverables:**
  - Comprehensive testing of song navigation, shuffle play, and CSV functionality.
  - Optimize performance for large song libraries.

### **Milestone 5: Documentation and Finalization**

- **Duration:** 1 Week
- **Deliverables:**
  - Completion of user and developer documentation.
  - Final review, bug fixes, and project submission.

---

## **Sample CSV Output**

Below is a sample library and playlist export in CSV format, demonstrating how the data is structured.

### **Sample Library**

#### **Playlist Export:**
**Song Title,Artist Name,Album Name,Duration,Release Year**

```csv
"Bohemian Rhapsody",Queen,"A Night at the Opera",5:55,1975
"Billie Jean",Michael Jackson,"Thriller",4:54,1982
"Smells Like Teen Spirit",Nirvana,"Nevermind",5:01,1991
"Wonderwall",Oasis,"(What's the Story) Morning Glory?",4:18,1995
"Imagine",John Lennon,"Imagine",3:04,1971
```

### **Explanation of Schedule:**

- Each row represents a **song**, with columns for:
    - **Song Title**
    - **Artist Name**
    - **Album Name**
    - **Duration**
    - **Release Year**

- **"Bohemian Rhapsody":**
  - **Queen:** The artist name is Queen.
  - **"A Night at the Opera":** The album is "A Night at the Opera".
  - **5:55:** The song goes for 5 minutes and 55 seconds.
  - **1975:** The song was released in 1975.

  - **"Billie Jean":**
  - **Michael Jackson:** The artist name is Michael Jackson.
  - **"Thriller":** The album is "Thriller".
  - **4:54:** The song goes for 4 minutes and 54 seconds.
  - **1982:** The song was released in 1982.

  - **"Smells Like Teen Spirit":**
  - **Nirvana:** The artist name is Nirvana.
  - **"Nevermind":** The album is "Nevermind".
  - **5:01:** The song goes for 5 minutes and 01 seconds.
  - **1991:** The song was released in 1991.

  - **"Wonderwall":**
  - **Oasis:** The artist name is Oasis.
  - **"(What's the Story) Morning Glory?":** The album is "(What's the Story) Morning Glory?".
  - **4:18:** The song goes for 4 minutes and 18 seconds.
  - **1995:** The song was released in 1995.

  - **"Imagine":**
  - **John Lennon:** The artist name is John Lennon.
  - **"Imagine":** The album is "Imagine".
  - **3:04:** The song goes for 3 minutes and 04 seconds.
  - **1971:** The song was released in 1971.

### **Usage of CSV Output:**

- **Importing to Applications::**
  - The CSV file can be easily imported into spreadsheet applications like **Microsoft Excel** or **Google Sheets** for further customization or analysis.

- **Data Sharing:**
  - Users can share their song libraries and playlists in a standardized CSV format, making it easy to collaborate or exchange data with others.

---

## **Conclusion**

The Music Library Management System is a powerful yet user-friendly application designed to help users organize and enjoy their music collections. With features like playlist creation, shuffle play, and seamless navigation, the system offers a streamlined experience for managing songs, albums, and artists.

---

## **Next Steps**

- **Development:**
  - Set up the project repository and development environment.

- **Requirement Review:**
  - Finalize functional requirements and gather feedback.

- **Progress Tracking:**
  - Use GitHub to track progress through different milestones.

- **Feedback and Iteration:**
  - Incorporate feedback during development to ensure the system meets user needs.
  
---