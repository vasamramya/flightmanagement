package com.capgi;

import java.util.concurrent.ConcurrentHashMap;

public class CHashMap {
	
	public ConcurrentHashMap<Integer,String> getMap(){
		ConcurrentHashMap<Integer,String> chmap=new ConcurrentHashMap<Integer,String>();
		chmap.put(1,"ram");
		chmap.put(2,"sam");
		chmap.put(3,"dam");
		chmap.put(4,"zam");
		
		
		
		
		return chmap;
	}

	public static void main(String[] args) {
		CHashMap cmap=new CHashMap();
		ConcurrentHashMap<Integer,String> map=cmap.getMap();
		System.out.println(map);
		String str=map.search(1000,(key,value)->value.startsWith("s")?"present":"Not present"
	);	
		                           
		
		System.out.println(str);
		
		

	}

}
