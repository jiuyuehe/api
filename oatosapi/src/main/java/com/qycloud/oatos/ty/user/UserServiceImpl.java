package com.qycloud.oatos.ty.user;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


@WebService(endpointInterface = "com.qycloud.oatos.ty.user.UserService")
public class UserServiceImpl implements UserService {
	
//	@Autowired
//	private RestTemplate rest;

	@Override
	public boolean updateTheUser(String user) {
		//rest.p
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUsersCode(String user) {
		// TODO Auto-generated method stub
		return false;
	}

}
