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
		for (int i = 0; i < arraySize; i++) {

			if (items[i] == null && i == arraySize) {
				items[i] = item;
				
				System.out.println(item);
				if (items[i] == null || i == arraySize) {
					updatedArraySize = arraySize * 2;
					Object[] temp = new Object[updatedArraySize];
					temp = items;
					return true;
				}
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