package com.crucerne.www.insertionsort;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	/*
	 * The method takes a list collection of integers as argument, sorts it via
	 * insertion sort, and returns a sorted list collection of the integers. The
	 * sorting algorithm involves creating a new LinkedList to store the sorted
	 * integers. It will iterate through the argument list and check whether the
	 * current element is less than any elements in the new LinkedList. If so,
	 * the current element will take the position of the LinkedList element it
	 * was compared to. Else, the current element's value is greater than all
	 * the elements in the LinkedList and the current element will be placed at
	 * the end of the LinkedList instead.
	 */
	public static List<Integer> insertionSort(List<Integer> numbers) {
		// LinkedList to store all the sorted integers.
		List<Integer> sortedList = new LinkedList<Integer>();

		// Iterating through the list parameter and obtaining the current element.
		unsortedList: for (Integer number : numbers) {
			// Iterating through the new LinkedList and comparing it to the current element.
			for (int i = 0; i < sortedList.size(); i++) {
				// Checking whether the current element's value is less than any elements in the LinkedList.
				if (number < sortedList.get(i)) {
					// Lesser value found; adding new element and replacing pointers in the LinkedList.
					sortedList.add(i, number);	
					continue unsortedList;
				}
			}
			// Current element's value is greater than all values in the LinkedList; adding current element at the end of the LinkedList.
			sortedList.add(sortedList.size(), number);
		}
		return sortedList;
	}

}
