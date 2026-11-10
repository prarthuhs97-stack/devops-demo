
package devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps Demo Application!";
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "message", "Application is running"
        );
    }

    @GetMapping("/api/message")
    public Map<String, String> message() {
        return Map.of(
            "message", "Hello from Spring Boot DevOps Demo!"
        );
    }
}
