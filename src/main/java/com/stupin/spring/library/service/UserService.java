package com.stupin.spring.library.service;

import java.util.List;

import com.stupin.spring.library.dto.PasswordDTO;
import com.stupin.spring.library.dto.UserDTO;
import com.stupin.spring.library.dto.UserLogDTO;
import com.stupin.spring.library.entity.Role;
import com.stupin.spring.library.entity.User;
import com.stupin.spring.library.entity.UserPasswordToken;

public interface UserService {

	boolean isUsernameAlreadyInUse(String username);
	
	boolean isEmailAlreadyInUse(String email);
	
	User saveReaderUser(UserDTO user, String changedByUsername);
	
	User saveSpecialUser(UserDTO user, String changedByUsername);
	
	User updateUser(int id, UserDTO userDTO, String changedByUsername);
	
	User enableUser(int id, String changedByUsername);
	
	User disableUser(int id, String changedByUsername);
	
	Role getRoleByName(String roleName);
	
	List<User> getAllUsers();
	
	User getUserById(int id);
	
	User getUserByUsername(String username);
	
	User getUserByEmail(String email);
	
	List<User> searchUsers(String searchText, int pageNo, int resultsPerPage);
	
	int searchUserPagesCount(String searchText, int resultsPerPage);
	
	int searchUsersResultsCount(String searchText);
	
	List<UserLogDTO> getUserLogs(int id);
	
	boolean isUserAlreadyHasResetPasswordToken(String email);
	
	UserPasswordToken createPasswordResetTokenForEmail(String email);
	
	UserPasswordToken updateResetPasswordTokenForEmail(String email);
	
	boolean isUserTokenValid(int userId, String token);
	
	void updateUserPassword(int userId, PasswordDTO passwordDTO);
	
	void deleteUserPassword(int userId);
}
