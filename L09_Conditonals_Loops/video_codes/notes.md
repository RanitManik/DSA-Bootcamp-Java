# Loops in Python: for vs while

## Introduction

In Python, loops are used to execute a block of code repeatedly. There are two main types of loops: `for` and `while`. The choice between them depends on whether you know in advance how many times the loop needs to run.

### For Loop

The `for` loop is used when you know exactly how many times you want to iterate. It is particularly useful when working with sequences like lists, tuples, or ranges.

```python
# Example: Printing numbers from 1 to n
n = 5
for i in range(1, n+1):
    print(i)
```

In this example, the loop runs from `1` to `n` (inclusive), printing the numbers `1` through `5`.

### While Loop

The `while` loop, on the other hand, is used when you want to keep executing a block of code as long as a condition is `True`. It is suitable when you don't know in advance how many iterations are needed.

```python
# Example: Taking inputs until user types 'x'
user_input = ""
while user_input != 'x':
    user_input = input("Enter something (type 'x' to exit): ")
```

In this example, the loop continues to ask for user input until the user types `'x'`.

## When to Use Each

- **Use `for` when:**
  - You know the number of iterations in advance.
  - You are working with sequences (lists, tuples, etc.) or you want to iterate through a range of numbers.

- **Use `while` when:**
  - You don't know in advance how many iterations are needed.
  - You want to repeatedly execute a block of code until a specific condition is met.

## Conclusion

Both `for` and `while` loops are powerful tools in Python. Choosing between them depends on the specific requirements of your program. Understanding when to use each will help you write more efficient and effective code.

For more information, you can refer to the [official Python documentation](https://docs.python.org/3/tutorial/index.html).

---
