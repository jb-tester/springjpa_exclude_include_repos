package com.mytests.spring.jpa.exclude_include_repos.services;


import com.mytests.spring.jpa.exclude_include_repos.configs.Config1;
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
@ContextConfiguration(classes = Config1.class, loader = AnnotationConfigContextLoader.class)
public class Service1Test {


    @Autowired
    private ContactRepo1 contactRepo1;

    @Autowired(required = false)
    private ContactRepoByPattern pattern; // error - should be null! see https://youtrack.jetbrains.com/issue/IDEA-173269

    @Autowired(required = false)
    private ContactRepoByAspect aspect; // error - should be null! see https://youtrack.jetbrains.com/issue/IDEA-173270

    @Autowired(required = false)
    private ContactRepoByType exclByType;

    @Autowired(required = false)
    private ContactRepoByAnno2 exclByAnno2;

    @Autowired(required = false)
    private ContactRepoByAnno exclByAnno;

    @Test
    public void testRepo1() throws Exception {
        Assert.assertNotNull(contactRepo1);
        System.out.println(contactRepo1.countAllByIdNotNull());
    }

    @Test
    public void testExcByPattern() throws Exception {
        Assert.assertNull(pattern);
    }
    @Test
    public void testExcByAspect() throws Exception {
        Assert.assertNull(aspect);
    }

    @Test
    public void testExcByAnnoAndType() throws Exception {
        Assert.assertNull(exclByAnno);
        Assert.assertNull(exclByAnno2);
        Assert.assertNull(exclByType);
    }
}