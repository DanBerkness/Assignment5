package com.coderscampus.arraylist;



public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		
		myCustomList.add("for");
		myCustomList.add("get");
		myCustomList.add("it");
		myCustomList.add("is");
		myCustomList.add("for");
		myCustomList.add("sale");
		myCustomList.add("each");
		myCustomList.add("day");
		myCustomList.add("around");
		myCustomList.add("noon");
		myCustomList.add("in");
//		myCustomList.add("the");
//		myCustomList.add("market");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
//		myCustomList.add("it");
		
				
		System.out.println(myCustomList.getSize());
//		// ^^This proves that an item added via the the .add method worked.
//		System.out.println("---------------------");
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
////		^^Proves that .get method is working.
//		System.out.println(myCustomList.getSize());
//		//^^ Proves that overriding the .getSize method works
//		
	
		
		
	}

}