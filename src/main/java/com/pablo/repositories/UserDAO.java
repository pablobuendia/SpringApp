package com.pablo.repositories;

import java.util.List;
import com.pablo.domain.User;


public interface UserDAO {

  List<User> findByEmail(String email);

}