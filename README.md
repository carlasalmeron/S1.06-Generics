# S1.06 — Generics
## 🎯 Objectives

This project introduces the fundamental concepts of Java generics.
It focuses on learning how to create classes and methods that can work with any data type, while observing how Java manages flexible yet type-safe typing.

The goal is to understand the differences between non-generic and generic implementations, and progressively refine the use of generics through partial generics and safe varargs usage.

## 📌 Level 1
### ✅ Exercise 1 — Non-Generic Class

Creates a class called NoGenericMethods that stores three arguments of the same type, including:

A constructor to initialize all three elements

Getter methods:

- getElement1()
- getElement2()
- getElement3()

This exercise verifies that:

- The constructor accepts arguments in any order
- All elements must be of the same type
- The limitations of non-generic implementations are clearly observed

This exercise serves as a foundation to later compare behavior with a generic version.

### ✅ Exercise 2 — Generic Method with Multiple Parameters

Creates a class Person with the attributes:
- name
- surname
- age

Then, creates a class GenericMethods containing a generic method called printElements() that accepts three generic parameters and prints them to the console.

From the main() method, this generic method is called using different combinations of types, such as:

- A Person object
- A String
- A primitive numeric value (via autoboxing)

This exercise demonstrates that:

- Generic methods can accept any combination of types
- The order of parameters does not affect functionality
- Custom objects, standard classes, and primitive values can be used together

## 📌 Level 2

This level focuses on refining the use of generics, learning how to:
- Combine generic parameters with concrete types
- Use varargs safely with generics
- Understand Java’s type safety limitations and warnings

### ✅ Exercise 1 — Partial Generic Method

Modifies the previous generic method so that:
- One parameter is a fixed type (e.g. String)
- The other two parameters remain generic

This exercise reinforces the concept of partial generics, showing how generic and concrete types can coexist in the same method to provide both flexibility and structure.

### ✅ Exercise 2 — Generic Varargs Method

Adapts the previous method so that it accepts a variable number of generic arguments using varargs.

The method is renamed to printAll().

Key concepts covered:

- Variable-length arguments (varargs) 
- Generic type inference
- Safe usage of generics with varargs
- Understanding unchecked compilation warnings caused by type erasure

**⚠️ Important Notes on Generics & Varargs**

Using generics with varargs may produce unchecked warnings during compilation due to Java’s type erasure mechanism.

In this project:
- Generic varargs are used in a read-only manner
- No unsafe operations are performed on the underlying arrays
- The `@SafeVarargs` annotation is applied when appropriate to ensure type safety

## 🛠 Technologies

- Java 21+
- IntelliJ IDEA 
- Git & GitHub 
- Command Line Execution (Git Bash / Terminal)

## 🚀 Installation and Execution

### 📂Clone Repository
`git clone https://github.com/carlasalmeron/S1.06-Generics.git`

### 🌍 Portability & Best Practices

This project follows good practices to ensure clean and maintainable code:
- Clear separation of responsibilities between classes
- Progressive introduction of generics concepts
- Safe and controlled use of generic varargs