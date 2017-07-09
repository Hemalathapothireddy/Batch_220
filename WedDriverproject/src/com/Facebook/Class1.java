
package com.Facebook;

import org.testng.annotations.Test;

public   class Class1 {
	public void add (){
		System.out.println("this from add method class1");
	}
	public void delete(){
		System.out.println("this is from delete");
	}
	public Class1(){
		System.out.println("this from class1 constructor");
	}
	public void delete(int a){
		delete();
		System.out.println("this is from delete with para");
		System.out.println(a);
		}

		}
		
		
	
		
		
		
	



