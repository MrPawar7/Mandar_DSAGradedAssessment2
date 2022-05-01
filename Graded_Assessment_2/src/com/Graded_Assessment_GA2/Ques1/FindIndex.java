package com.Graded_Assessment_GA2.Ques1;

public class FindIndex {
	// Linear-search function to find the index of an element
		public static int findIndex(int arr[], int t)
		{
			// if array is Null
			if (arr == null) {
				return -1;
			}

			// find length of array
			int len = arr.length;
			int i = 0;

			// traverse in the array
			while (i < len) {
				// if the i-th element is t
				// then return the index
				if (arr[i] == t) {
					return i;
				}
				else {
					i = i + 1;
				}
			}
			return -1;
		}
}
