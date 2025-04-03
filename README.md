# **📘 Day-09: Java While, Do-While & For Loops**  
Welcome to **Day-09** of our Java learning journey! Today, we explore Java’s core loop structures: **`while`**, **`do-while`**, and **`for`** loops. These structures allow your programs to repeat code efficiently and control flow based on conditions.

---

## **📌 Lesson Structure**
### **1️⃣ While Loop**
- What is a `while` loop?
- Syntax and flowchart of the `while` loop.
- Types of loops:
  - **Counter-controlled** loops.
  - **Event-controlled** loops.
- Preventing infinite loops (loop termination).
- Using **increment/decrement operators**.
- Nesting `while` loops with conditional logic.

### **2️⃣ Do-While Loop**
- How `do-while` differs from `while`.
- Loop executes at least once.
- Syntax and flowchart of the `do-while` loop.

### **3️⃣ For Loop**
- Simplified structure for counter-based loops.
- `for` loop syntax and examples.
- Printing sequences (e.g., 1 to 100, 100 to 1).
- Step size changes (`+=`, `-=`, etc.).
- Equivalence with `while` loops.
- Using `break` and `continue` statements.
- Nested loops and conditional structures.

---

## **📜 Live Coding Examples**

### **🖥️ While Loop: Print 1 to 100**
```java
public class Main {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
```

---

### **🖥️ While Loop: Sum of First N Numbers**
```java
int sum = 0;
int count = 1;
int N = 10; // Assume input from user

while (count <= N) {
    sum += count;
    count++;
}
System.out.println("Sum = " + sum);
```

---

### **🖥️ While Loop: Login Validation**
```java
import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        String correctUsername = "admin";
        String correctPassword = "1234";

        while (true) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid credentials. Try again.");
            }
        }

        scanner.close();
    }
}
```

---

### **🖥️ Do-While Loop: Print 1 to 10**
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

        System.out.println("Loop has ended.");
    }
}
```

---

### **🖥️ For Loop: Print Even Numbers**
```java
public class ForEvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
```

---

### **🖥️ For Loop with Break and Continue**
```java
public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip 5
            }
            if (i == 8) {
                break; // Exit at 8
            }
            System.out.println(i);
        }
    }
}
```

---

### **🖥️ Nested Loops Example**
```java
public class NestedExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) continue;
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```

---

## **🎯 Hands-on Exercises**
✅ Write a program using `while` to calculate factorial.  
✅ Use `do-while` to ask for a positive number until the user provides one.  
✅ Use `for` to sum all odd numbers from 1 to 99.  
✅ Build a nested `for` loop to print a pyramid of stars (`*`).  

---

## **📚 Additional Resources**
- **[Java While and Do-While Loops (Oracle)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)**
- **[Java For Loop Syntax and Examples](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)**
- **[Loops in Java - GeeksForGeeks](https://www.geeksforgeeks.org/loops-in-java/)**
- [Video Lesson Recording](https://us06web.zoom.us/rec/share/P7Zzy02ZIbV-Ao-SGfUkUtiAnlAnBnP71_Ly2DLH8tpeiAvhKs-0oJ3qDm8yGUm8.vWvufc6_hkn2oDFP)
- [Lesson Slides: Control Flow Structures](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-09_Loops/blob/main/Control%20Flow%20Structure%20-While%20%26Do-While%20and%20For%20statements.pdf)
- [Lesson Live Coding](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-09_Loops/tree/main/Day_09)

---

🚀 **Well done! Keep practicing and get ready for Day-10!** 🎉

