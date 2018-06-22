package com.mytests.spring.jpa.exclude_include_repos.repositories;

import com.mytests.spring.jpa.exclude_include_repos.data.Tab2Entity;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/30/2017.
 * Project: exclude_include_repos
 * *******************************
 */
@RepositoryDefinition(domainClass = Tab2Entity.class, idClass = Integer.class)
public interface Tab2Repo {
    List<Tab2Entity> findAllByOrderByLeavingAddressAscAgeAscNameAsc();
}
