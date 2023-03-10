package microservices.com.feign.controller;
import microservices.com.feign.feignapi.RestAPiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/airlines")
public class Controller {

    @Autowired
    private RestAPiClient apiClient;

    @GetMapping
    public ResponseEntity readAirlineData(String airLineId) {


        if (airLineId == null) {
            return ResponseEntity.ok(apiClient.getAirlines());
        }
        return ResponseEntity.ok(apiClient.readAirLineById(airLineId));
    }
}
