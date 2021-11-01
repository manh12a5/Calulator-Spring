package controller;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Pattern;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("")
    public ModelAndView showInfo() {
        return new ModelAndView("list");
    }

    @PostMapping("")
    public String showInfo(@RequestParam("left") Double leftNumber,
                                 @RequestParam("right") Double rightNumber,
                                 @RequestParam String operator,
                                 Model model) {
        Pattern pattern = Pattern.compile("\\d");
        Calculator calculator = new Calculator(leftNumber, rightNumber, operator);
        double result = calculateResult(leftNumber, rightNumber, operator);
        model.addAttribute("result", result);
        return "list";
    }

    private double calculateResult(Double leftNumber, Double rightNumber, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = leftNumber + rightNumber;
                break;
            case "-":
                result = leftNumber - rightNumber;
                break;
            case "*":
                result = leftNumber * rightNumber;
                break;
            case "/":
                result = leftNumber / rightNumber;
                break;
        }
        return result;
    }

}
