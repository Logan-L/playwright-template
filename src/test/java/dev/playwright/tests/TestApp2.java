package dev.playwright.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestApp2 extends BaseTest {
    @Test
    void shouldAnswerWithTrue() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }
}
