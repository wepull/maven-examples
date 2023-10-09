package com.mkyong.password;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class PasswordServiceImpl_hash_446fb62412_Test {
    
    private PasswordService passwordService;

    private MessageDigest messageDigest;

    @BeforeEach
    public void setup() throws NoSuchAlgorithmException {
        messageDigest = Mockito.mock(MessageDigest.class);
        Mockito.when(MessageDigest.getInstance("MD5")).thenReturn(messageDigest);
        passwordService = new PasswordService();
    }

    @Test
    public void testHash() {
        String input = "testInput";
        String expectedOutput = "098f6bcd4621d373cade4e832627b4f6"; // TODO: Replace with the actual MD5 hash of 'testInput'
        Assertions.assertEquals(expectedOutput, passwordService.hash(input));
    }

    @Test
    public void testHash_NullInput() {
        Assertions.assertThrows(NullPointerException.class, () -> passwordService.hash(null));
    }
}
