package com.example.TaskManagementSystem.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ROLE_USER, ROLE_ADMIN;

    /**
     * @return
     */
    @Override
    public String getAuthority() {
        return name();
    }
}
