package com.spring.web.controller;

import com.ArturLabs.SpringwebMVC.model.Jedi;
import com.ArturLabs.SpringwebMVC.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class JediController {

    @Autowired
    private JediRepository repository;

    @GetMapping("/jedi")
    public ModelAndView jedi() {

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        modelAndView.addObject("allJedi", repository.getAllJedi());

        return modelAndView;
    }

    @GetMapping("/NewJedi")
    public ModelAndView NewJedi() {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("NewJedi");

        modelAndView.addObject("jedi", new Jedi());
        return modelAndView;
    }

    @PostMapping("/jedi")
    public String createJed(@Validated @ModelAttribute Jedi jedi , BindingResult result, RedirectAttributes redirectAtribut){

        if(result.hasErrors()){
            return "NewJedi";
        }

        repository.add(jedi);

        redirectAtribut.addFlashAttribute(" Pagina OK")

        return "redirect:jedi";
    }

}