package com.mytests.spring.jpa.exclude_include_repos.services;


import com.mytests.spring.jpa.exclude_include_repos.configs.Config2;
import com.mytests.spring.jpa.exclude_include_repos.repositories.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/22/2017.
 * Project: exclude_include_repos
 * *******************************
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config2.class, loader = AnnotationConfigContextLoader.class)
public class Service2Test {


    @Autowired(required = false)
    private ContactRepo1 notIncludedRepo1; // error
    @Autowired(required = false)
    private ContactRepoByAnno2 notIncludedRepo2; // error

    @Autowired
    private ContactRepoByPattern pattern;

    @Autowired
    private ContactRepoByAspect aspect;

    @Autowired
    private ContactRepoByType exclByType;


    @Autowired
    private ContactRepoByAnno exclByAnno;

    @Test
    public void testNotIncludedRepos() throws Exception {
        Assert.assertNull(notIncludedRepo1);
        Assert.assertNull(notIncludedRepo2);
    }

    @Test
    public void testInclByPattern() throws Exception {
        Assert.assertNotNull(pattern);
    }
    @Test
    public void testInclByAspect() throws Exception {
        Assert.assertNotNull(aspect);
    }

    @Test
    public void testInclByAnnoAndType() throws Exception {
        Assert.assertNotNull(exclByAnno);
        Assert.assertNotNull(exclByType);
    }
}