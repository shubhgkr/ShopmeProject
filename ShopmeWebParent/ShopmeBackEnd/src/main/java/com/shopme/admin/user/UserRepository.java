package com.shopme.admin.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shopme.common.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

//	Here we can write a custom query as well using @Query annotation like this:
	@Query("SELECT u from User u WHERE u.email = :email")
	User getUserByEmail(@Param("email") String email);

//	Or we can take help from SpringData JPA which will write the query for us automatically.
//	User findByEmail(@Param("email") String email);
}
