package com.training.myapp;  
  
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration  
public class SpringIntegrationTest {  
// private final static Logger logger = LoggerFactory  
//   .getLogger(SpringIntegrationTest.class);  
//  
 @Autowired  
 @Qualifier("customerinputChannel")  
 MessageChannel customerinputChannel;  
  
 @Autowired  
 @Qualifier("outputChannel")  
 PollableChannel outputChannel;  
  
 @Test  
 public void test() {  
	
	 customerinputChannel.send(new GenericMessage<String>("World"));  
  assertEquals(outputChannel.receive().getPayload(), "Hello World");  
 // logger.debug("Checked basic Hello World with Spring Integration");  
 }  
  
}  