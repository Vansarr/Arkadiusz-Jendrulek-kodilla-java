package com.example.kodillatesting;

import com.example.kodillatesting.calculator.Calculator;
import com.example.kodillatesting.user.SimpleUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaTestingApplication {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 5);
        int subtraction = calculator.subtract(10, 5);

        if (sum == 15) {
            System.out.println("Sum test: OK!");
        }else {
            System.out.println("Error!");
        }

        if (subtraction == 5) {
            System.out.println("Subtraction test: OK!");
        }else {
            System.out.println("Error!");
        }
    }

}
