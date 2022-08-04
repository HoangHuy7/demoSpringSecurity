package com.example.demospringsecurity.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class passwordEncoderConfig {

    @Bean
    public static PasswordEncoder getPasswordEndcoder(){
        return new BCryptPasswordEncoder();
    }

}
