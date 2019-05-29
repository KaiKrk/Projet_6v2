
package com.projet6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.projet6.Impl.User;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<User> findUserWithName(String username);

}

