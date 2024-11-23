package com.cjc.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String []args)
	{
	  Map<Integer,String> m=new HashMap<>();
	       m.put(5,"java");
	       m.put(6,"python");
	       m.put(5,"CJC");
	       m.put(15,"String");
	System.out.println(m);
	  String s=m.get(5);
	 System.out.println(s);
	}


}
