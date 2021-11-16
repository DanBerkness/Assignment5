package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int updatedArraySize = 0;
	
	int arraySize = items.length;
	T newItem = null;

	@Override
	public int getSize() {
		for (int newSize = 14; newSize >= arraySize; newSize = newSize * 2) {
			Object[] items = new Object[newSize];
			arraySize = newSize;
			return arraySize;
		}
		return 0;
	}

	@Override
	public T get(int index) {
		items[index] = this.items;
		System.out.println(this.items.toString());
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(T item) {
		return false;
//		int lastItem = items.length;
//		 newItem = null;
//		for (Object thing : items) {
//			 if (items[arraySize] != null) {
//				updatedArraySize = (int) items[arraySize * 2];
//				items = resizedArray;
//				if (item != null) {
//					newItem =  (T) items[lastItem +1];
				}
			}