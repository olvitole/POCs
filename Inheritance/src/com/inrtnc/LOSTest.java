package com.inrtnc;

public class LOSTest {

	public static void main( String[] args ){
		LOSChild loschild = new LOSChild();
		loschild.setId(333);
		loschild.setName("xyz");
		loschild.setLevel(99);
	   
		System.out.println("specific "+loschild.toString());
		
		
		
LOSParent parent =(LOSParent) loschild;

System.out.println("generic "+parent.toString());


	    
	  
	}
}
