package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.core.concretes.EmailValidatorManager;
import com.company.core.concretes.GoogleServiceAdapter;
import com.company.dataAccess.concretes.InMemoryUserDao;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Tayyip","Altunöz","tayyipaltunoz@gmail.com","qwert");

        UserService userService = new UserManager(new EmailValidatorManager(),new GoogleServiceAdapter(),new InMemoryUserDao());

        userService.singUp(user);

        userService.logIn("tayyipaltunoz@gmail.com","qwert");
    }
}
