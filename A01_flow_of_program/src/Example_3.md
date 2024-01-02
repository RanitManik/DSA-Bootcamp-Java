# Example 3 Flow Chart

- **Task:** Input a number and print whether it is prime or not.
- **Flow Chart:**
    - (Start)
    - (Input num)
    - (Condition: num ≤ 1?)
    - (Processing: Print "Neither prime nor composite")
    - (Condition: Loop through factors)
    - (Processing: Print "Not Prime" or Print "Prime")
    - (Stop)

# Example 3 Pseudocode

- **Normal Solution:**

```
Start
Input num
if num ≤ 1:
Print "Neither prime nor composite"
c = 2
while c < num:
if num % c == 0:
Print "Not Prime"
Exit
c = c + 1
end while
Print "Prime"
Exit.
```

- **Optimized Solution:**

```
Start
Input num
if num ≤ 1:
Print "Neither prime nor composite"
c = 2
while c * c <= num:
if num % c == 0:
Print "Not Prime"
Exit
c = c + 1
Print "Prime"
Exit.
```
