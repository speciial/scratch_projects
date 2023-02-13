package io.github.speciial.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/example")
public class ExampleController {

    @GetMapping("/")
    public String getMessage() {
        return "Hello, Sailor!";
    }

    @GetMapping("/{name}")
    public String getMessageWithName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
