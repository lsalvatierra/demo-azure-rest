package pe.edu.cibertec.demo_azure_rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //localhos:8080/hello
    @GetMapping("/hello")
    public ResponseEntity<String> getWelcome(){
        return ResponseEntity.ok("Hello API Rest, desde AppService-Azure");
    }
}
