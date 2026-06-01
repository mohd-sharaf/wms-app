package com.warehouse.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller // نستخدم Controller لفتح صفحات HTML
public class WmsApplication {

    @GetMapping("/")
    public String home() {
        return "index"; // هذا السطر سيبحث عن ملف اسمه index.html في مجلد templates
    }

    public static void main(String[] args) {
        SpringApplication.run(WmsApplication.class, args);
    }
}
