package com.epam.Java8streamsandfeatures;
import java.lang.FunctionalInterface;
import java.util.*;

@FunctionalInterface
interface MyInterface{

 // abstract method
 List<String> isPalindromic(List<String> lst);
}

public class PalindromicString  {

 public static void main( String[] args ) {
	 List<String> l=new ArrayList<String>();
	 l.add("madam");
	 l.add("epam");
	 l.add("task");
	 l.add("abba");
 MyInterface ref=(li)->{
	 List<String> res=new ArrayList<String>();
	  for(int k=0;k<li.size();k++) {
		  String temp=li.get(k);
		  int fg=0;
		  int i = 0, j = temp.length() - 1; 
		  
	        while (i < j) { 
	  
	            if (temp.charAt(i) != temp.charAt(j)) {
	            	fg=1;
	                break;}

	            i++; 
	            j--; 
	        } 
	  
	    if(fg!=1) {
	    	res.add(temp);
		  }
	  }
	  return res;
 };
 
 
 
 System.out.println("List of palindromic words is = " + ref.isPalindromic(l));
 } 
}








