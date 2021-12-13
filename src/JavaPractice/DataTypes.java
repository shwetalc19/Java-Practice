package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	byte b21 = 10;
		b21=20;
		b21=30;
		byte b1 = 40;
		byte b2 = 0;
		byte b3 = 120;
		byte b4 = -50;
		System.out.println(b21);
		System.out.println(b1+b21);
		
		short s1 = 1234;
		System.out.println(s1);
		char a = 'a';
		char b = 'b';
		System.out.println(a);
		System.out.println(a+b);
		
		String x = "hello";
		String y = "Testing";
			int a = 100;
		int b = 200;
		
		System.out.println(x+y+a+b);
		
		char p = 'a';
		char q = 'b';
		System.out.println(p); //a
		System.out.println(p+q); //165
		System.out.println(p+""+q); //ab
		//System.out.println();
		int i=0;
		while (i<5)
		{
		System.out.println(i);
		++i;
		} 
		
		for (char j ='A'; j<='Z'; j++)
		{	
		System.out.print(j);
		}
		for (char j ='a'; j<='z'; j++)
		{	
		System.out.print(j);
		}
		for (int j =65; j<=90; j++)
		{	
		System.out.print((char)j);
		}
		for (int j =97; j<=122; j++)
		{	
		System.out.print((char)j);
		}*/
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);ar1.add(300);ar1.add(400);
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(ar);
		
		ArrayList<String> l1 = new ArrayList<String> (Arrays.asList("A", "B","C", "D","F"));
		ArrayList<String> l2 = new ArrayList<String> (Arrays.asList("A", "B","C", "D","E"));
		ArrayList<String> l3 = new ArrayList<String> (Arrays.asList("B", "A","C", "D","F"));
		ArrayList<String> l4 = new ArrayList<String> (Arrays.asList("P", "Q","R"));
/*
		Collections.sort(l3); // [A,B,C,D,E]
		System.out.println(l3);
		System.out.println(l1.equals(l2));  //false
		System.out.println(l1.equals(l3)); //true since l3 is sorted
		//l2.removeAll(l1);  
		//l2.retainAll(l1);
		l2.addAll(l4);	// l2 = [A, B, C, D, E, P, Q, R]
		System.out.println(l2);  
		
		ArrayList<String> clonelist = (ArrayList<String>)l4.clone();
		System.out.println(clonelist);*/
		
		l4.add(0, "X");   //[X, P, Q, R]
	//	l4.add(5, "S");   //IndexOutOfBoundsException since 4th position will be blank
		l4.add(4, "S");   //[X, P, Q, R, S]
		
		System.out.println(l4);
	}
}
