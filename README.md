# Lox Interpreter – A Tree-Walk Interpreter from *Crafting Interpreters*

This project is a complete implementation of the Lox programming language, based on the first half of Bob Nystrom’s book, [*Crafting Interpreters*](https://craftinginterpreters.com/). It features a fully working tree-walk interpreter built from scratch, covering all major aspects of language design, parsing, and interpretation.

---

## Features

- Fully functional interpreter for the Lox language
- Lexical analysis (scanner/tokenizer)
- Recursive descent parser to generate Abstract Syntax Trees (ASTs)
- Tree-walk evaluator for expressions and statements
- Support for:
  - Variables and lexical scoping
  - Functions (first-class), closures, and return statements
  - Conditionals (`if` / `else`) and loops (`while`, `for`)
  - Classes, methods, and `this` keyword

---

## 🛠️ Getting Started

### 📦 Clone the Repository

```bash
git clone https://github.com/your-username/lox-interpreter.git
cd lox-interpreter
```
### ▶️ Build & Run

```bash
javac -d out $(find src -name "*.java")
java -cp out com.craftinginterpreters.lox.Lox
```
