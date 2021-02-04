package com.newCode.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                  Student Maria = new Student(
                            "Maria",
                            "Marie@gmail.com"
                  );
            repository.saveAll(
                    List.of(Maria)
            );

        };
    }
}
