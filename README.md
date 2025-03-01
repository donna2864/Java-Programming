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

## Execution Commands  
1. **Compile**: 
   ```sh
   javac Main.java

2. **Run**:
  ```sh
  java Main.java