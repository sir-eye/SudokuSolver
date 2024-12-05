# Sudoku Solver Project

Welcome to the **Sudoku Solver Project**! This project implements a fully functional Sudoku solver in Java using the backtracking algorithm. The program validates input and efficiently solves any valid Sudoku puzzle. It serves as a demonstration of advanced problem-solving and algorithm implementation.


## 📚 Project Objective

The objective of this project is to:
1. Solve any valid 9x9 Sudoku puzzle using a backtracking algorithm.
2. Validate Sudoku rules (rows, columns, and subgrids) for placement.
3. Display the original puzzle and the solved board.


## 🛠 Features

- **Backtracking Algorithm**:
  - Uses recursion to fill empty cells while adhering to Sudoku rules.
  - Includes backtracking to reset invalid placements and try alternatives.

- **Input Validation**:
  - Ensures no violations of Sudoku rules before placing numbers.

- **Dynamic Board Solving**:
  - Can handle any valid 9x9 Sudoku puzzle with empty cells represented as `0`.

- **Board Display**:
  - Prints the original and solved Sudoku boards in an easy-to-read format.


## 🚀 How It Works

1. **Input Board**:
   - Define the Sudoku puzzle as a 9x9 integer array in the code.
   - Use `0` to represent empty cells.

2. **Run the Solver**:
   - The program will attempt to solve the puzzle using a recursive backtracking algorithm.
   - If solvable, the solved board is displayed. Otherwise, the program indicates that the puzzle is unsolvable.

3. **Output**:
   - Displays both the original and solved Sudoku boards.


## 🔧 How to Run

1. Clone the repository.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Run the `SudokuSolver.java` file.
4. Observe the output for the provided Sudoku puzzle.


## 🌟 Enhancements

Future improvements could include:
- **User Input**: Allow users to input Sudoku puzzles dynamically.
- **Graphical Interface**: Build a GUI for a more interactive experience.
- **Puzzle Validation**: Check if the input puzzle is valid before solving.
- **Performance Tracking**: Measure and display the time taken to solve.

---

## 👥 Team Members

This project was developed by:
- Daniel Noa

## 📋 Completion Status

✅ Functional Sudoku Solver implemented.  
✅ Input validation and board display included.  
✅ Ready for extension and integration into larger projects.

Thank you for reviewing this project. Feedback and suggestions are welcome! 🎉
