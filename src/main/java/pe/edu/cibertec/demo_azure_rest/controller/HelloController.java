package pe.edu.cibertec.demo_azure_rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    //localhos:8080/hello
    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> getWelcome(){
        Map<String, String> response = new LinkedHashMap<>();
        response.put("app", "Cibertec");
        response.put("message", "Hello API Rest, desde AppService-Azure");
        return ResponseEntity.ok(response);
    }
}
