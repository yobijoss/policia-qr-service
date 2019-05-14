package com.yobijoss.policiaqrservice.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-14T10:15:38.902-05:00[America/Mexico_City]")

@Controller
@RequestMapping("${openapi.policaQR.base-path:/api/v1}")
public class OfficerApiController implements OfficerApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OfficerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
