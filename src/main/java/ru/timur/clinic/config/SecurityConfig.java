//package main.java.ru.timur.clinic.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import javax.sql.DataSource;
//
///**
// * Created by Tester on 16/08/2017.
// */
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    DriverManagerDataSource dataSource;
//
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery(
//                        "select username,password, enabled from clients where username=?")
//                .authoritiesByUsernameQuery(
//                        "select username, role from roles where username=?");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//                .and()
//                .formLogin().loginPage("/login").failureUrl("/login?error")
//                .usernameParameter("username").passwordParameter("password")
//                .and()
//                .logout().logoutSuccessUrl("/login?logout")
//                .and()
//                .exceptionHandling().accessDeniedPage("/403")
//                .and()
//                .csrf();
//    }
//}
