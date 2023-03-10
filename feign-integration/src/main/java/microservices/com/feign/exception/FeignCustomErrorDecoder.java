package microservices.com.feign.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignCustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400:
                System.out.println("Error in request went through feign client");
                return new Exception("Bad Request Through Feign");
            case 401:
                System.out.println("Error in request went through feign client");
                return new Exception("Unauthorized Request Through Feign");
            case 404:
                System.out.println("Error in request went through feign client");
                return new Exception("Unidentified Request Through Feign");
            default:
                System.out.println("Error in request went through feign client");
                return new Exception("Common Feign Exception");
        }
    }
}
