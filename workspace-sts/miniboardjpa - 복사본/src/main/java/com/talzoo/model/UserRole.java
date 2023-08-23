package com.talzoo.model;

public enum UserRole {
	ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;

	public String getValue() {
		return value;
	}
}
