package com.mag.bms.service;

import com.mag.bms.model.auth.AuthResult;

public interface AuthenticationService {

    AuthResult authenticate(String username, String password);

}
