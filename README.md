# Java Lambda Expressions and Stream Operations

This repository contains three Java programs demonstrating the use of lambda expressions and stream operations. Each experiment showcases different aspects of functional programming in Java.

## 📚 Contents

### 1. Lambda-Employee-Sort
Demonstrates sorting Employee objects using lambda expressions.

**File:** `Lambda-Employee-Sort/EmployeeSort.java`

**Objective:** To develop a Java program that sorts a list of Employee objects based on different fields (name, age, salary) using lambda expressions.

**Key Features:**
- Employee class with name, age, and salary attributes
- Sorting by name using lambda expressions
- Sorting by age using lambda expressions
- Sorting by salary using lambda expressions
- Use of Comparator with lambda expressions
- Stream API for sorting operations

**Sample Output:**
- Original employee list
- Employees sorted by name (alphabetically)
- Employees sorted by age (ascending)
- Employees sorted by salary (ascending)

---

### 2. Student-Stream-Filter-Sort
Filters and sorts Student objects using lambda expressions and stream operations.

**File:** `Student-Stream-Filter-Sort/StudentFilter.java`

**Objective:** To create a Java program that uses lambda expressions and stream operations to filter students scoring above 75%, sort them by marks, and display their names.

**Key Features:**
- Student class with name, marks, and percentage attributes
- Filtering students scoring above 75% using streams
- Sorting filtered students by marks (descending order)
- Displaying only names using map() operation
- Calculating average marks using stream operations
- Demonstrates filter(), sorted(), map(), and forEach() operations

**Sample Output:**
- List of all students
- Students scoring above 75% (sorted by marks)
- Names of high-performing students
- Complete details of filtered students
- Average marks of students above 75%

---

### 3. Product-Stream-Operations
Processes a large product dataset using Java streams for grouping, finding maximum, and calculating averages.

**File:** `Product-Stream-Operations/ProductAnalysis.java`

**Objective:** To process a large dataset of products using Java streams for grouping, finding maximum values, and calculating averages.

**Key Features:**
- Product class with name, category, price, and quantity attributes
- Grouping products by category
- Finding maximum price product in each category
- Calculating average price by category
- Computing total inventory value by category
- Filtering products by price threshold
- Overall statistics (min, max, average prices)
- Total inventory value calculation

**Sample Output:**
- Products grouped by category (Electronics, Furniture, Stationery)
- Maximum price product in each category
- Average price by category
- Total inventory value by category
- Products priced above ₹5000
- Overall statistics (highest, lowest, average prices)
- Total inventory value across all products

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java compiler (javac)

### Compilation and Execution

**For Employee Sort:**
```bash
cd Lambda-Employee-Sort
javac EmployeeSort.java
java EmployeeSort
```

**For Student Filter:**
```bash
cd Student-Stream-Filter-Sort
javac StudentFilter.java
java StudentFilter
```

**For Product Analysis:**
```bash
cd Product-Stream-Operations
javac ProductAnalysis.java
java ProductAnalysis
```

---

## 💡 Key Concepts Demonstrated

### Lambda Expressions
- Syntax: `(parameters) -> expression` or `(parameters) -> { statements; }`
- Used with functional interfaces
- Simplifies code and improves readability

### Stream Operations

**Intermediate Operations:**
- `filter()` - Filters elements based on a predicate
- `map()` - Transforms elements
- `sorted()` - Sorts elements
- `distinct()` - Removes duplicates

**Terminal Operations:**
- `forEach()` - Performs an action for each element
- `collect()` - Collects elements into a collection
- `reduce()` - Reduces elements to a single value
- `count()` - Counts elements
- `anyMatch()`, `allMatch()`, `noneMatch()` - Matching operations

**Collectors:**
- `Collectors.groupingBy()` - Groups elements by a classifier
- `Collectors.toList()` - Collects to a List
- `Collectors.averagingDouble()` - Calculates average
- `Collectors.summingDouble()` - Calculates sum
- `Collectors.maxBy()` - Finds maximum element

### Stream API Benefits
- Functional programming approach
- More readable and maintainable code
- Better performance with parallel streams
- Declarative style (what to do, not how to do it)
- Lazy evaluation for efficiency

---

## 📝 Learning Outcomes

After studying these examples, you will be able to:

1. Use lambda expressions to create inline implementations of functional interfaces
2. Apply the Stream API to perform complex data operations
3. Filter and transform collections using stream operations
4. Sort collections using lambda expressions and Comparator
5. Group data by specific attributes using Collectors
6. Calculate aggregate values (sum, average, max, min) using streams
7. Chain multiple stream operations to build data processing pipelines
8. Write more concise and expressive Java code

---

## 📚 References

- [Java Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
- [Java Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [Java Collectors](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)
- [Functional Programming in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)

---

## 👨‍💻 Author

Created as part of Java programming experiments to demonstrate lambda expressions and stream operations.

## 📄 License

This project is open source and available for educational purposes.
