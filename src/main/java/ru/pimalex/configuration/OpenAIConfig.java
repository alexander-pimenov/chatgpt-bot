package ru.pimalex.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Configuration
public class OpenAIConfig {

    //@Value("${openai.api.key}")
    //private String openaiApiKey; //сохранил в переменную среды

    @Bean
    public RestTemplate template(){
        String openaiApiKey = System.getenv("OPENAI_API_KEY");
        RestTemplate restTemplate=new RestTemplate();
        ClientHttpRequestInterceptor authorization = (request, body, execution) -> {
            request.getHeaders().add("Authorization", "Bearer " + openaiApiKey);
            return execution.execute(request, body);
        };
        restTemplate.getInterceptors().add(authorization);
        return restTemplate;
    }
}
