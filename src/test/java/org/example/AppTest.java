package org.example;

import org.junit.Assert;

import org.junit.Test;
public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        Assert.assertEquals(7, app.add(3,4));
    }
}
