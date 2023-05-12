/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samad
 */
import static io.github.aceburgundy.python.Utilities.*;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class UtilitiesTest {

    @Test
    void testPrint() {
        // Redirect the standard output to a ByteArrayOutputStream for testing
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        String message = "Test";
        print(message);

        // Convert the ByteArrayOutputStream to a string and compare
        Assertions.assertEquals(message + System.lineSeparator(), outputStream.toString());
    }

    @Test
    void testPrintMultiLine() {
        // Redirect the standard output to a ByteArrayOutputStream for testing
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        String delimiter = "-";
        String[] strings = {"One", "Two", "Three"};
        printMultiLine(delimiter, strings);

        // Convert the ByteArrayOutputStream to a string and compare
        String expectedOutput = "One-Two-Three" + System.lineSeparator();
        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testArrayRepresentation() {
        // Test with array
        Integer[] array = {1, 2, 3};
        String expectedArrayString = "[1, 2, 3]";
        Assertions.assertEquals(expectedArrayString, arrayRepresentation(array));

        // Test with ArrayList
        List<String> list = Arrays.asList("A", "B", "C");
        String expectedListString = "[A, B, C]";
        Assertions.assertEquals(expectedListString, arrayRepresentation(list));
    }
}
