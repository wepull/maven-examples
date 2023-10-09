package com.mkyong.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordServiceImpl_algorithm_50cd3ad4e1_Test {

    private PasswordServiceImpl passwordServiceImpl = new PasswordServiceImpl();

    @Test
    public void testAlgorithmMethod() {
        String algorithm = passwordServiceImpl.algorithm();
        Assertions.assertNotNull(algorithm, "Algorithm result is null");
        Assertions.assertEquals("sha256", algorithm, "Algorithm doesn't match expected");
    }

    @Test
    public void testAlgorithmMethodFailure() {
        String algorithm = passwordServiceImpl.algorithm();
        Assertions.assertNotNull(algorithm, "Algorithm result is null");
        Assertions.assertNotEquals("sha512", algorithm, "Algorithm shouldn't match sha512");
    }
}
