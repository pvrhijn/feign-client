package eu.van_rhijn.feignclient;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResponse implements Serializable {
    private final String message;
    private final List<String> details;
}
