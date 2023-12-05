# 📚 ESIII Teste

Welcome to the README for the Project Name! This project involves the implementation of various methods in Java using JUnit for testing and Maven for project management.

## 🚀 Functionality Overview

### CalculaDataDevolucao Method (Class: Emprestimo)

The `CalculaDataDevolucao` method in the `Emprestimo` class is tested using the Partition of Equivalence technique. The test focuses on two aspects:

1. The calculated return date is not null.
2. The calculated return date is after the loan date.

### setDataDevolucao Method (Class: Item)

The `setDataDevolucao` method in the `Item` class is tested using the Boundary Value Analysis technique. The test identifies the boundary values for the return date, which are:

- Null Date: Represents a nonexistent date.
- Future Date: Represents a date that has not occurred yet.
- Past Date: Represents a date that has already occurred.

### calculaDataDevolucao Method (Class: Item)

The `calculaDataDevolucao` method in the `Item` class is tested using the Partition of Equivalence technique. The test verifies two aspects of the method's functionality:

1. Valid Date: The method works correctly.
2. Invalid Date: The method fails or returns an unexpected result.

## 🛠️ Technologies Utilized

- **Java:** The core programming language for implementing the project.
- **JUnit:** A testing framework for Java.
- **Maven:** A project management and comprehension tool.

## 📋 How to Run Tests

To run the tests for this project, follow these steps:

1. Clone the repository.
2. Navigate to the project directory.
3. Run the following Maven command:
   ```bash
   mvn test
   ```

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

Thank you for checking out this project! 🚀
