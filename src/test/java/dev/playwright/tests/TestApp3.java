package dev.playwright.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestApp3 extends BaseTest {
    @Test
    void shouldAnswerWithTrue() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }
}
