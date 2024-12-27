# Software Development Exercises - UE08  

## 📜 Tasks  
This exercise focuses on advanced object-oriented programming concepts in Java, such as inheritance, dynamic binding, and `super` calls. The tasks include:  

### 1. Task Management  
Implement a class hierarchy to manage tasks, including simple tasks, assigned tasks, and repeated assigned tasks.  
- **Classes:** `Task.java`, `AssignedTask.java`, `RepeatedAssignedTask.java`  
- **Additional Classes:** `TaskManager.java`, `TaskManagerApplication.java`  

---

### 2. Social Network  
Design a class hierarchy for a social network with profiles, users, companies, NGOs, and advertisements.  
- **Classes:** `Profile.java`, `User.java`, `Company.java`, `NonProfit.java`, `Advertisement.java`  
- **Additional Class:** `SocialApp.java`  

---

## 📂 Project Structure  

``src/``

- ``io/In.java`` Helper class for input  
- ``io/Out.java`` Helper class for output  
- ``task/Task.java`` Base class for tasks  
- ``task/AssignedTask.java`` Task with assigned users  
- ``task/RepeatedAssignedTask.java`` Task with repetitions  
- ``task/TaskManager.java`` Manager for handling tasks  
- ``task/TaskManagerApplication.java`` CLI for managing tasks  
- ``social/Profile.java`` Base class for profiles  
- ``social/User.java`` Specialized profile for individual users  
- ``social/company/Company.java`` Specialized profile for companies  
- ``social/company/NonProfit.java`` Specialized profile for non-profit organizations  
- ``social/Advertisement.java`` Profile for advertisements  
- ``social/app/SocialApp.java`` Main application for the social network  

``tests/``

- ``Testprotokolle.txt`` Test cases and results for all tasks  
- ``Screenshot-Javawiz-k12306187-UE08.png`` JavaWiz heap visualization screenshot  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).