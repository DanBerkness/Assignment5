package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Object[] resizedArray = new Object[10];
	int updatedArraySize = 0;
	int arraySize = items.length;

	@Override
	public int getSize() {
		return arraySize;
	}

	@Override
	public T get(int index) {
		T item = null;
		items[index] = item;
		System.out.println(items[index]);
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(T item) {
		int i = 0;
		for (Object object : items) {
			int j = 0;
			if ( j <= i) {
				j++;
			if (items[i] == null ) {
				items[i] = item;
				
				
				if (i == arraySize - 1) {
					Object[] biggerArray = new Object[arraySize * 2];
					
//					for ( object : items) {
//						items[j] = item;
//						item = (T) biggerArray[j];
//						j++;
//					}
					return true;
				}
			}
				i++;
				break;
			} else
				continue;

		}
		if (item != null) {
			return true;
		}

		return false;

	}
}