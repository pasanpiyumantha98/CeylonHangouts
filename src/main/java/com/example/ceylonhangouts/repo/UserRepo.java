package com.example.ceylonhangouts.repo;

import com.example.ceylonhangouts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value="select * from user where email=?1", nativeQuery = true)
    User getUserByEmail(String email);

    @Query(value="select max(id) from user", nativeQuery = true)
    Integer getMaxId();

    @Modifying
    @Query(value="update user set password=?1 where id=?2", nativeQuery = true)
    void updatePassword(String password, int id);
}
