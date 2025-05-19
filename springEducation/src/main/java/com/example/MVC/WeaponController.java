package com.example.MVC;

import com.example.DAO.WeaponDAO;
import com.example.springEducation.Weapon;
import com.example.springEducation.Gun;
import com.example.springEducation.Knife;
import com.example.springEducation.Rifle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/weapons")
public class WeaponController {
    private final WeaponDAO weaponDAO;

    @Autowired
    public WeaponController(WeaponDAO weaponDAO) {
        this.weaponDAO = weaponDAO;
    }

    @GetMapping()
    public String index(Model model)
    {
        model.addAttribute("weapons", weaponDAO.index());
        return "weapon/index";
    }

    @GetMapping("/{name}")
    public String show(@PathVariable("name") String name, Model model)
    {
        model.addAttribute("weapon", weaponDAO.show(name));
        return "weapon/show";
    }

    @GetMapping("/gun")
    public String getGunForm(Model model)
    {
        model.addAttribute("gun", new Gun());
        return "gun/form";
    }

    @PostMapping("/gun")
    public String create(@ModelAttribute("gun") Gun gun)
    {
        weaponDAO.save(gun);
        return "redirect:/weapons";
    }

    @GetMapping("/rifle")
    public String getRifleForm(Model model)
    {
        model.addAttribute("rifle", new Rifle());
        return "rifle/form";
    }

    @PostMapping("/rifle")
    public String create(@ModelAttribute("rifle") Rifle rifle)
    {
        weaponDAO.save(rifle);
        return "redirect:/weapons";
    }

    @GetMapping("/knife")
    public String getKnifeForm(Model model)
    {
        model.addAttribute("knife", new Knife());
        return "knife/form";
    }

    @PostMapping("/knife")
    public String create(@ModelAttribute("knife") Knife knife)
    {
        weaponDAO.save(knife);
        return "redirect:/weapons";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name)
    {
        Weapon tmp = weaponDAO.getObject(name);
        if (tmp != null)
            weaponDAO.remove(tmp);
        return "redirect:/weapons";
    }

    @GetMapping("/update/{name}")
    public String getUpdateForm(@PathVariable("name") String name, Model model)
    {
        Weapon tmp = weaponDAO.getObject(name);
        if (tmp != null)
        {
            if (tmp instanceof Rifle) {
                model.addAttribute("rifle", tmp);
                return "rifle/updateForm";
            }
            else if (tmp instanceof Gun){
                model.addAttribute("gun", tmp);
                return "gun/updateForm";
            }
            else{
                model.addAttribute("knife", tmp);
                return "knife/updateForm";
            }
        }
        return "redirect:/weapons";
    }

    @PatchMapping("/update/rifle/{name}")
    public String updateRifle(
            @PathVariable String name,
            @ModelAttribute Rifle weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }

    @PatchMapping("/update/gun/{name}")
    public String updateGun(
            @PathVariable String name,
            @ModelAttribute Gun weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }
    @PatchMapping("/update/knife/{name}")
    public String updateknife(
            @PathVariable String name,
            @ModelAttribute Knife weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }

}