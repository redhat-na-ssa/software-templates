package ${{ values.groupId }};

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
class ResourceTest {

    private static String basePath = "http://localhost:${{ values.port }}/api";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloEndpoint() {
        ResponseEntity<String> response = this.restTemplate.
            getForEntity(basePath + "/hello", String.class);
    
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertThat(response.getBody()).contains("Spring Boot: hello");
    }

}