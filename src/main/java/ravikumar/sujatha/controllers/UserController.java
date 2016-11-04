package ravikumar.sujatha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ravikumar.sujatha.domain.User;
import ravikumar.sujatha.repository.UserRepository;

/**
 * Created by sujatharavikumar on 11/3/16.
 */

@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class UserController {

    @Autowired
    UserRepository repo;

    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String createUser (User user) {
        try {
            repo.saveAndFlush(user);
        } catch (DataIntegrityViolationException e) {
            return "Error! User already exists.";
        }
        return "Success!";
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public User authenticateUser (User user) {
        User userToValidate = repo.findByUsername(user.getUsername());
        if (userToValidate.getPassword().equals(user.getPassword())) {
            return userToValidate;
        } else {
            return null;
        }

    }

}
