package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shopping.model.User;
import shopping.service.UserService;

@RestController

public class UserController {
	
	@Autowired	
	UserService userService;	
	
	 @RequestMapping(value="/users",method = RequestMethod.GET)
	    public List<User> getUsers() {
	      return userService.findAllUsers();
	    }
	 
	 @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
	    public User getUser(@PathVariable("id") long id) {
	     User user = userService.findById(id);
	     System.out.println(user.getId());
		 return user;
	    }
	
	 @RequestMapping(value="/user",method = RequestMethod.POST)
	    public void saveUser(@RequestParam(value="name") String name) {
		 userService.createUser(name);
	 }
	 
	 @RequestMapping(value="/user/{id}",method = RequestMethod.PUT)
	    public void updateUser(@PathVariable(value="id") String id,@RequestBody User user) {
		 System.out.println("update service");
		 userService.updateUser(user);
	 }
	 
	 @RequestMapping(value="user/{id}",method = RequestMethod.DELETE)
	    public void deleteUser(@PathVariable("id") long id) {
	    	userService.deleteUser(id);
	    }
}
