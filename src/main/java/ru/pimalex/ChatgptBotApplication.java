package ru.pimalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Приложение сделанное опираясь на урок <b>Spring Boot + OpenAI ChatGPT API Integration | JavaTechie</b>
 * <a href="https://www.youtube.com/watch?v=HlDkuFy8xRM">ссылка на урок</a>
 * <a href="https://github.com/Java-Techie-jt/springboot-chatgpt">ссылка на код на github</a>
 * <p>
 * С помощью этой команды можем построить с помощью Maven дерево зависимостей и сохранить в файл dependencies.txt:<br>
 * <i>./mvnw dependency:tree -Dverbose -DoutputFile=dependencies.txt</i>
 * <p>
 * Описание подключения к OpenAI <a href="https://platform.openai.com/docs/api-reference/authentication">ссылка на OpenAI</a>
 */
@SpringBootApplication
public class ChatgptBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatgptBotApplication.class, args);
    }

}
