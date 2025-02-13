package com.kapu.cinescat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class CorsConfig {

    @Bean
    WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) {
                registry.addMapping("/**")  // Permite todas las rutas
                        .allowedOrigins("http://localhost:5174") // Cambia por el origen que necesites
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") 
                        .allowedHeaders("*")
                        .allowCredentials(true); // Permitir cookies si es necesario
            }
        };
    }
}
