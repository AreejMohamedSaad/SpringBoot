package com.h2demorest.demoh2rest.services;

import com.h2demorest.demoh2rest.models.User;
import java.util.List;

public interface UsersInterface  {
//     User createUser(User);
     List<User> createUsers(List<User> users);
     List<User> getAllUsers();
     User getUserById(long id);
     User createUser(User user );
     User updateUser(User user);
     void deleteUser(long id);




}
