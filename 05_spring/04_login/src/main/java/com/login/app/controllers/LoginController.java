import packge com.login.app.controllers;

import org.springframework.stereotype.Controller;


@Controller
public class LoginController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}