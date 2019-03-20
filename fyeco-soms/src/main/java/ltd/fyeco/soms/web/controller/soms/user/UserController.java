package ltd.fyeco.soms.web.controller.soms.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tianxin
 */
@Controller
public class UserController {

    private static final String PRE_URL = "default/soms/user/";

    @GetMapping("signup.html")
    public String signupPage() {
        return PRE_URL + "signup";
    }

    @GetMapping("signin.html")
    public String signinPage() {
        return PRE_URL + "signin";
    }

    @GetMapping("forgot-password.html")
    public String forgotPasswordPage() {
        return PRE_URL + "forgot-password";
    }

}
