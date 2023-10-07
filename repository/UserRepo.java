package com.bridgelabz.bookstoreapp.repository;

import com.bridgelabz.bookstoreapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
//    boolean findUserByEmail(String email);
    User findUserByEmail(String email);

    User findByEmail(String email);

//    User getPassword();



    boolean existsByEmail(String email);
}
