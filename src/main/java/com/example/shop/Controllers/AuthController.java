package com.example.shop.controllers;

import com.example.shop.Models.DTO.UserDTO;
import com.example.shop.Models.User;
import com.example.shop.Repositories.UserRepo;
import com.example.shop.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    private final UserService userService;
    private final UserRepo userRepo;

    public AuthController(UserService userService, UserRepo userRepo) {
        this.userService = userService;
        this.userRepo = userRepo;
    }

    // AUTHENTICATION METHODS
    // Show Login Page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {

        return "login";
    }

    // Show Register Page
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        UserDTO userDTO = new UserDTO();
        model.addAttribute("user", userDTO);

        return "register";
    }

    // Save User
    @RequestMapping(value = "/register/save", method = RequestMethod.POST)
    public String registration(@Valid @ModelAttribute("user") UserDTO userDTO,
                               BindingResult result,
                               Model model) {
        User existing = userRepo.findByEmail(userDTO.getEmail());

        if (existing != null) {
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userDTO);

            return "register";
        }
        userService.saveUser(userDTO);

        return "redirect:/register?success";
    }
}
