package sky.pro.calculator.serves;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServesImpl implements CalculatorServesInterface {
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

    public String divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        double result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
