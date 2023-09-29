# str.charAt() method

The `str.charAt()` method is a function in Java that belongs to the `String` class. It is used to retrieve a specific
character from a string at a specified index position.

Here's the syntax of the `charAt()` method:

```java
char charAt(int index)
```

- `index`: The position of the character you want to retrieve. It should be an integer value within the valid range of
  indices for the string.

The method returns the character at the specified index as a `char` data type.

Here's an example to illustrate how `str.charAt()` works:

```java
String str="Hello";
        char characterAtIndex2=str.charAt(2); // Retrieves the character at index 2

        System.out.println(characterAtIndex2); // Output will be 'l'
```

In this example, the string `str` is "Hello". The call `str.charAt(2)` retrieves the character at index 2, which is 'l',
and assigns it to the variable `characterAtIndex2`.

Remember that string indices in Java are 0-based. So, the first character is at index 0, the second character is at
index 1, and so on.

If you try to access an index that is out of bounds (i.e., less than 0 or greater than or equal to the length of the
string), it will result in a `StringIndexOutOfBoundsException`. Therefore, it's important to ensure that the index is
within the valid range before using `charAt()`.

---