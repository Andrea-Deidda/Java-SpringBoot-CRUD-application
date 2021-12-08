package com.thenetvalue.sbTutorial1.dao;

import com.thenetvalue.sbTutorial1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("dbUserDAO")
public interface DbUserDAO extends CrudRepository<User, Integer> {

}
