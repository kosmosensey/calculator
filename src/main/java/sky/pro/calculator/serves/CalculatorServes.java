package sky.pro.calculator.serves;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServes implements CalculatorServesInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return ("Ты делишь на нуль. Иди в школу.");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
