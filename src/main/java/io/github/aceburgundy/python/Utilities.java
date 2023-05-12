/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.aceburgundy.python;
import java.util.*;

/**
 * A utility class that provides Python-like functionality for Java programs.
 */
public class Utilities {

    private static final ArrayList<Object> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Reads a line of input from the standard input and returns it as a String.
     *
     * allows the method to be called without any arguments
     * @return calls the input method with an empty string as the argument
     */
    public static String input() {
        return input("");
    }

    /**
     * Reads a line of input from the standard input and returns it as a String.
     *
     * @param message the message to be printed
     * @return the line of input read from the standard input
     */
    public static String input(String message) {
        
        if (!message.isEmpty()) {
            System.out.print(message);
        }
        
        return scanner.nextLine();
    }

    /**
     * Prints the string representation of an object to the standard output,
     * followed by a new line.
     *
     * @param obj the object to be printed
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * Prints the given strings on separate lines, joined by the specified delimiter.
     *
     * @param delimiter The delimiter used to separate the strings.
     * @param strings   The strings to be printed on separate lines.
     */
    public static void printMultiLine(String delimiter, String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(delimiter);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - delimiter.length());
        }
        System.out.println(sb.toString());
    }


    /**
     * Returns the string representation of an iterable or array.
     * If the iterable is an array, it will be converted to a string using
     * {@link Arrays#deepToString(Object[])}. If the iterable is not an array,
     * each element will be appended to a string, enclosed in square brackets.
     *
     * @param iterable the iterable or array to be converted to a string
     * @return the string representation of the iterable or array
     */
    public static String arrayRepresentation(Object iterable) {
        if (iterable.getClass().isArray()) {
            if (iterable instanceof Object[]) {
                return Arrays.deepToString((Object[]) iterable);
            } else {
                return Arrays.toString((Object[]) iterable);
            }
        } else if (iterable instanceof Iterable<?>) {
            Iterable<?> iterable1 = (Iterable<?>) iterable;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (Object element : iterable1) {
                sb.append(element).append(", ");
            }
            if (sb.length() > 1) {
                sb.delete(sb.length() - 2, sb.length());
            }
            sb.append("]");
            return sb.toString();
        } else {
            return iterable.toString();
        }
    }
   
}
