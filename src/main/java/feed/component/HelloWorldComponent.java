package feed.component;

import feed.controller.HelloWorldController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import feed.response.ResponseHandler;

@Component
public class HelloWorldComponent implements HelloWorldController {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldComponent.class);

    @Override
    public ResponseEntity<Object> getHelloWorld() {
        logger.info("Reached Hello World Component");
        logger.info("********** GET METHOD ************");
        return ResponseHandler.responseBuilder("Hello World Message",
                HttpStatus.OK, new String("Hello World"));
    }
}
