package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int itemsPosition = 0;

	int arraySize = items.length;

	@Override
	public boolean add(T item) {
		//If array is not full, add to this array
		if (items[arraySize - 1] == null) {
			items[itemsPosition] = item;
			itemsPosition++;
			return true;
		//If array is full create new array double in size
		} else {
			Object[] items2 = new Object[arraySize * 2];

			if (items[items.length - 1] != null) {
				arraySize = items2.length;
			}
			//Copy elements of old array to new array
			for (int i = 0; i < items.length; i++) {
				items2[i] = items[i];
			}
			items = items2;
			items2[itemsPosition] = item;
			itemsPosition++;
			return true;
		}
	}

	@Override
	public int getSize() {
		return items.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		String currentObject = (String) items[index];
		return (T) currentObject;
	}

}
