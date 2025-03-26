package com.andrezktt.workshop_spring_batch_user_request.writer;

import com.andrezktt.workshop_spring_batch_user_request.entities.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertUserDataDBWriterConfig {

    @Bean
    public ItemWriter<User> insertUserDataDBWriter() {
        return users -> users.forEach(System.out::println);
    }
}
