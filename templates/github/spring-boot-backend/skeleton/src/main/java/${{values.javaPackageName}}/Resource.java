package ${{ values.groupId }};

import static java.lang.System.Logger.Level.INFO;
import static java.lang.invoke.MethodHandles.lookup;

import java.lang.System.Logger;

import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Resource {

    private static final Logger LOGGER = System.getLogger(lookup().lookupClass().getName());

    public Resource() {
    }

    @GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        LOGGER.log(INFO, "Spring Boot: hello");
        return "Spring Boot: hello";
    }

}