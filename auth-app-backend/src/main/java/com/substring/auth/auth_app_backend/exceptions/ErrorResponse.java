package com.substring.auth.auth_app_backend.exceptions;

import org.springframework.http.HttpStatus;

public record ErrorResponse(String message, HttpStatus status) {

}
