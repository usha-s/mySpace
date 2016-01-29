package shopping.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import shopping.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	private List<User> users = new ArrayList<User>();
	private final AtomicLong counter = new AtomicLong();
	
	public UserRepositoryImpl() {
		System.out.println("inside default repository");
	}
	
	@Override
	public List<User> findUsers() {
		
		 return users;
	}
	@Override
	public User findById(long id) {
		 for(User user : users){
	            if(user.getId() == id){
	                return user;
	            }
		 }
		 return null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(String name) {
		User user = new User(name,counter.incrementAndGet());
		users.add(user);
		System.out.println("created" + user);

	}

	@Override
	public void deleteUser(long id) {
		for(User user : users){
			System.out.println("user id "+id+"removed");
            if(user.getId() == id){
            	users.remove(user);
            }
		}
	}

	@Override
	public void updateUser(User user) {
		for(User currUser : users){
			System.out.println("Update User");
            if(user.getId() == currUser.getId()){
            	currUser.setName(user.getName());
            }
		}

	}

}
