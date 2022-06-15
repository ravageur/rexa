package fr.ravageur.rexa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig
{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity
        .authorizeRequests()
        .antMatchers("/user")
        .authenticated()
        .anyRequest()
        .permitAll()
        .and()
        .build();
    }
}
