# Java Sorting Algorithms

A practical, runnable guide to sorting algorithms in Java. Each topic includes source code and a short explanation.

## Topics

1. Introduction and sorting terminology
2. Basic sorts: bubble, selection, and insertion
3. Divide and conquer: merge sort and quicksort partitions
4. Non-comparison sorts: counting, radix, and bucket sort
5. Heap sort
6. Java built-in sorting APIs
7. Complexity analysis
8. Side-by-side comparison

## Requirements

- Java 17 or newer

## Compile and run

From the repository root:

```text
javac -d out 01-introduction/SortingIntroduction.java
java -cp out SortingIntroduction
```

Compile all examples with:

```text
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

PowerShell's `Get-ChildItem` command is used above because this repository targets Windows development, but any Java-compatible build workflow is fine.

## Exercises

Start with `exercises/README.md`, then compare your work with the matching files in `solutions/`.
