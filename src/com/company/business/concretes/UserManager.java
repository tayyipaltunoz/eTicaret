package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.abstracts.ValidationService;
import com.company.core.abstracts.VerificationService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

public class UserManager implements UserService {
    private ValidationService validationService;
    private VerificationService verificationService;
    private UserDao userDao;

    public UserManager(ValidationService validationService, VerificationService verificationService, UserDao userDao) {
        this.validationService = validationService;
        this.verificationService = verificationService;
        this.userDao = userDao;
    }

    @Override
    public void singUp(User user) {
        if (!verificationService.isValid(user)) {
            System.out.println("Kullanici bilgileri gecersiz.");
        } else {
            userDao.addUser(user);
            validationService.sendMail();
            System.out.println("Yeni kullanici olusturuldu.");
        }
    }

    @Override
    public void logIn(String email, String password) {
        if (!verificationService.checkLogin(email, password)) {
            System.out.println("Giris yapildi.");
        } else {
            System.out.println("Kullanici bilgileri gecersiz.");
        }
    }
}
