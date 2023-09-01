package com.map;

import java.util.*;

public class MapImp {

	static Map<String, TreeSet<String>> distList = new HashMap<String, TreeSet<String>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> dist = new TreeSet<String>();
		dist.add("Mumbai");
		dist.add("Pune");
		dist.add("Solapur");
		
		distList.put("MH", dist);
		dist.clear();
		//TreeSet<String> dist1 = new TreeSet<String>();

		dist.add("Baroda");
		dist.add("GandhiNagar");
		dist.add("Ahmd");
		distList.put("GJ", dist);
		
		System.out.println(distList);
	}

}
