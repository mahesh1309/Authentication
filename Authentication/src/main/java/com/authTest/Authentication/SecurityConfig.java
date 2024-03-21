package com.authTest.Authentication;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
//	 @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http
//	            .authorizeRequests(a -> a
//	                .antMatchers("/", "/error", "/webjars/**").permitAll()
//	                .anyRequest().authenticated()
//	            )
//	            .exceptionHandling(e -> e
//	                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//	            )
//	            .oauth2Login();
//	    }
	 
	 
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	       http.authorizeRequests()
	               .anyRequest().authenticated()
	               .and().oauth2Login();
	    }
}
