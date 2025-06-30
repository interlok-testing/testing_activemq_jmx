package com.adaptris.activemq.jmx.test;

import com.adaptris.testing.SingleAdapterFunctionalTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DefaultFunctionalTest extends SingleAdapterFunctionalTest {

    @BeforeAll
    public void setup() throws Exception {
        this.adapterStartMaxWaitTime = 90000;
        super.setup();
    }

    @Test
    public void test() throws Exception {
        // if we get to this point, then the test is successful as the JMX connection was tested on setup
        assert true;
    }
}
