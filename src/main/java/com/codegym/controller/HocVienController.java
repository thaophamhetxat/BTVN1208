package com.codegym.controller;


import Models.HocVien;
import Service.HocVienService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HocVienController {
HocVienService hocVienService = new HocVienService();


    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        request.setAttribute("list", hocVienService.list);
        return "/show.jsp";
    }

    @GetMapping("/edit")
    public String showedit(HttpServletRequest request, @RequestParam int index) {
        request.setAttribute("customer", hocVienService.list.get(index));
        return "/edit.jsp";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "/create.jsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        hocVienService.delete(index);
        return "redirect:/home";
    }


    @PostMapping("/edit")
    public String edit(@RequestParam int index,@ModelAttribute HocVien hocVien) {
        hocVienService.edit(hocVien, index);
        return "redirect:/home";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute HocVien hocVien) {
        hocVienService.save(hocVien);
        return "redirect:/home";
    }

    @GetMapping("/find")
    public String find(@ModelAttribute HocVien hocVien) {
        hocVienService.findByName(name);
        return "redirect:/home";
    }
}
