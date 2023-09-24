# Table of Contents

1. [Scoping of loops in Java](#Scoping-of-loops-in-Java)
2. [Special Characters in Java](#Special-Characters-in-Java)

# Scoping of loops in Java

While it is possible to use various types of loops for different conditions, not every loop is equally effective in all scenarios. The choice of loop depends on the specific requirements and structure of the task at hand. Different loops are designed to address different types of situations, and selecting the appropriate one can lead to more efficient and readable code.

## For Loop

Use when you know the number of iterations in advance, like going through an array.

```java
for(int i=1;i<=n;i++){
        // Code to execute
        }
```

## While Loop

Use when you don't know how many iterations are needed.

```java
while(condition){
        // Code to execute
        }
```

## Do-While Loop

Similar to `while`, but ensures the code block runs at least once.

```java
do{
        // Code to execute
        }while(condition);
```

---

# Special Characters in Java

Java allows the following special characters:

- `!` - Logical NOT operator
- `!=` - Not equal to operator
- `%` - Modulus operator
- `&&` - Logical AND operator
- `&` - Bitwise AND operator
- `*` - Multiplication operator
- `()` - Parentheses for grouping
- `{}` - Curly braces for code blocks
- `[]` - Square brackets for arrays
- `:` - Colon for labels in loops
- `;` - Semicolon to end statements
- `=` - Assignment operator
- `==` - Equal to operator
- `>` `<` - Comparison operators
- `?` - Ternary conditional operator
- `||` - Logical OR operator
- `|` - Bitwise OR operator

---
