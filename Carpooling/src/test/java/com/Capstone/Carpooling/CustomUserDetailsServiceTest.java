package com.Capstone.Carpooling;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class CustomUserDetailsServiceTest {

    @Test
    void loadUserByUsername() {
        CustomUserDetailsService user_test = new CustomUserDetailsService();
        assertThrows(NullPointerException.class,() ->{
            
            user_test.loadUserByUsername("wrong@gmail.com");
        });

    }
}