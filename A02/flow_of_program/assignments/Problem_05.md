## flowchart

```mermaid
graph TD
;
    Start((Start)) --> LoopStart;
    LoopStart -->|Input is not 'x'| Input((Input number));
    Input --> Accumulate((Sum = Sum + number));
    Accumulate --> LoopStart;
    LoopStart -->|Input is 'x'| LoopEnd;
    LoopEnd((End));
    Print((Print Sum));
```

## Pseudocode

```text
1. Sum = 0
2. Repeat
3.     Input number
4.     If number is 'x' then
5.         Exit loop
6.     Else
7.         Sum = Sum + number
8. Until input is 'x'
9. Print Sum

```