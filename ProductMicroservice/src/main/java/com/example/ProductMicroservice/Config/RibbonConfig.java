package com.example.ProductMicroservice.Config;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced // Cette annotation permet d'utiliser Ribbon pour l'équilibrage de charge
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
