package microservices.com.feign.feignapi;

import microservices.com.feign.pojo.Airline;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@FeignClient(value = "instantwebtools-api", url = "https://api.instantwebtools.net/v1")
@FeignClient(value = "${app.feign.config.name}", url = "${app.feign.config.url}")
public interface RestAPiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/airlines")
    public List<Airline> getAirlines();

    @RequestMapping(method = RequestMethod.GET, value = "/airlines/{airlineId}")
    Airline readAirLineById(@PathVariable("airlineId") String airlineId);

    @RequestMapping(method = RequestMethod.GET, value = "/airlines")
    Airline readAirlineByRequestHeaderToken(@RequestHeader("X-Auth-Token") String token);

}
