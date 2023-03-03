package ivan.projects.naviweb.entity;

import java.util.Set;

public class User {

    private Long id;

    private String username;

    private String password;

    transient private String confirmPassword;

    private Set<Role> roles;

}
