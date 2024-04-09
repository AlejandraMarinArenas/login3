package udem.edu.co.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.login.entities.User;
import udem.edu.co.login.service.UserService;
import udem.edu.co.login.repository.usuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    usuarioRepository usuarioRepository;

    @Override
    public List<User> findAllUser(){

        return (List<User>) usuarioRepository.findAll();
    }

    @Override
    public Optional<User> findByIdUser(String id){
        return usuarioRepository.findById(id);
    }

    @Override
    public User createUser(){
        return null;
    }
    @Override
    public User UpdateUser(){
        return null;
    }

    @Override
    public User deleteUser(){
        return null;
    }
}
