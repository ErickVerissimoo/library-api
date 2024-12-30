package com.br.library.Aspect;

import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import com.br.library.Config.Validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Aspect
@Component
@Log
@RequiredArgsConstructor
public class ValidatorAspect {
	private final Validator validator;
	@Around("execution(* com.br.library.repositories.*.*(..))")
	public Object validar(ProceedingJoinPoint join) throws Throwable {
		
		log.info("aspecto interceptado");
		
		Object ob[] = join.getArgs();
		for(Object object : ob) {
			if(AnnotationUtils.findAnnotation(object.getClass(), Validation.class)!=null) {
			Set<ConstraintViolation<Object>> set=	validator.validate(object);
			
			if(!isValid(set)) {
				throw new Exception();
			}
			}
		}
		
		
		
		return join.proceed();
	}
	private boolean isValid(Set<ConstraintViolation<Object>> set) {
		return set.isEmpty();
	}
	
	
}
