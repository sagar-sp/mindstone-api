package com.mindstone.mindstoneapi.Repository;

import com.mindstone.mindstoneapi.Entity.Userentity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userentity, Long> {

}
