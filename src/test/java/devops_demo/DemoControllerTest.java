
package devops_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    DemoController controller = new DemoController();

    @Test
    void testHomeEndpoint() {
        assertEquals(
            "Welcome to DevOps Demo Application!",
            controller.home()
        );
    }

    @Test
    void testHealthEndpoint() {
        assertEquals(
            "UP",
            controller.health().get("status")
        );
    }

    @Test
    void testMessageEndpoint() {
        assertEquals(
            "Hello from Spring Boot DevOps Demo!",
            controller.message().get("message")
        );
    }
}
