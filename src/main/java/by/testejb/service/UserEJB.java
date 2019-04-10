package by.testejb.service;

import by.testejb.entity.User;
import by.testejb.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserEJB {

    @Inject
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.getAllUsers().get(id.intValue());
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }
}
