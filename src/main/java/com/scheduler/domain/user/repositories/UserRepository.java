package com.scheduler.domain.user.repositories;

import com.scheduler.domain.user.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by galih.a.pradana on 7/30/2016.
 */
public interface UserRepository extends CrudRepository<User, Integer>{

    User findById(int id);
}
