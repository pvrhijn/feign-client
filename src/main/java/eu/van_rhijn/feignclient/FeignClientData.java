package eu.van_rhijn.feignclient;

import lombok.Value;

@Value
public class FeignClientData {
    int id;
    String name;
    int amount;
}
