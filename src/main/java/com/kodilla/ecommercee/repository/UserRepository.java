package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    List<User> findAll();

    Optional<User> findByUsername(String username);
    Optional<User> findByUserKey(Long userKey);
    Optional<User> findByContent(Boolean content);

}
