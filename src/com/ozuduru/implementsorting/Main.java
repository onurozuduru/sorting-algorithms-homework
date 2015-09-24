/*
Copyright (c) 2015, Onur Ozuduru
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, this
  list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice,
  this list of conditions and the following disclaimer in the documentation
  and/or other materials provided with the distribution.

* Neither the name of sorting-algorithms-homework nor the names of its
  contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
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
