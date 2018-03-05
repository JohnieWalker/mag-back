package com.mag.bms.endpoint;

import com.mag.bms.model.auth.AuthResult;
import com.mag.bms.model.message.Message;
import com.mag.bms.service.AuthenticationService;
import com.mag.bms.service.PermissionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

@RestController
@RequestMapping("/bms/api/v1/auth")
public class AuthEndpoint {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private PermissionManagementService permissionManagementService;

    @PostMapping(value = "/login", consumes = APPLICATION_FORM_URLENCODED_VALUE)
    public AuthResult authenticate(@RequestParam String username, @RequestParam String password) {
        return authenticationService.authenticate(username, password);
    }

    @GetMapping(value = "/buckets")
    public List<String> permittedBuckets() {
        return permissionManagementService.getPermittedBuckets();
    }

    @GetMapping(value = "/admin")
    public Message isAdminPageAvailable() {
        return new Message("Permitted");
    }

}
