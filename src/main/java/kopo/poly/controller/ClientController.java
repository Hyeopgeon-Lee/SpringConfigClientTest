package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RequestMapping("/config")
@RestController
public class ClientController {

    @Value("${poly}")
    String poly; // Spring Config Server 받은 환경변수(application.yml) poly 값 가져오기

    @GetMapping("getPoly")
    public String getPoly() {
        return poly; // poly 값 출력
    }
}
