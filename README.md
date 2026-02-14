# 📱 ProfileListApp

**MAD302 – Android Development – LAB 1**
**Student Name:** Ishmeet Singh
**Student ID:** A00202436

---

## 📌 Project Overview

ProfileListApp is a simple Android application developed using **Java** in **Android Studio**.

The app allows users to:

* Enter a **Name**
* Enter an **Age**
* Add the profile to a list
* Display all added profiles on the screen

This project demonstrates:

* Java programming
* Android UI design
* Data handling using ArrayList
* Object-Oriented Programming (OOP)
* Git version control with commits and pull requests

---

## 📂 Project Structure

```
ProfileListApp/
│
├── app/
│   ├── src/main/
│   │   ├── java/com/example/profilelistapp/
│   │   │   ├── Main.java
│   │   │   └── Profile.java
│   │   ├── res/layout/
│   │   │   └── activity_main.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
│
├── build.gradle
├── settings.gradle
└── README.md
```

---

## 🧠 Application Logic

### 🔹 Profile.java

A data class representing a profile with:

* `name`
* `age`

### 🔹 Main.java

Main activity that:

* Accepts user input
* Validates data
* Stores profiles in an ArrayList
* Displays profiles in a TextView
* Shows Toast messages for feedback

The file includes complete documentation comments explaining:

* Class purpose
* Methods
* Variables
* Application flow

---

## 📱 App Features

✔ Input validation
✔ Toast messages for user feedback
✔ Dynamic profile list display
✔ Clean and simple UI
✔ Object-Oriented implementation

---

## 🔄 Git Requirements Completed


### ✅ Commit 1 – UI Enhancement
- Improved `activity_main.xml` layout
- Added padding and spacing for better UI design
- Implemented ScrollView to support multiple profiles

Branch:
feature-ui-enhancement

---

### ✅ Commit 2 – Input Validation
- Added validation to prevent empty Name and Age fields
- Displayed Toast message for invalid input
- Improved overall user experience

Branch:
feature-input-validation

---

### ✅ Commit 3 – Structured Profile Display
- Improved profile output formatting
- Added numbered profile listing
- Used StringBuilder for better string handling

Branch:
feature-display-formatting

---

### ✅ Commit 4 – Profile Model Improvement
- Refactored `Profile.java`
- Implemented proper encapsulation
- Added getter methods for clean data access

Branch:
feature-profile-improvement

---

### ✅ Commit 5 – Code Documentation
- Added descriptive comments in `MainActivity.java`
- Improved readability and maintainability
- Updated README documentation

Branch:
docs-update-readme
---

### ✅ 3 Pull Requests (Merged)

### ✅ Pull Request 1 – UI Layout Refactor
**Branch:** `feature-layout-refactor`

Improvements:
- Added ScrollView for better scrolling support
- Improved padding and spacing
- Increased text sizes for better readability
- Cleaned layout structure

---

### ✅ Pull Request 2 – Profile Logic Enhancement
**Branch:** `feature-profile-logic-enhancement`

Improvements:
- Added input validation for empty fields
- Implemented structured profile display formatting
- Improved StringBuilder usage for cleaner output
- Cleared input fields after profile submission

---

### ✅ Pull Request 3 – Profile Model Refactor
**Branch:** `refactor-profile-class`

Improvements:
- Added class and method documentation
- Implemented `toString()` method
- Improved readability and maintainability
- Followed clean coding practices

---
