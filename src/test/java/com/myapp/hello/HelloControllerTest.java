package com.myapp.hello;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
class HelloControllerTest 

{
    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello, Jenkins!");
    }
}