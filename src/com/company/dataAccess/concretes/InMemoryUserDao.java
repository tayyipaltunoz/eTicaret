package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {
    private List<User> users = new ArrayList<User>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("Kullanıcı eklendi : " + user.geteMail());
    }

    @Override
    public void updateUser(User user) {
        User userToUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);

        userToUpdate.seteMail(user.geteMail());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setPassword(user.getPassword());
    }

    @Override
    public void deleteUser(User user) {
        User userToDelete = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
        users.remove(userToDelete);
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public User getUser(String eMail) {
        User user = users.stream().filter(u -> u.geteMail() == eMail).findFirst().orElse(null);
        return user;
    }
}
