package com.ozuduru.implementsorting;

public class SortingEngine {
	// Helper method swap
	private static void swap(int[] arr, int firstInd, int secondInd) {
		if(firstInd < 0 || secondInd < 0)
			return;
		
		int len = arr.length;
		if(len == 0 || len < firstInd || len < secondInd)
			return;
		
		int temp = arr[firstInd];
		arr[firstInd] = arr[secondInd];
		arr[secondInd] = temp;
	}
	
	//-------Insertion Sort
	public static void insertionSort(int[] arr) {
		int len = arr.length;
		
		for(int i =  1; i < len; ++i) {
			for(int j = i; j > 0 && arr[j - 1] > arr[j]; --j)
				swap(arr, j, j-1);
		}
	}
	
	//-------Selection Sort
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		
		for(int i = 0; i < len - 1; ++i) {
			int minInd = i;
			
			for(int j = i + 1; j < len; ++j)
				if(arr[j] < arr[minInd])
					minInd = j;
			
			if(minInd != i)
				swap(arr, i, minInd);
		}
	}
	
	//-------Bubble Sort
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		boolean isSwapped = true;
		
		for(int j = 1; isSwapped; ++j) {
			isSwapped = false;
			
			for(int i = 0; i < len - j; ++i) {
				if(arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					isSwapped = true;
				}
			}
		}
	}
	
	//-------Merge Sort
	public static void mergeSort(int[] arr, int lowInd, int highInd) {
		int N = highInd - lowInd;
		if(N <= 1)
			return;
		int midInd =  lowInd + N/2;
		
		// Sort
		mergeSort(arr, lowInd, midInd);
		mergeSort(arr, midInd, highInd);
		
		// Merge
		int[] temp = new int[N];
		int i = lowInd;
		int j = midInd;
		
        for (int k = 0; k < N; ++k) {       	
        	if(i == midInd)
        		temp[k] = arr[j++];
        	
        	else if(j == highInd)
        		temp[k] = arr[i++];
        	
        	else if (arr[j] < arr[i])
        		temp[k] = arr[j++];
        	
        	else
        		temp[k] = arr[i++];
        }
        
        for(int k = 0; k < N; k++)
        	arr[lowInd + k] = temp[k];
	}
	
	//-------Quick Sort
	public static void quickSort(int[] arr, int lowInd, int highInd) {
		int ind = quickHelper(arr, lowInd, highInd);
		
		if(lowInd < ind - 1)
			quickSort(arr, lowInd, ind - 1);
		if(ind < highInd)
			quickSort(arr, ind, highInd);
	}
	
	private static int quickHelper(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int pivot =  arr[(left + right) / 2];
		
		while (i <= j) {
			while(arr[i] < pivot)
				++i;
			while(arr[j] > pivot)
				--j;
			if(i <= j) {
				swap(arr, i, j);
				++i;
				--j;
			}
		}
		return i;
	}

	//-------Heap Sort
	public static void heapSort(int[] arr) {
		int count = arr.length;
		
		heapify(arr, count);
		int end = count - 1;
		
		while(end > 0) {
			swap(arr, 0, end);
			siftDown(arr, 0, end - 1);
			--end;
		}
	}
	
	private static void heapify(int[] arr, int count) {
		int start = (count - 2) / 2;
		while(start >= 0) {
			siftDown(arr, start, count - 1);
			--start;
		}
	}
	
	private static void siftDown(int[] arr, int start, int end){
		int root = start;
	 
		while((root * 2 + 1) <= end) {
			int child = root * 2 + 1;
			
			if(child + 1 <= end && arr[child] < arr[child + 1])
				child = child + 1;
			if(arr[root] < arr[child]){
				swap(arr, root, child);
				root = child;
			}
			else
				return;
		}
	}
}
