package com.freimanvs.magicwheel.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrintServiceTest {

    @Autowired
    private PrintService printService;

    @Test
    public void testLoggable() {
        String expected = "hi";
        String actual = printService.get("hi");
        Assert.assertEquals(expected, actual);
    }
}