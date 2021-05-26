package com.cmcprueba.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cmcprueba.soap.bean.User;
import com.cmcprueba.soap.service.UserDetailsService;
import com.cmcprueba.users.GetAllUserDetailsRequest;
import com.cmcprueba.users.GetAllUserDetailsResponse;
import com.cmcprueba.users.GetUserDetailsRequest;
import com.cmcprueba.users.GetUserDetailsResponse;
import com.cmcprueba.users.UserDetails;



@Endpoint
public class UserDetailsEndpoint {
	
	@Autowired
	UserDetailsService service;
	
	//method
	//input -GetUserDetailsRequest
	//output -GetUserDetailsResponse 
	
	//http://cmcprueba.com/user
	//GetUserDetailsRequest
	@PayloadRoot(namespace= "http://cmcprueba.com/users", localPart = "GetUserDetailsRequest")
	@ResponsePayload
	public GetUserDetailsResponse processCourseDetailsrequest
	(@RequestPayload GetUserDetailsRequest request) {
		GetUserDetailsResponse response = new GetUserDetailsResponse();
		
		User user = service.findById(request.getId());
		
		UserDetails userDetails = new UserDetails ();
		userDetails.setId(user.getId());
		userDetails.setName(user.getName());
		userDetails.setEmail(user.getEmail());
		userDetails.setPhone(user.getPhone());
		userDetails.setAuthentication(user.getAuthentication());
		response.setUserDetails(userDetails);
		return response;
		
	}
	
	private UserDetails mapUser(User user) {
		UserDetails userDetails = new UserDetails();

		userDetails.setId(user.getId());
		userDetails.setName(user.getName());
		userDetails.setEmail(user.getEmail());
		userDetails.setPhone(user.getPhone());
		userDetails.setAuthentication(user.getAuthentication());
		return userDetails;
	}
	private GetAllUserDetailsResponse mapAllCourseDetails(List<User> users) {
		GetAllUserDetailsResponse response = new GetAllUserDetailsResponse();
		for (User user : users) {
			UserDetails mapUser = mapUser(user);
			response.getUserDetails().add(mapUser);
		}
		return response;
	}
	
	@PayloadRoot(namespace = "http://cmcprueba.com/users", localPart = "GetAllUserDetailsRequest")
	@ResponsePayload
	public GetAllUserDetailsResponse processAllCourseDetailsRequest(
			@RequestPayload GetAllUserDetailsRequest request) {

		List<User> users = service.findAll();

		return mapAllCourseDetails(users);
	}
	
}
