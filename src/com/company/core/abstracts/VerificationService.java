package com.company.core.abstracts;

import com.company.entities.concretes.User;

public interface VerificationService {
    boolean isValid(User user);
    boolean checkLogin(String email,String password);
}
