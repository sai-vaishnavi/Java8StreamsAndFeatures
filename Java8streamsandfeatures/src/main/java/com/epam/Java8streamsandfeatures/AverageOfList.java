package com.epam.Java8streamsandfeatures;
import java.util.*;
/**
 * Hello world!
 *
 */
public class AverageOfList 
{
    public static void main( String[] args )
    {
       List<Integer> l=new ArrayList<Integer>();
     for(int i=0;i<=10;i++) {
    	 l.add(i);
     }
     IntSummaryStatistics stats = l.stream().mapToInt((x) -> x).summaryStatistics();

     System.out.println("Average of all prime numbers : " + stats.getAverage());
    }
}