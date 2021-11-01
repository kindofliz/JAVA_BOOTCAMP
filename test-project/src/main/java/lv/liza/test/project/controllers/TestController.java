package lv.liza.test.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//This controller is flagging this class so spring knows it's a controller
@RestController
public class TestController {

    private final double PI = 3.14;

    //This getmapping annotation tells spring that this method
    //should return when a get request is made in the browser
    //with a specified url e.g /test
    @GetMapping(value = "/test")
    public String getTest() {
        return "This is a Test!";
    }


    //an example of http POST mapping request
    @PostMapping (value = "/test")
    public String getAnotherTest() {
        System.out.println("Something is created here!");
        return "This is a response for POST request";
    }

    /**
     * calculate perimeter of a circle
     * @param radius
     * @return
     */
    @GetMapping(value = "/calculate")
    public double calculate(double radius) {
        return 2*PI*radius;
    }
}
