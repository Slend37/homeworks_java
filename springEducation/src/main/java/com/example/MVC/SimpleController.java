package com.example.MVC;

import ch.qos.logback.core.joran.spi.HttpUtil;
import com.example.springEducation.Gun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
    @Autowired
    Gun gun;

    @GetMapping("/demo")
    public String showForm(Model model)
    {
        model.addAttribute("price", gun.getPrice());
        model.addAttribute("KillTime", gun.getKillTime());
        return "simple";
    }

    @GetMapping("/count")
    public String sumNumbers(
            Model model,
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("operation") String operation
    )
    {
        double result;
        String errorMessage = null;
        switch (operation) {
            case "plus":
                result = num1 + num2;
                break;
            case "minus":
                result = num1 - num2;
                break;
            case "times":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    errorMessage = "Ошибка: Деление на ноль";
                    result = 0;
                }
                break;
            default:
                errorMessage = "Ошибка: Неправильная операция";
                result = 0;
                break;
        }

        model.addAttribute("num_1", num1);
        model.addAttribute("num_2", num2);
        model.addAttribute("operation", operation);
        model.addAttribute("result", errorMessage != null? errorMessage: result);

        return "counting";
    }
}