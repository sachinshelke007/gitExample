package com.starsun.impl;

import com.starsun.jdbc.CreateJdbc;

public class Impl {
		public static void  main(String[] args) {
		
			CreateJdbc c =new CreateJdbc();
		if(c.getConnnection("checkJDBC","root","root123") != null){
			System.out.println("Conncetion created sucessfully");
		}
		
	
	}

}
