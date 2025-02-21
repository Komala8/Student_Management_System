## **🎓 Student Management System**
### A Simple Java-Based Student Management System Using OOP, Exception Handling & Multithreading  

---

### **📌 Project Overview**
This **Student Management System** is a console-based Java application that allows users to efficiently manage student records. It follows **Object-Oriented Programming (OOP)** principles, utilizes **Exception Handling** for robust error management, and employs **Multithreading** for handling student data concurrently.

---

### **🚀 Features**
✔ **Student Management**  
- Add new students 📝  
- Remove students ❌  
- View all students 👥  
- Search for a student 🔍  

✔ **Course & Grade Management**  
- Enroll students in courses 📚   

✔ **Concurrency & Exception Handling**  
- Multiple student operations run concurrently using **multithreading**  
- **Exception handling** ensures valid inputs and prevents errors  

---

### **🛠 Technologies Used**
- **Java** (JDK 8+)  
- **OOP Principles** (Encapsulation, Abstraction, Inheritance, Polymorphism)  
- **Exception Handling** (Try-Catch blocks)  
- **Multithreading** (Using Java Threads)  
- **Collections Framework** (ArrayList, HashMap for data storage)  

---

### **📂 Project Structure**
```
📦 StudentManagementSystem  
 ┣ 📜 README.md  
 ┣ 📜 Project.java  
 ┣ 📜 Student.java   
 ┣ 📜 StudentManager.java  
 ┣ 📜 EnrollmentThread.java  
 ┣ 📜 .gitignore  
```

| File Name         | Description |
|-------------------|-------------|
| `Main.java`      | Contains the main method with a **menu-driven** interface for user interaction. |
| `Student.java`   | Represents a **student** object with ID, name, and enrolled courses. |
| `StudentManager.java` | Core **student management logic** (adding/removing students). |
| `EnrollmentThread.java` | Multithreading class that allows concurrent student operations. |

---

### **📥 Installation & Setup**
#### **Step 1: Clone the Repository**
```sh
git clone https://github.com/your-username/StudentManagementSystem.git
cd StudentManagementSystem
```

#### **Step 2: Compile the Java Files**
```sh
javac *.java
```

#### **Step 3: Run the Application**
```sh
java Main
```

---

### **🎮 How to Use?**
1️⃣ **Launch the program.**  
2️⃣ **Choose an option from the menu:**  
   - Add or remove students  
   - Enroll students in courses    
   - Search for student records
3️⃣ **Enter the required details when prompted.**  
4️⃣ **Manage student records efficiently! 🎓**  

---

### **📝 Sample Data (Preloaded in `Main.java`)**
🎓 **Sample Students**  
| Student ID | Name | Age |
|------------|------|----|
| 101        | Alice | 20 |
| 102        | Bob | 21 |
| 103        | Charlie | 19 |
| 104        | David | 22 |
| 105        | Emma | 20 |

📚 **Sample Courses**  
| Course ID | Course Name |
|-----------|------------|
| CS101     | Java Programming |
| CS102     | Data Structures | 
| CS103     | Database Systems | 
| CS104     | Operating Systems | 
| CS105     | Artificial Intelligence | 

---


