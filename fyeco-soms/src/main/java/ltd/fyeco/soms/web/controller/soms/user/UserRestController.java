package ltd.fyeco.soms.web.controller.soms.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tianxin
 */
@Controller
@RequestMapping("/rest/v1/user")
public class UserRestController {

    @PostMapping("signin")
    public String signin() {
        return   "signup";
    }

}
