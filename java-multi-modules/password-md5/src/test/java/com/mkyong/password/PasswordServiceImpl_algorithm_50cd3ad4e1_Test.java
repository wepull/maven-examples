package com.mkyong.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordServiceImpl_algorithm_50cd3ad4e1_Test {

    private PasswordServiceImpl passwordService = new PasswordServiceImpl();

    @Test
    public void testAlgorithm_returnsMd5() {
        String algorithm = passwordService.algorithm();

        Assertions.assertEquals("md5", algorithm, "The algorithm method should return md5");
    }

    @Test
    public void testAlgorithm_notReturnsSha1() {
        String algorithm = passwordService.algorithm();

        Assertions.assertNotEquals("sha1", algorithm, "The algorithm method should not return sha1");
    }
}
