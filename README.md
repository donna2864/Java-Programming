# Java-Programming  

## Java Program Execution Flow  
1. `.java` file (Human-readable code) → Compiled by `javac` → Generates `.class` file (Bytecode).  
2. Bytecode is **platform-independent** and requires a **Java Virtual Machine (JVM)** to execute.  
3. JVM converts bytecode to **machine code (0s and 1s)** → Platform-dependent execution.  

## Java Development Components  
- **JDK (Java Development Kit)**: Contains tools to develop and run Java programs (Compiler, Javadoc, JAR, etc.).  
- **JRE (Java Runtime Environment)**: Provides libraries and files required by JVM to run Java applications.  
- **JVM (Java Virtual Machine)**: Executes Java bytecode, managing memory via stack and heap allocation.  
- **JIT (Just-In-Time Compiler)**: Optimizes performance by reducing repeated interpretation of code.  

## Java Program Structure  
Filename: `Main.java`  

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("HELLO WORLD");
  }
}
```

## Key Concepts  
- **Class Name**: Must match the filename (`Main.java` → `class Main`).  
- **`main` Method**: Entry point of Java programs.  
- **`public`**: Accessible by all.  
- **`static`**: Allows execution without creating an object.  
- **`void`**: No return value.  
- **Package**: Defines the directory structure where the file resides.  

## Taking Input in Java  
Java provides the `Scanner` class (from `java.util` package) to take user input.  
Example:  
```java
import java.util.Scanner; // Import Scanner class

public class InputExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create Scanner object
    System.out.print("Enter your roll number: ");
    int rollno = input.nextInt(); // Read integer input
    System.out.println("Roll No: " + rollno);
  }
}
```
- `Scanner input = new Scanner(System.in);` → Reads input from the system.  
- `input.nextInt();` → Reads an integer input.  

## Primitive Data Types  
Primitive data types are the fundamental building blocks of data in Java and cannot be broken down further:  
- `int` → Integer values (e.g., `5`, `1000`)  
- `char` → Single character (e.g., `'A'`, `'b'`)  
- `float` → Decimal numbers with less precision (e.g., `3.14f`)  
- `double` → Decimal numbers with higher precision (e.g., `3.1415926535`)  
- `long` → Larger integer values (e.g., `123456789L`)  
- `boolean` → `true` or `false`  

### Wrapper Class: Integer  
Java provides wrapper classes to add additional functionality to primitive data types.  
Example: `Integer` is a wrapper class for `int`:  
```java
Integer num = 10; // Integer object  
int primitiveNum = num; // Auto-unboxing (converting Integer to int)
```

## Comments in Java  
Comments are ignored by the compiler and help in code readability.  
- **Single-line comment:** `// This is a comment`  
- **Multi-line comment:**  
  ```java
  /*  
     This is a  
     multi-line comment  
  */
  ```  

## Execution Commands  
1. **Compile:**  
   ```sh
   javac Main.java
   ```  
   (Generates `Main.class`)  
2. **Run:**  
   ```sh
   java Main
   ```  
   (Executes bytecode)  
