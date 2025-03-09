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
- `.next()` → Takes the next word from input.  
- `.nextLine()` → Reads the entire input line.  
- `.nextInt()` → Reads an integer.  
- `.nextFloat()` → Reads a float (values may not always be precise due to floating point errors).  
- There are many more input functions available in Java, which can be explored using an IDE based on program needs.  

### Example of Integer Input and Addition  
```java
int num1 = input.nextInt();
int num2 = input.nextInt();
int sum = num1 + num2;
System.out.println("Sum: " + sum);
```

## Primitive Data Types  
Primitive data types are the fundamental building blocks of data in Java and cannot be broken down further:  
- `int` → Integer values (e.g., `5`, `1000`)  
- `char` → Single character (e.g., `'A'`, `'b'`)  
- `float` → Decimal numbers with less precision (e.g., `3.14f`)  
- `double` → Decimal numbers with higher precision (e.g., `3.1415926535`)  
- `long` → Larger integer values (e.g., `123456789L`)  
- `boolean` → `true` or `false`  

### Literals and Identifiers  
- **Literals**: Syntactic representation of a value.  
  - Example: `int a = 10;` Here, `10` is the **literal**, and `a` is the **identifier**.  
- **Identifiers**: Names given to variables, classes, functions, methods, etc.  

### Wrapper Class: Integer  
Java provides wrapper classes to add additional functionality to primitive data types.  
Example: `Integer` is a wrapper class for `int`:  
```java
Integer num = 10; // Integer object  
int primitiveNum = num; // Auto-unboxing (converting Integer to int)
```

## Type Casting (Type Conversion)  
When one data type is assigned to another, Java performs **automatic type conversion** if certain conditions are met:  
1. The two types must be compatible (e.g., `int` to `float`, but not `int` to `char`).  
2. The **destination type** must be greater than the **source type** (e.g., assigning `int` to `float` is allowed, but not vice versa).  

### Explicit Type Casting  
If automatic conversion is not possible, explicit type casting is required:  
```java
int a = (int)(65.25f); // Compressing a bigger number into a smaller type
```

### Automatic Type Promotion in Expressions  
```java
int a = 265;
byte b = (byte)(a); // Max value is 256; result is remainder of 265/256
```

## Inputting Characters in Java  
Java does not have a direct `nextChar()` function. Instead, characters must be extracted from a string input:  
```java
char c = input.next().trim().charAt(0); // Reads first character, trims spaces
```

## Functions in Java  
A function in Java has the following structure:  
```java
returnType functionName(arguments) {
    // Function body
    return statement; // Optional (only for non-void functions)
}
```
Example:  
```java
public int add(int a, int b) {
    return a + b;
}
```

## Methods in Java

Methods are functions inside a class that operate on objects.
Example:
```java
public class Example {
    public int multiply(int a, int b) {
        return a * b;
    }
}
```

## Variable Arguments (VarArgs)

VarArgs allows a method to accept a variable number of arguments. 
Example:
```java
public static void printNumbers(int... numbers) {
    for (int num : numbers) {
        System.out.println(num);
    }
}
```

### Function Overloading  

**Function Overloading** allows multiple methods to have the same name but with different parameters.  

Using **VarArgs**, we can overload methods to accept a variable number of arguments.  

#### Example: Function Overloading with VarArgs  
```java
public class OverloadingExample {

    // Method with two int parameters
    public static void display(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }

    // Method with VarArgs to handle multiple integers
    public static void display(int... numbers) {
        System.out.print("VarArgs integers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display(5, 10); // Calls the first method
        display(1, 2, 3, 4, 5); // Calls the VarArgs method
    }
}
```
### Explanation:  
1. The first `display` method takes exactly two integer parameters.  
2. The second `display` method uses **VarArgs (`int... numbers`)**, allowing it to accept any number of integers.  
3. Java determines which method to call based on the number of arguments passed:
   - `display(5, 10);` calls the **first method**.
   - `display(1, 2, 3, 4, 5);` calls the **VarArgs method**.

## Scoping in Java  
Scoping defines the accessibility and lifetime of variables within a program:  
1. **Local Scope**: Variables declared inside a function are only accessible within that function.  
2. **Instance Scope**: Variables declared inside a class but outside any method belong to an object and are accessible throughout the object’s lifetime.  
3. **Class Scope (Static Variables)**: Shared across all instances of the class.  
4. **Block Scope**: Variables inside loops or conditional blocks `{}` are accessible only within those blocks.  

## Conditions and Loops  
### If-Else Statement  
```java
if (condition) {
  statement1;
} else if (condition) {
  statement2;
} else {
  statement3;
}
```

### Loops  
#### While Loop (Used when number of iterations is unknown)  
```java
init;
while(condition) {
  statement1;
  increment/decrement;
}
```

#### For Loop (Used when the number of iterations is known)  
```java
for(init; condition; increment/decrement) {
  statement;
}
```

#### Do-While Loop (Executes at least once)  
```java
init;
do {
  statement1;
  increment/decrement;
} while (condition);
```

## Shadowing in Java

Shadowing occurs when a variable in an inner scope has the same name as a variable in an outer scope. The inner variable temporarily hides the outer variable within its scope.Example:
```java
class ShadowingExample {
    static int x = 10; // Outer scope variable
    public static void main(String[] args) {
        System.out.println("Outer x: " + x); // Prints 10
        int x = 20; // Inner scope variable (shadows outer x)
        System.out.println("Inner x: " + x); // Prints 20
    }
}
```
The local `x` variable inside `main()` shadows the class-level x variable.

The outer `x` is accessible only if not shadowed by a local variable with the same name.

## Arrays in Java

### Why Use Arrays?
To store a collection of data types of the same kind.

### Syntax:
datatype[ ] arrayName = new datatype[size];

**Example:** Storing 4 integer values:
``` java
int[ ] arr = new int[4];
```

### Key Points:

* All data in an array should be of the **same type**.

* **Declaration**: int[ ] arr; → Array variable defined at compile time.

* **Initialization**: arr = new int[4]; → Object created at runtime in heap memory. If size is not mentioned, it results in an error.

* **Dynamic Memory Allocation**: Arrays are stored in heap memory, and heap objects may not be continuous as memory allocation depends on the JVM.

* **Index**: The position of items in an array, used to locate or change values.

* **Null**: A special value indicating a reference variable points to nothing by default.
