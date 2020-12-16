package eu.van_rhijn.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FeignClientController {

    @GetMapping("/data/{dataId}")
    public FeignClientData getData(@PathVariable int dataId) {
        List<String> errors = new ArrayList<>();
        errors.add("fout1");
        errors.add("fout2");
        throw new CustomException(new ErrorResponse("bericht", errors));
//        return new FeignClientData(dataId, "name-" + dataId, dataId * 2);
    }
}
