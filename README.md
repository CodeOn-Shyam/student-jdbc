# Student JDBC – Console-based Student Management System  
*A simple CLI app built in Java, using JDBC (with H2 database) to perform basic CRUD operations on student data.*

## 🧑‍💻 Overview  
This project is a lightweight Student Management System developed in Java. It uses JDBC to connect to an embedded H2 database and allows for **Create**, **Read**, **Update**, and **Delete** (CRUD) operations on student records.  
It’s designed to demonstrate core Java, OOP, JDBC fundamentals and database interaction from a console interface.

## 🚀 Features  
- Add a new student record (e.g., name, roll number, department, scoring)  
- Display student details (all or by specific ID/roll)  
- Update existing student information  
- Delete a student record  
- Uses embedded H2 database (no external DB server required)  
- Clear code structure: service layer, DAO layer, entity/model, JDBC utils  

## 🧱 Architecture & Tech Stack  
- **Language**: Java (SE)  
- **Database**: H2 (embedded/in-memory or file-based)  
- **Data Access**: JDBC (Java Database Connectivity)  
- **Build tool**: Maven (`pom.xml`)  
- **Project structure**:  
  - `src/` — Java source files  
  - `.idea/` — IDE settings (optional)  
  - `pom.xml` — Maven configuration  
  - `.gitignore` — ignore IDE / build artefacts  

## 🛠️ Setup & Running the Application  
### Prerequisites  
- Java 8+ installed  
- Maven installed (or use IDE built-in Maven support)  

### Steps  
1. Clone the repository:  
   ```bash
   git clone https://github.com/CodeOn-Shyam/student-jdbc.git
   cd student-jdbc
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:

   ```bash
   mvn exec:java -Dexec.mainClass="com.example.Main"  # Adjust main class path if different
   ```
   Or launch it from your IDE by running the `Main` (or equivalent) class.
4. Use the console menu to perform CRUD operations on student records.
5. The H2 database is by default embedded; you can optionally configure file-based persistence or switch to another DB by changing JDBC URL in `JdbcUtil` (or similar).
   
## What You’ll Learn

* How to set up and use JDBC for database operations
* How to design a simple DAO (Data Access Object) layer
* How to separate concerns in a console-based Java application (entity/model, DAO, service, UI)
* Basics of using H2 database (embedded mode)
* Maven project setup and dependency management

## 🔧 Extending This Project

To make this more robust or ready for production, you might:

* Introduce proper logging (e.g., `SLF4J`, `Log4j`)
* Add input validation and error handling
* Use a real relational DB (MySQL, PostgreSQL) instead of H2
* Create a GUI or web front-end (e.g., JavaFX, Spring MVC)
* Add unit tests (e.g., JUnit, Mockito) for DAO and service layers
* Use connection pooling (e.g., HikariCP) for better performance
* Use an ORM like Hibernate or JPA for more abstraction

## 📂 Project Structure

```
student-jdbc/
├── .idea/              # IDE configuration (optional)
├── src/
│   └── main/java/
│       ├── entity/     # Student model classes
│       ├── dao/        # Data Access Objects
│       ├── service/    # Business logic layer
│       ├── util/       # JDBC utility, connection setup
│       └── Main.java   # Entry point for console UI
├── pom.xml             # Maven build and dependencies
└── .gitignore
```

## ✅ Contributing

If you’d like to contribute improvements — new features, refactoring, bug-fixes — you’re very welcome!

* Fork the repository
* Create a new branch (`git checkout -b feature/YourFeature`)
* Commit your changes (`git commit -m "Add <YourFeature>"`)
* Push to your branch (`git push origin feature/YourFeature`)
* Open a Pull Request detailing your changes

## 📄 License

This project is shared under the **MIT License** (or whichever license you prefer). See [LICENSE](LICENSE) for details.

## 👤 About the Author

**Shyam Pathuri** — Final-year B.Tech (ECE), passionate about cloud computing, programming, and cybersecurity.
Feel free to connect on [LinkedIn](https://www.linkedin.com/in/pathuri-shyam-2a0555327) or send me an email at **[shyampathuri3@gmail.com](mailto:shyampathuri3@gmail.com)**.

---
*Happy coding! ✨*
