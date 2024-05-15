package com.hafidtech.springemailverification.registration;

public record RegistrationRequest(String firstName, String lastName, String email, String password, String role) {

}
