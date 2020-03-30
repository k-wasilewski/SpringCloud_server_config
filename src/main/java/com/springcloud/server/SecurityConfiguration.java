package com.springcloud.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    /*@Autowired
    public void configureGlobal1(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication();
    }*/

    @Override
    public void configure(HttpSecurity http) throws Exception {
        /*http.httpBasic()
                .disable()
                .authorizeRequests()
        .antMatchers(HttpMethod.GET, "/books").permitAll()
        .antMatchers(HttpMethod.GET, "/books/*").permitAll()
        .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
        .antMatchers(HttpMethod.PATCH, "/books/*").hasRole("ADMIN")
        .antMatchers(HttpMethod.DELETE, "/books/*").hasRole("ADMIN")
        .antMatchers("/encrypt/**").permitAll()
        .antMatchers("/decrypt/**").permitAll()
        .anyRequest().authenticated()
        .and()
                .csrf()
                .disable();*/


        http.httpBasic()
                .disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/books").permitAll()
                .antMatchers(HttpMethod.GET, "/books/*").permitAll()
                .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/books/*").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/books/*").hasRole("ADMIN")
                .antMatchers("/encrypt/**").permitAll()
                .antMatchers("/decrypt/**").permitAll()
                //.anyRequest().authenticated()
                .and()
                .csrf()
                .ignoringAntMatchers("/encrypt/**")
                .ignoringAntMatchers("/decrypt/**");

         super.configure(http);

    }
}
