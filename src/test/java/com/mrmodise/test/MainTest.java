package com.mrmodise.test;

import com.mrmodise.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Morebodi on 12/9/2016.
 */
public class MainTest {

    @Test
    public void testMessageReturned() {
        // trigger jenkins with this comment line
        String message = Main.createMessage();

        // lets trigger the commit
        Assert.assertEquals("Hello World", message);
    }
}
