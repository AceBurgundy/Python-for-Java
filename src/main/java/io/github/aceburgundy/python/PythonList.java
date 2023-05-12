package io.github.aceburgundy.python;

import java.lang.reflect.Array;
import java.util.*;

    /**
    Represents a Python-style list.
    */
public class PythonList {
    private Object[] list;
    private int size;

    /**
    Constructs an empty PythonList with an initial capacity of 1.
    */
    public PythonList() {
        this.list = new Object[1]; // Initial capacity of 10
        this.size = 0;
    }

    /**

    Constructs a PythonList with the specified initial values.
    @param initialValues an array of objects to initialize the list with
    */
    public PythonList(Object[] initialValues) {
        this.list = Arrays.copyOf(initialValues, initialValues.length);
        this.size = initialValues.length;
    }

    /**
    Appends the specified value to the end of the list.
    @param value the object to be appended to the list
    @return the modified PythonList instance
    */
    public PythonList append(Object value) {
        ensureCapacity(size + 1);
        list[size++] = value;
        return this;
    }
    
    /**
    Clears the contents of the list, making it empty.
    */
    public void clear() {
        Arrays.fill(list, 0, size, null);
        size = 0;
    }
    
    /**
    Creates a shallow copy of the list.
    @return a new PythonList instance with the same elements as the original list
    */
    public PythonList copy() {
        return new PythonList(Arrays.copyOf(list, size));
    }
    
    /**
    Counts the number of occurrences of the specified item in the list.
    @param item the object to be counted in the list
    @return the number of occurrences of the specified item in the list
    */
    public int count(Object item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (list[i] == null && item == null || list[i] != null && list[i].equals(item)) {
                count++;
            }
        }
        return count;
    }
    
    /**
    Extends the current object by appending the elements from the given iterable.
    @param iterable An iterable object containing elements to be appended.
    @throws NullPointerException if the iterable is null.
    */
    public void extend(Iterable<Object> iterable) {
        for (Object value : iterable) {
            append(value);
        }
    }

    /**
    Ensures that the internal array has the specified capacity.
    @param capacity the minimum capacity to ensure
    */
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > list.length) {
            int newCapacity = Math.max(list.length * 2, minCapacity);
            list = Arrays.copyOf(list, newCapacity);
        }
    }

    /**
    Returns a copy of the underlying array with the current elements in the list.
    @return an array containing the elements in the list
    */
    public Object[] getList() {
        return Arrays.copyOf(list, size);
    }
    
    /**
    Retrieves the element at the specified index in the list.
    @param index the index of the element to retrieve
    @return the element at the specified index
    @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
    */
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return list[index];
    }
    
    /**
    Returns the index of the first occurrence of the specified item in the list, or -1 if not found.
    @param item the item to search for
    @return the index of the first occurrence of the item, or -1 if not found
    */
    public int index(Object item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == null && item == null || list[i] != null && list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
    Inserts the specified item at the specified index in the list.

    @param index the index at which to insert the item
    @param item the item to insert

    @return a reference to this PythonList object
    @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size)
    */
    public PythonList insert(int index, Object item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity(size + 1);
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = item;
        size++;
        return this;
    }

    /**
    Removes and returns the last element in the list.
    @return the last element in the list
    @throws IndexOutOfBoundsException if the list is empty
    */
    public Object pop() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return removeAtIndex(size - 1);
    }

   /**
    Removes and returns the element at the specified index in the PythonList.
    @param index the index of the element to be removed
    @return the element that was removed
    @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
    */
    public Object pop(int index) {
    if (index < 0 || index >= size) {
    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return removeAtIndex(index);
    }

    /**
    Removes the element at the specified index in the PythonList.
    This method is called internally by the pop() method.
    @param index the index of the element to be removed
    @return the element that was removed
    */
    private Object removeAtIndex(int index) {
    Object removed = list[index];
    int numShift = size - index - 1;
    if (numShift > 0) {
    System.arraycopy(list, index + 1, list, index, numShift);
    }
    list[--size] = null;
    return removed;
    }

    /**
    Removes the first occurrence of the specified item from the PythonList.
    @param item the item to be removed
    @return the PythonList instance
    */
    public PythonList remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == null && item == null || list[i] != null && list[i].equals(item)) {
                removeAtIndex(i);
                return this;
            }
        }
        return this;
    }

    /**
    Reverses the order of elements in the PythonList.
    @return the PythonList instance
    */
    public PythonList reverse() {
        
        int left = 0;
        int right = size - 1;

        while (left < right) {
            Object temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
        return this;
    }

    /**
    Sets the element at the specified index in the PythonList to the given value.
    @param index the index of the element to be set
    @param value the new value to be set
    @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
    */
    public void set(int index, Object value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        list[index] = value;
    }

    /**
    Sorts the elements in the PythonList in ascending order.
    @return the PythonList instance
    */
    public PythonList sort() {
        Arrays.sort(list, 0, size);
        return this;
    }

    /**
    Returns a string representation of the PythonList.
    @return a string representation of the PythonList
    */
    @Override
    public String toString() {
        return Arrays.toString(getList());
    }

    /**
    Creates a new PythonList with the specified initial values.
    The initial values can be provided as individual items, arrays, or Iterables.
    @param initialValues the initial values to populate the PythonList
    @return a new PythonList instance
    */
    public static PythonList list(Object... initialValues) {
        List<Object> tempList = new ArrayList<>();
        for (Object item : initialValues) {
            if (item instanceof Iterable) {
                for (Object value : (Iterable<?>) item) {
                    tempList.add(value);
                }
            } else if (item.getClass().isArray()) {
                int length = Array.getLength(item);
                for (int i = 0; i < length; i++) {
                    tempList.add(Array.get(item, i));
                }
            } else {
                tempList.add(item);
            }
        }
        return new PythonList(tempList.toArray());
    }

}
