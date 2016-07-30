package org.bin2.example;

import com.google.gson.Gson;
import org.bin2.ExampleApplication;
import org.junit.Assert;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@SpringApplicationConfiguration(classes = ExampleApplication.class)
public class ExampleApplicationTests extends AbstractTestNGSpringContextTests {

    @Resource
    private Gson gson;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(gson);
    }

}
