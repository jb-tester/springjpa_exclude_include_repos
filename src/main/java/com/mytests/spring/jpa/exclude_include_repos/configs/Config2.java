package com.mytests.spring.jpa.exclude_include_repos.configs;

import com.mytests.spring.jpa.exclude_include_repos.utils.annotations.MyFilterAnnotation;
import com.mytests.spring.jpa.exclude_include_repos.utils.types.MyFilterType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/22/2017.
 * Project: exclude_include_repos
 * *******************************
 */
@Configuration
@Import(DBConfig.class)
@ComponentScan("com.mytests.spring.jpa.exclude_include_repos.services")
@EnableJpaRepositories(basePackages = "com.mytests.spring.jpa.exclude_include_repos.repositories",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = MyFilterAnnotation.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = MyFilterType.class),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.mytests.spring.jpa.exclude_include_repos.repositories.*Pattern"),
        @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.mytests.spring.jpa.exclude_include_repos.repositories.*Aspect")
})
public class Config2 {

}
