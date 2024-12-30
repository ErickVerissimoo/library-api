package com.br.library.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import jakarta.validation.Validator;
@EnableAspectJAutoProxy
@Configuration
public class ValidatorConfig {
    @Bean
    Validator validator() {
	return new LocalValidatorFactoryBean();
}
}
