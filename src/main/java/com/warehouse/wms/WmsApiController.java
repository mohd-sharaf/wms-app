package com.warehouse.wms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController 
public class WmsApiController {

    @GetMapping("/api/status")
    public Map<String, String> getStatus() {
        return Map.of("status", "يعمل بكفاءة", "load", "25%");
    }
}