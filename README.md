## Java GUI Applications - Calculator & Registration Form
This repository contains two Java Swing GUI applications: a calculator and a registration form with validation.

---

## 📁 Project Structure

├── Calculator.java          # Calculator application with arithmetic operations
├── RegisterForm.java        # Registration form with input validation
└── README.md               # This documentation file

---

## 🧮 Calculator Application
A fully functional calculator built with Java Swing that supports basic arithmetic operations.

# Features:
Basic Operations: Addition (+), Subtraction (-), Multiplication (*), Division (/)
Number Input: Digits 0-9 and decimal point (.)
Control Functions:
Clear (resets everything)
Delete (removes last character)
Equals (=) to perform calculations
Error Handling: Basic operation handling with double precision arithmetic

# UI Layout:
Text display field at the top
Number buttons arranged in grid layout
Operation buttons on the right column
Clear/Delete buttons at the bottom

# Usage:
Clear (resets everything)
Delete (removes last character)
Equals (=) to perform calculations
Error Handling: Basic operation handling with double precision arithmetic

// To run the calculator:
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.createFrame();
        calc.createButtons();
    }
}
Clear/Delete buttons at the bottom

---

## 📝 Registration Form Application

A signup form with input validation for user registration data.

# Form Fields:
  1) Name (must be at least 3 characters)
  2) First Address (text field)
  3) Second Address (must be different from first address)
  4) Age (must be 18 or older)
  5) Height (must be 100cm or taller)
  6) Weight (must be 40kg or heavier)

# Validation Rules:
  1) Name validation: Minimum 3 characters
  2) Address validation: First and second addresses must be different
  3) Age validation: Minimum 18 years
  4) Height validation: Minimum 100cm
  5) Weight validation: Minimum 40kg

# UI Features:
  1) Clean form layout with labeled fields
  2) Persian "ثبت نام" (Registration) button
  3) Console output for validation results
  4) Success/failure messages with detailed output

# Usage:
// To run the registration form:
public class Main {
    public static void main(String[] args) {
        RegisterForm form = new RegisterForm();
        form.createFrame();
        form.createForm();
    }
}

---

## 🛠️ Requirements
Java Development Kit (JDK) 8 or higher
Any Java IDE or command line compiler

---

## 📋 Notes
# Calculator Limitations:
  No handling for division by zero
  Basic delete implementation (could be optimized)
  Fixed window size (400x400 pixels)

## Registration Form Notes:
  All validation messages are printed to console
  No visual error indicators in the GUI
  Form uses absolute positioning (null layout)

---

## 🔧 Potential Improvements
# For Calculator:
  1) Add keyboard support
  2) Implement memory functions (M+, M-, MR, MC)
  3) Add percentage calculation
  4) Handle division by zero gracefully
  5) Add scientific calculator functions

# For Registration Form:
  1) Add visual error indicators
  2) Include input labels for each field
  3) Add password field with confirmation
  4) Implement data persistence (file/database)
  5) Add email validation
