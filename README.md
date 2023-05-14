# PythonUtilities

This is a Java class that represents a Python-style list.

## Installation

### Maven

To use the `PythonList` class in your Maven project, you can add the following dependency to your project's `pom.xml` file:

```xml
<dependency>
  <groupId>io.github.aceburgundy</groupId>
  <artifactId>python</artifactId>
  <version>1.0</version>
</dependency>
```

### Gradle

To use the PythonList class in your Gradle project, you can add the following dependency to your project's build.gradle file:

```
dependencies {
  implementation 'io.github.aceburgundy:python:1.0'
}
```

# PythonList Class

## Usage

Here's an example of how to use the `PythonList` class:

```
import static io.github.aceburgundy.python.PythonList.*; //important
import static io.github.aceburgundy.python.Utilities.*;

public class Main {
    public static void main(String[] args) {
        PythonList list = list(1, "hello", 1.32);
        list.append("apple");
        list.append("banana");
        list.append("cherry");
        print(list);  // Output: [apple, banana, cherry]
    }
}
```

## API

The following methods are available in the `PythonList` class:

### `PythonList()`

Constructs an empty `PythonList` with an initial capacity of 1.

### `PythonList(Object[] initialValues)`

Constructs a `PythonList` with the specified initial values.

### `append(Object value): PythonList`

Appends the specified value to the end of the list.

### `clear()`

Clears the contents of the list, making it empty.

### `copy(): PythonList`

Creates a shallow copy of the list.

### `count(Object item): int`

Counts the number of occurrences of the specified item in the list.

### `extend(Iterable<Object> iterable)`

Extends the current object by appending the elements from the given iterable.

### `getList(): Object[]`

Returns a copy of the underlying array with the current elements in the list.

### `get(int index): Object`

Retrieves the element at the specified index in the list.

### `index(Object item): int`

Returns the index of the first occurrence of the specified item in the list, or -1 if not found.

### `insert(int index, Object item): PythonList`

Inserts the specified item at the specified index in the list.

### `pop(): Object`

Removes and returns the last element in the list.

### `pop(int index): Object`

Removes and returns the element at the specified index in the PythonList.

### `remove(Object item): PythonList`

Removes the first occurrence of the specified item from the PythonList.

### `reverse(): PythonList`

Reverses the order of elements in the PythonList.

### `set(int index, Object value)`

Sets the element at the specified index in the PythonList to the given value.

### `sort(): PythonList`

Sorts the elements in the PythonList in ascending order.

### `toString(): String`

Returns a string representation of the PythonList.

### `list(Object... initialValues): PythonList`

Creates a new PythonList with the specified initial values.

# Utilities Class

Here's an example of how to use the `Utilities` class:

## Usage

```java
import static io.github.aceburgundy.python.PythonList.*; //important
import static io.github.aceburgundy.python.Utilities.*;

// Creating a PythonList
PythonList list = new PythonList();
list.append(1);
list.append(2);
list.append(3);
print(list)  // [1, 2, 3]

// Modifying the list
list.pop();
print(list)  // [1, 2]

// Using Utilities
String input = input("Enter your name: ");
print("Hello, " + input);
```

## API

### input()

Reads a line of input from the standard input and returns it as a String.

### input(String message)

Reads a line of input from the standard input and returns it as a String, with a custom message.

### print(Object obj)

Prints the string representation of an object to the standard output, followed by a new line.

### printMultiLine(String delimiter, String... strings)

Prints the given strings on separate lines, joined by the specified delimiter.

### arrayRepresentation(Object iterable)

Returns the string representation of an iterable or array.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.
License

## Contact

For any questions or inquiries, please contact Samadriansabalo@gmail.com.

## Portfolio
https://aceburgundy.github.io
