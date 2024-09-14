package feed.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public interface HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseEntity getHelloWorld();
}
