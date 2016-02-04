import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;

import com.training.service.CustomerService;
import com.training.service.GreeterService;

public class Application {

	public static void main(String[] args){
		//CustomerService service= new CustomerServiceImpl();
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = app.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getLastName());
		
		GreeterService greetService = app.getBean("greeterService", GreeterService.class);
		greetService.send("test message");
		greetService.send("test message2");
		greetService.send("test message3");
		greetService.send("test message4");
		System.out.println("outputchannel:"+greetService.receive());
		
		//greetService.greet2("with response");
	}
}
