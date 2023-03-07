package com.codingdojo.registerlogin.controller;

import com.codingdojo.registerlogin.dto.LoginUser;
import com.codingdojo.registerlogin.model.User;
import com.codingdojo.registerlogin.service.UserServi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final UserServi userServi;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        session.setAttribute("userId", null);
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, Model model, HttpSession session) {
        this.userServi.register(newUser, result);

        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
                        BindingResult result, Model model, HttpSession session) {


        User user = userServi.login(newLogin, result);

        if (result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/";
        }
        model.addAttribute("user", this.userServi.findById(userId));
        return "exito.jsp";
    }

}
