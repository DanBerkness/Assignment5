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
//		myCustomList.add("noon");
//		myCustomList.add("in");
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
		myCustomList.add("Added item");
		myCustomList.get(1);
				
		System.out.println("The new array size is " + myCustomList.getSize());
		System.out.println("---------------------");
		System.out.println("The get method works " + myCustomList.get(1));
		System.out.println("---------------------");
		System.out.println("The add method works " + myCustomList.add("Last item"));
		System.out.println("---------------------");
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}

	}

}