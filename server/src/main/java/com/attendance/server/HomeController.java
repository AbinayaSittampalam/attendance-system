package com.attendance.server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "🎉 Backend is working! This is the home endpoint.";
    }
}
