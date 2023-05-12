import io.github.aceburgundy.python.PythonList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PythonListTest {
    
    @Test
    public void testAppend() {
        PythonList list = new PythonList();
        list.append("A").append("B").append("C");
        Object[] expected = {"A", "B", "C"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testClear() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        list.clear();
        Object[] expected = {};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testCopy() {
        PythonList list1 = new PythonList(new String[]{"A", "B", "C"});
        PythonList list2 = list1.copy();
        Object[] expected = {"A", "B", "C"};
        Assertions.assertArrayEquals(expected, list2.getList());
    }

    @Test
    public void testCount() {
        PythonList list = new PythonList(new String[]{"A", "B", "A", "C", "A"});
        int count = list.count("A");
        Assertions.assertEquals(3, count);
    }

    @Test
    public void testExtend() {
        PythonList list = new PythonList(new String[]{"A", "B"});
        list.extend(Arrays.asList("C", "D"));
        Object[] expected = {"A", "B", "C", "D"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testInsert() {
        PythonList list = new PythonList(new String[]{"A", "B", "D"});
        list.insert(2, "C");
        Object[] expected = {"A", "B", "C", "D"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testPop() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        Object popped = list.pop();
        Object[] expectedList = {"A", "B"};
        Object expectedPopped = "C";
        Assertions.assertEquals(expectedPopped, popped);
        Assertions.assertArrayEquals(expectedList, list.getList());
    }

    @Test
    public void testPopAtIndex() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        Object popped = list.pop(1);
        Object[] expectedList = {"A", "C"};
        Object expectedPopped = "B";
        Assertions.assertEquals(expectedPopped, popped);
        Assertions.assertArrayEquals(expectedList, list.getList());
    }

    @Test
    public void testRemove() {
        PythonList list = new PythonList(new String[]{"A", "B", "C", "B"});
        list.remove("B");
        Object[] expected = {"A", "C", "B"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testReverse() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        list.reverse();
        Object[] expected = {"C", "B", "A"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testSet() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        list.set(1, "D");
        Object[] expected = {"A", "D", "C"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testSort() {
        PythonList list = new PythonList(new String[]{"C", "A", "B"});
        list.sort();
        Object[] expected = {"A", "B", "C"};
        Assertions.assertArrayEquals(expected, list.getList());
    }

    @Test
    public void testToString() {
        PythonList list = new PythonList(new String[]{"A", "B", "C"});
        String expected = "[A, B, C]";
        Assertions.assertEquals(expected, list.toString());
    }

    @Test
    public void testListFactoryMethod() {
        PythonList list = PythonList.list("A", new String[]{"B", "C"}, Arrays.asList("D", "E"));
        Object[] expected = {"A", "B", "C", "D", "E"};
        Assertions.assertArrayEquals(expected, list.getList());
    }
}
