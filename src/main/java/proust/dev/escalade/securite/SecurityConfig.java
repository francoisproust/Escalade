package proust.dev.escalade.securite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import proust.dev.escalade.services.interfaces.UtilisateurService;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(utilisateurService);
    }
    @Bean
    public AuthenticationProvider getProvider() {
        AppAuthProvider provider = new AppAuthProvider();
        provider.setUserDetailsService(utilisateurService);
        return provider;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authenticationProvider(getProvider())
                .formLogin()
                .loginPage("/login")
               // .defaultSuccessUrl("/").failureUrl("/connexion?error=loginError")
                .defaultSuccessUrl("/").failureUrl("/login")
                .usernameParameter("pseudo").passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/logout")
              //  .logoutSuccessUrl("/connexion.jsp")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
                .and()
                .authorizeRequests()
                .antMatchers("/add*/**").authenticated()
                .antMatchers("/mon-profil").authenticated()
                .antMatchers("/utilisateur/**").authenticated()
                .antMatchers("/modifier*/**").authenticated()
                .antMatchers("/suppression*/**").authenticated()
                .antMatchers("/les-commentaires").authenticated()
                .antMatchers("/reserver-topo*/**").authenticated()
                .anyRequest().permitAll();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
