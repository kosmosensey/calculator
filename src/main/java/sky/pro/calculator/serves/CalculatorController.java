package sky.pro.calculator.serves;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorServesInterface calculatorServesInterface;

    public CalculatorController(CalculatorServesInterface calculatorServesInterface) {
        this.calculatorServesInterface = calculatorServesInterface;
    }

    @GetMapping
    public String hello() {
        return calculatorServesInterface.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServesInterface.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServesInterface.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServesInterface.multiply(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServesInterface.divide(num1,num2);
    }
}
