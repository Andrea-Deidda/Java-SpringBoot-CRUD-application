package com.thenetvalue.sbTutorial1.repository;

import com.thenetvalue.sbTutorial1.model.User;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {
   static Map<Integer, User> users = new HashMap<>();
   static int lastIndex = 0;

   public static int addUser(User user){
       user.setId(++lastIndex);
       users.put(user.getId(), user);
       return 1;
   }

   public static User getUserById(int id){
       return users.get(id);
   }

   public static Map<Integer, User> allUsers(){
       return users;
   }

   public static int updateUser(User user){
       users.put(user.getId(), user);
       return 1;
   }

}
