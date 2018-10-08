package fr.kata.unit.test.examples.spring;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockContextConfiguration {

    @Bean
    public TroublesomeDependency troublesomeDependency() {
        return Mockito.mock(TroublesomeDependency.class);
    }

    @Bean
    public DummyDao dummyDao() {
        return new DummyDao();
    }

}
