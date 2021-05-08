package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void addUser(User user) {
        System.out.println("Kullanıcı hibernate ile eklendi " + user.getFirstName());
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUser(String eMail) {
        return null;
    }
}
