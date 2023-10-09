package com.mkyong.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageBuilder_getMessage_4f65056a87_Test {

    private MessageBuilder messageBuilder;

    @BeforeEach
    public void setUp() {
        messageBuilder = new MessageBuilder();
    }

    @Test
    public void testGetMessage_NullName() {
        assertEquals("Please provide a name!", messageBuilder.getMessage(null));
    }

    @Test
    public void testGetMessage_EmptyName() {
        assertEquals("Please provide a name!", messageBuilder.getMessage(" "));
    }

    @Test
    public void testGetMessage_ValidName() {
        assertEquals("Hello John", messageBuilder.getMessage("John"));
    }

    @Test
    public void testGetMessage_TrimmableName() {
        assertEquals("Hello John", messageBuilder.getMessage("   John  "));
    }
}
