package com.wasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wasikhan on 3/20/2016.
 */
@Controller
public class MainController
{
    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("name", "Wasi");
        return "home";
    }

    @RequestMapping("/index")
    public String index(Model model)
    {
        return "welcome";
    }
}
