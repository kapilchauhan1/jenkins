package com.example.demo;

import org.junit.jupiter.api.Test;
import com.example.demo.controller.DemoController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class BasicprojectApplicationTests {

	@InjectMocks
    private DemoController demoController;

    @Test
    public void testDemoReply() {
        String expected = "Hi there";
        String actual = demoController.demoReply();
        assertEquals(expected, actual);
    }

}
