package eu.van_rhijn.feignclient;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException{
    private final ErrorResponse errorResponse;
    private static final long serialVersionUID = 1L;
    public CustomException(ErrorResponse errorResponse) {
        super();
        this.errorResponse = errorResponse;
    }
}