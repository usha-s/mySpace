package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.model.User;
import shopping.repository.UserRepository;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Override
	public List<User> findAllUsers() {
		
		return userRepository.findUsers();
	}

	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		System.out.println("inside default constructor");
		
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
				
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
		
	}

	@Override
	public void createUser(String name) {
		userRepository.createUser(name);

	}

	@Override
	public void deleteUser(long id) {
		userRepository.deleteUser(id);

	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);

	}

}
