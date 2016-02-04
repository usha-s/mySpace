package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.stereotype.Service;

@Service("greeterService")
public class GreeterServiceImpl {//implements GreeterService {
//
//	@Autowired
//	private MessageChannel customerinputChannel;
//	
//	@Autowired
//	private PollableChannel outputChannel;
//	
//	@Autowired
//	private CustomerService customerGateway;
//	
//
//	
//	public void setCustomerService(CustomerService customerService){
//		this.customerGateway = customerService;
//		
//	}
//	
//	 @Override
//	    public void send(String name)
//	    {
//		 customerinputChannel.send( MessageBuilder.withPayload( name ).build() );
//	    }
//	 @Override
//	    public String receive()
//	    {
//		 return (String) outputChannel.receive().getPayload();
//	    }

}
