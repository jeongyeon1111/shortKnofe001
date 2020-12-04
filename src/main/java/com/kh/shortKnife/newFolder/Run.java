package com.kh.shortKnife.newFolder;

import org.springframework.beans.factory.annotation.Autowired;

public class Run {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User01 user = new User01("001","¾ÆÁÜ¸¶");
	    System.out.println(user);
		System.out.println(user.getId());
		System.out.println(user.getName());
		
		user.setName("¿¹»Ú´Ï");
	    System.out.println(user);
		System.out.println(user.getId());
		System.out.println(user.getName());
		
		
	}

}
