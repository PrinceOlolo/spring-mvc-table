package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {

        model.addAttribute("message", carService.getCarList(count.orElse(0)));
        return "cars/cars";
    }

}