package com.mkyong.password;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordServiceImpl_md5_6bfc902fea_Test {

    @Test
    public void testMd5() {
        PasswordService passwordService = new PasswordService();
        String input = "password";
        String expectedOutput = "5f4dcc3b5aa765d61d8327deb882cf99"; 

        String actualOutput = (String) ReflectionTestUtils.invokeMethod(passwordService, "md5", input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMd5WithEmptyString() {
        PasswordService passwordService = new PasswordService();
        String input = "";
        String expectedOutput = "d41d8cd98f00b204e9800998ecf8427e"; 

        String actualOutput = (String) ReflectionTestUtils.invokeMethod(passwordService, "md5", input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMd5WithNullInput() {
        PasswordService passwordService = new PasswordService();
        assertThrows(IllegalArgumentException.class, () -> {
            ReflectionTestUtils.invokeMethod(passwordService, "md5", null);
        });
    }
}
