package com.backend.backend.admin;

import java.util.Map;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @GetMapping("/me")
    public Map<String, String> currentAdmin(Authentication authentication) {
        return Map.of("username", authentication.getName(), "role", "ADMIN");
    }
}
