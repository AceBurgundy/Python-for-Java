# PythonUtilities

# PythonList

This is a Java class that represents a Python-style list.

## Installation

To use the `PythonList` class, simply import the `io.github.aceburgundy.python.PythonList` package into your Java project.

## Usage

Here's an example of how to use the `PythonList` class:

```
import io.github.aceburgundy.python.PythonList;

public class Main {
    public static void main(String[] args) {
        PythonList list = new PythonList();
        list.append("apple");
        list.append("banana");
        list.append("cherry");
        System.out.println(list);  // Output: [apple, banana, cherry]
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

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.
License

## Contact

For any questions or inquiries, please contact Samadriansabalo@gmail.com.

## Portfolio
https://aceburgundy.github.io
