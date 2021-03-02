package controller;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
        Calculator calculator = new Calculator(leftNumber, rightNumber, operator);
        double result = calculator.calculateResult();
        model.addAttribute("result", result);
        return "list";
    }
}
