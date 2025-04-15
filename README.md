
# ADS Assignment 2

This project is a custom implementation of basic data structures in Java, created as part of the Algorithms and Data Structures course assignment.

## 📋 Task Description

You are required to:

1. Implement a custom interface `MyList<T>` (already provided).
2. Implement two physical data structures:
   - `MyArrayList<T>` (based on dynamic array)
   - `MyLinkedList<T>` (based on a doubly linked list)
3. Based on these implementations, build:
   - `MyStack<T>`
   - `MyQueue<T>`
   - `MyMinHeap<T>`

You **must not** use anything from `java.util.*`, except `Iterator`.

---

## 📦 Project Structure

```
src/
├── MyList.java          # Interface defining list operations
├── MyArrayList.java     # Dynamic array implementation
├── MyLinkedList.java    # Doubly linked list implementation
├── MyStack.java         # Stack built using MyArrayList
├── MyQueue.java         # Queue built using MyLinkedList
├── MyMinHeap.java       # MinHeap based on MyArrayList
└── Main.java            # Test class (optional)
```

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/aldik1607/ADS-assignment-2.git
   cd ADS-assignment-2
   ```

2. Compile the project:
   ```bash
   javac src/*.java
   ```

3. Run tests (if provided in `Main.java`):
   ```bash
   java -cp src Main
   ```

---

## ✅ Features Implemented

- `MyArrayList` with full `MyList` interface support.
- `MyLinkedList` with proper head/tail nodes and loop prevention.
- `MyStack` (LIFO behavior).
- `MyQueue` (FIFO behavior).
- `MyMinHeap` with heapify logic and `Comparable<T>` support.
- Iterator support.
- Custom `sort` functionality.

---

## 🛠 Technologies Used

- Java (No external libraries)
- OOP principles
- Git & GitHub for version control

---

## 📌 Notes

- `sort()` uses `Comparable<T>` or accepts a `Comparator<T>` argument.
- All data structures are generic and support any object type.
- No usage of Java Collection Framework (except `Iterator`).

---

## 📈 Project Requirements Checklist

- [x] Implement `MyArrayList`
- [x] Implement `MyLinkedList`
- [x] Implement `MyStack`, `MyQueue`, `MyMinHeap`
- [x] Do not use `java.util.*` except `Iterator`
- [x] Code well documented
- [x] 5+ meaningful Git commits

---

## 👤 Author

- GitHub: [@aldik1607](https://github.com/aldik1607)

---

## 📝 License

This project is for educational purposes only.
