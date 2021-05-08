package com.company.core.concretes;

import com.company.JGoogle.GoogleService;
import com.company.core.abstracts.VerificationService;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class GoogleServiceAdapter implements VerificationService {

    List<User> users = new ArrayList<User>();

    @Override
    public boolean isValid(User user) {
        GoogleService googleService = new GoogleService();
        return googleService.isValid();
    }

    @Override
    public boolean checkLogin(String email, String password) {
        for (User user : users) {
            if (user.geteMail() == email && user.getPassword() == password) {
                return true;
            }
        }
        return false;
    }
}
