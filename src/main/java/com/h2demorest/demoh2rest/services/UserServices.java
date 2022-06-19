package com.h2demorest.demoh2rest.services;

import com.h2demorest.demoh2rest.exceptions.NotFound;
import com.h2demorest.demoh2rest.models.User;
import com.h2demorest.demoh2rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices implements UsersInterface {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return userRepository.findById(id).get();
        }
        else {
            throw new NotFound("Record is not found with this id");
        }
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        Optional<User> olduser = userRepository.findById(user.getId());
        User updateduser = olduser.get();
        if(olduser.isPresent()){
            updateduser.setName(user.getName());
            updateduser.setAge(user.getAge());
            updateduser.setJob(user.getJob());
            return updateduser;
        }
        else {
            throw new NotFound("Record is not found with this id");
        }
    }

    @Override
    public void deleteUser(long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.delete(user.get());
        }
        else {
            throw new NotFound("Record is not found with this id");
        }
    }
}
