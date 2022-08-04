package com.example.demospringsecurity.Security;

import com.example.demospringsecurity.Enitity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {


    private static final long serialVersionUID = 1L;

    private Integer id;

    private String email;

    private String password;

    private Collection<? extends GrantedAuthority> roles;


    public UserPrinciple(Integer id, String email, String password, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public static UserPrinciple createUser(User user) {

        List<GrantedAuthority> grantedAuthorities =
                user.getRoles()
                        .stream()
                        .map(
                                role -> new SimpleGrantedAuthority(
                                         role.getName()
                                )
                        )
                        .collect(Collectors.toList());

        return new UserPrinciple(
                 user.getId(),
                 user.getEmail(),
                 user.getPassword(),
                grantedAuthorities
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
