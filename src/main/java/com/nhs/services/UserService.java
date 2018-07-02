package com.nhs.services;

import com.nhs.domain.User;

public interface UserService {

	User findByEmail(String email);

}
