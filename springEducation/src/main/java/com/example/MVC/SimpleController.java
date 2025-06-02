package com.example.MVC;

import com.example.springEducation.Gun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
            @RequestParam("bull") int bullets,
            @RequestParam("fr") int fireRate,
            @RequestParam("rech") int recharge,
            @RequestParam("dam") int damage
    )
    {
        double result;
        String errorMessage = null;
        result = 1000 + bullets * 20 + fireRate * 300 - recharge * 100 + damage * 5;

        model.addAttribute("bull", bullets);
        model.addAttribute("fr", fireRate);
        model.addAttribute("rech", recharge);
        model.addAttribute("dam", damage);
        model.addAttribute("result", errorMessage != null? errorMessage: result);

        return "counting";
    }
}