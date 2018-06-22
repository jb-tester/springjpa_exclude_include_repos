package com.mytests.spring.jpa.exclude_include_repos.repositories;

import com.mytests.spring.jpa.exclude_include_repos.data.ContactEntity;
import com.mytests.spring.jpa.exclude_include_repos.utils.annotations.MyFilterAnnotation;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/22/2017.
 * Project: exclude_include_repos
 * *******************************
 */
@RepositoryDefinition(domainClass = ContactEntity.class, idClass = Integer.class)
@MyFilterAnnotation
public interface ContactRepoByAnno {
}
