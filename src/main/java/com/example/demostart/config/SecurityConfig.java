package com.example.demostart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import sun.security.util.Password;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
        UserDetails userDetails1 = userBuilder.username("myuser1")
                .password("minhpro1")
                .roles("USERS").build();

        UserDetails userDetails2 = userBuilder.username("myuser2")
                .password("minhpro2")
                .roles("USERS", "ADMIN").build();
        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }
}
