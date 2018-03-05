package com.mag.bms.model.auth;

public class AuthResult {

    private final String username;
    private final String displayName;
    private final boolean authenticated;

    public AuthResult(String username, String displayName, boolean authenticated) {
        this.username = username;
        this.displayName = displayName;
        this.authenticated = authenticated;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
