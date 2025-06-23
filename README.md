# Java Console Calculator

This project implements a basic command-line calculator using Java. It allows users to perform fundamental arithmetic operations: addition, subtraction, multiplication, and division. The calculator supports multiple calculations in a single session until the user decides to exit.

---

### Key Concepts Demonstrated

This project demonstrates the following key Java concepts:

* **Object-Oriented Programming (OOP) Principles:** Although a simple calculator, it utilizes methods to encapsulate specific functionalities (e.g., `add`, `subtract`).
* **Methods:** Creation and utilization of custom methods for each arithmetic operation.
* **Conditionals (`if`/`else if`/`else`, `switch`):** Used for determining which operation to perform based on user input and for input validation.
* **Loops (`while`):** Implemented to allow continuous calculations until the user chooses to terminate the program.
* **Input/Output (I/O):** Utilizing the `java.util.Scanner` class to read user input from the console and `System.out.println()` to display results and prompts.
* **Error Handling:** Basic error handling for invalid input (e.g., non-numeric input).

---

### Features

* **Addition:** Adds two numbers.
* **Subtraction:** Subtracts the second number from the first.
* **Multiplication:** Multiplies two numbers.
* **Division:** Divides the first number by the second, with a check for division by zero.
* **Interactive Menu:** Guides the user through operation selection.
* **Continuous Calculations:** Allows multiple operations without restarting the program.
* **Input Validation:** Handles cases where users enter non-numeric input.

---

### How to Run

To compile and run this Java console calculator:

1.  **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your system (version 8 or higher is recommended).
2.  **Clone the Repository:**
    ```bash
    git clone https://github.com/bharatjaiswal856/JavaConsoleCalculator-.git

    cd JavaConsoleCalculator
    ```
3.  **Compile the Java Code:**
    Navigate to the directory where your `.java` file is located (in this case, the root of the cloned folder).
    ```bash
    javac Calculator.java
    ```
4.  **Run the Application:**
    ```bash
    java Calculator
    ```
    Follow the on-screen prompts in the console to perform calculations.

---

### Example Usage
Welcome to the Java Console Calculator!

Select an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Enter your choice (1-5): 1
Enter first number: 10
Enter second number: 5
Result: 10.0 + 5.0 = 15.0

Select an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Enter your choice (1-5): 4
Enter first number: 20
Enter second number: 4
Result: 20.0 / 4.0 = 5.0

Select an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Enter your choice (1-5): 5
Exiting calculator. Goodbye!

<!-- end list -->

---

### Author

* [Bharat Jaiswal](https://github.com/bharatjaiswal856/JavaConsoleCalculator-)