package com.ozuduru.implementsorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	private static void printArray(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len; ++i)
			System.out.print(String.valueOf(arr[i]) + " ");
		System.out.println();
	}
	
	// Create unsorted array
	private static int[] createArray(int len) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < len; ++i)
			list.add(i);
		Collections.shuffle(list);
		
		int[] arr = new int[len];
		for(int i = 0; i < len; ++i)
			arr[i] = list.get(i);
		
		return arr;
	}
	
	public static void main(String[] args) {
		// Set the timer
		MyTimer timer = new MyTimer();
		timer.reset();
		
		int len = 30;
		
		//-------Insertion Sort
		int[] insertionSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(insertionSortArr);
		System.out.println("Sorted by Insertion Sort:");
		timer.start();
		SortingEngine.insertionSort(insertionSortArr);
		timer.stop();
		printArray(insertionSortArr);
		System.out.println("Execution time of Insertion Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
		
		//-------Selection Sort
		int[] selectionSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(selectionSortArr);
		System.out.println("Sorted by Selection Sort:");
		timer.start();
		SortingEngine.selectionSort(selectionSortArr);
		timer.stop();
		printArray(selectionSortArr);
		System.out.println("Execution time of Selection Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
		
		//-------Bubble Sort
		int[] bubbleSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(bubbleSortArr);
		System.out.println("Sorted by Bubble Sort:");
		timer.start();
		SortingEngine.bubbleSort(bubbleSortArr);
		timer.stop();
		printArray(bubbleSortArr);
		System.out.println("Execution time of Bubble Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
		
		//-------Merge Sort
		int[] mergeSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(mergeSortArr);
		System.out.println("Sorted by Merge Sort:");
		timer.start();
		SortingEngine.mergeSort(mergeSortArr, 0, len);
		timer.stop();
		printArray(mergeSortArr);
		System.out.println("Execution time of Merge Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
		
		//-------Quick Sort
		int[] quickSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(quickSortArr);
		System.out.println("Sorted by Quick Sort:");
		timer.start();
		SortingEngine.quickSort(quickSortArr, 0, len-1);
		timer.stop();
		printArray(quickSortArr);
		System.out.println("Execution time of Quick Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
		
		//-------Heap Sort
		int[] heapSortArr = createArray(len);
		System.out.println("Unsorted Array:");
		printArray(heapSortArr);
		System.out.println("Sorted by Heap Sort:");
		timer.start();
		SortingEngine.heapSort(heapSortArr);
		timer.stop();
		printArray(heapSortArr);
		System.out.println("Execution time of Heap Sort: " + timer.getTotalTimeInMilis() + "ms.\n");
		timer.reset();
	}

}
