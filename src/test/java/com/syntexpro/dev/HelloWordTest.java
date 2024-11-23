package com.syntexpro.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWordTest {

    @Test
    void testHello() {
        HelloWord helloWord = new HelloWord();
        Assertions.assertEquals("Hello World", helloWord.hello());
    }
}
