package com.syncrony.examples;

import org.junit.jupiter.api.Test;

import com.syncrony.examples.MessageBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testNameSrini() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello srini", obj.getMessage("srinivas"));

    }

    /*@Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }*/

}
