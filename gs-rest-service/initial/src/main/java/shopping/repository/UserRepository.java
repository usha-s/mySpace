package shopping.repository;

import java.util.List;

import shopping.model.User;

public interface UserRepository {
	
	
		public User findById(long id);
		public User findByName(String name);
		public void createUser(String name);
		public void deleteUser(long id);
		public void updateUser(User user);
		public List<User> findUsers();
		


}
