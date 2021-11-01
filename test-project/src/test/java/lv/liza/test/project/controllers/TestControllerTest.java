package lv.liza.test.project.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestControllerTest {

    //Autowired = dependency injection. makes sure the object is created correctly
    //automatically passing all the needed parameters, etc.

    private TestController controller = new TestController();

    @BeforeEach
    void setUp() {
        System.out.println("Test is starting..");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test has finished!");
    }

    @Test
    void getTest() {
        assert(controller.getTest().equals("This is a Test!"));
    }

    @Test
    void getAnotherTest() {
        assert(controller.getAnotherTest().contains("response"));
    }

    @Test
    void calculate() {
        assert(controller.calculate(1)) == 6.28;
    }

    @Test
    void calculate2() {
        assert(controller.calculate(99.99999)) > 627.9;
        assert(controller.calculate(99.99999)) < 628;
    }
}