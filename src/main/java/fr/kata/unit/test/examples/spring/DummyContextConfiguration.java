package fr.kata.unit.test.examples.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyContextConfiguration {

    @Bean
    public TroublesomeDependency troublesomeDependency() {
        return new TroublesomeDependency();
    }

    @Bean
    public DummyDao dummyService() {
        return new DummyDao();
    }

}
