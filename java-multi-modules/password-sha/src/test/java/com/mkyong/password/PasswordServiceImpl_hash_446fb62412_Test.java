package com.mkyong.password;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PasswordServiceImpl_hash_446fb62412_Test {

    private PasswordServiceImpl passwordService;

    @BeforeEach
    public void setup() {
        passwordService = new PasswordServiceImpl();
    }

    @Test
    public void testHashWithValidInput() {
        String input = "password123";
        String expectedHash = DigestUtils.sha256Hex(input);
        assertEquals(expectedHash, passwordService.hash(input));
    }

    @Test
    public void testHashWithEmptyInput() {
        String input = "";
        String expectedHash = DigestUtils.sha256Hex(input);
        assertEquals(expectedHash, passwordService.hash(input));
    }

    @Test
    public void testHashWithNullInput() {
        assertNull(passwordService.hash(null));
    }
}
