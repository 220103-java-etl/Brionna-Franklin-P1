package dev.franklin.service;

import dev.franklin.repository.UserDAO;
import dev.franklin.models.User;


public class UserService {
    private UserDAO userDAO = new UserDAO();

    public User login(String username, String password){
        User u = userDAO.getByUsername(username);

        if (u != null && u.getPassword().equals(password)) {
            return u;
        } else {
            return null;
        }
    }



    /**
     *     Should retrieve a User with the corresponding username or an empty optional if there is no match.
     */

}
