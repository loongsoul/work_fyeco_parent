package ltd.fyeco.soms.web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 *
 */
public class CustomUserDetails {//implements UserDetails {

//    /**
//     * Default user name.
//     */
//    private String name = "user";
//
//    /**
//     * Password for the default user name.
//     */
//    private String password = UUID.randomUUID().toString();
//
//    /**
//     * Granted roles for the default user name.
//     */
//    private List<String> roles = new ArrayList<>();
//
//    private boolean passwordGenerated = true;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
//
//    public void setPassword(String password) {
//        if (!StringUtils.hasLength(password)) {
//            return;
//        }
//        this.passwordGenerated = false;
//        this.password = password;
//    }
//
//    public List<String> getRoles() {
//        return this.roles;
//    }
//
//    public void setRoles(List<String> roles) {
//        this.roles = new ArrayList<>(roles);
//    }
//
//    public boolean isPasswordGenerated() {
//        return this.passwordGenerated;
//    }

}
