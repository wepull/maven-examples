package com.mkyong.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StaticCodeExample_test_d4468f45f9_Test {

    @Test
    public void testConcatenation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        test(new String[]{"a", "b", "c", "s", "e"});

        String expectedOutput  = "abcse\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEmptyField() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        test(new String[]{});
        
        String expectedOutput  = "\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testWithNewInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        test(new String[]{"x", "y", "z"});
        
        String expectedOutput  = "xyz\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    public void test(String[] field) {
        if(field == null) {
            field = new String[]{"a", "b", "c", "s", "e"};
        }

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(s);
    }
}
