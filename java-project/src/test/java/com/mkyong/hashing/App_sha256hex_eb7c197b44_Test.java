package com.mkyong.hashing;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class App_sha256hex_eb7c197b44_Test {

    @Test
    public void testSha256hex() {
        String input = "test";
        String expectedOutput = "9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08";
        Assertions.assertEquals(expectedOutput, App.sha256hex(input));
    }

    @Test
    public void testSha256hexWithEmptyString() {
        String input = "";
        String expectedOutput = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        Assertions.assertEquals(expectedOutput, App.sha256hex(input));
    }

    @Test
    public void testSha256hexWithNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            App.sha256hex(null);
        });
    }
}
