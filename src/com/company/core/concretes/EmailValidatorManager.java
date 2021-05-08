package com.company.core.concretes;

import com.company.core.abstracts.ValidationService;

public class EmailValidatorManager implements ValidationService {
    @Override
    public void sendMail() {
        System.out.println("Hesabınızı gönderilen mailden doğrulayınız");
    }
}
