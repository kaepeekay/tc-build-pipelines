package com.example.tcbuildpipelines;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("integration-test")
public class MyIntegrationTest {

    @Test
    public void some_integration_test() {
        assertThat(1).isEqualTo(1);
    }
}
