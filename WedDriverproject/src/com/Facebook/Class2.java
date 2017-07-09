package com.Facebook;

import org.testng.annotations.Test;

public class Class2 extends Class1 {
		public void add(){
			System.out.println("this from add method from class2");
		}
	public Class2(){
		System.out.println("from class2 constructor");
	}
		public  Class2(String name){
			this();
			System.out.println(name);
		}
		public void sub(){
			super.add();
			System.out.println("this is from sub class2");
		}
		
	
	public static void main(String[] args){
		Class2 obj=new Class2("jay");
		
		obj.add();
		obj.delete(11);
		obj.sub();
	
		
		
		
	}
	}