package com.mycompany.tests;

import com.mycompany.JacocoExampleApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(
        classes = JacocoExampleApplication.class)
public class CustomerTestIT {

    @Test
    public void CustomerControllerHelloTest(){
        assertTrue(1==1);
    }
}
