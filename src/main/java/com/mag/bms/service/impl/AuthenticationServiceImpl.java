package com.mag.bms.service.impl;

import com.mag.bms.model.auth.AuthResult;
import com.mag.bms.service.AuthenticationService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AuthenticationServiceImpl.class);

    @Override
    public AuthResult authenticate(String username, String password) {
        log.info("Authenticating user {}", username);
        log.info("User {} has been successfully authenticated", username);

        return new AuthResult(username, password, Boolean.TRUE);
    }

}
