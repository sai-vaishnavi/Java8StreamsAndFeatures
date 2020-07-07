package com.epam.Java8streamsandfeatures;
import java.util.*;
import java.util.stream.Collectors;
/**
 * Hello world!
 *
 */
public class ListOfWordsWIthaAndLen3 
{
    public static void main( String[] args )
    {
       List<String> l=new ArrayList<String>();
    
       l.add("abc");
       l.add("act");
       l.add("add");
       l.add("app");
       l.add("do");
       l.add("fast");
       l.add("epam");
       l.add("task");
       List<String> filtered = l.stream()
               .filter(x -> x.length()==3 && x.charAt(0)=='a')
               .collect(Collectors.toList());
System.out.printf(" Given list is : %s, filtered list : %s %n", l, filtered);
    }
}