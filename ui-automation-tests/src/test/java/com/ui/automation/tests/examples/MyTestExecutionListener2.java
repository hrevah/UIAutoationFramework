package com.ui.automation.tests.examples;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

/**
 * Created by Dana Shalev on 15/11/2015.
 */
public class MyTestExecutionListener2 extends AbstractTestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("MyTestExecutionListener2 Called");
    }
}
