package com.thenetvalue.sbTutorial1.service;

import com.thenetvalue.sbTutorial1.dao.DbUserDAO;
import com.thenetvalue.sbTutorial1.dao.UserDAO;
import com.thenetvalue.sbTutorial1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    DbUserDAO userDAO;

    @Autowired
    public UserService(@Qualifier("dbUserDAO") DbUserDAO userDAO){
        this.userDAO = userDAO;
    }

    public String addUser(User user){
        User result = userDAO.save(user);
        if (result != null){
            return "Utente salvato correttamente";
        } else {
            return "Errore nel salvataggio dell'utente";
        }

    }

    public Optional<User> getUser(int id){
        return userDAO.findById(id);
    }

    public Iterable<User> allUsers(){
        return userDAO.findAll();
    }

    public String updateUser(int id, User user){
        user.setId(id);
        User result = userDAO.save(user);
        if(result != null){
            return "Aggiornamento avvenuto con successo";
        }
        else {
            return "Aggiornamento fallito";
        }
    }

    public String deleteUser(int id){
        Optional<User> userRecuperato = userDAO.findById(id);
        if (!userRecuperato.isPresent()){
            return "Utente non trovato";
        } else {
            userDAO.delete(userRecuperato.get());
            return "Utente cancelato correttamente";
        }
    }
}
