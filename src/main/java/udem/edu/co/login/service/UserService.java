package udem.edu.co.login.service;

import udem.edu.co.login.entities.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public User findByIdUser();

    public User createUser();
    public User UpdateUser();

    public User deleteUser();
}
