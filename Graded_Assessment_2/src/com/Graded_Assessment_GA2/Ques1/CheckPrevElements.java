package com.Graded_Assessment_GA2.Ques1;

public class CheckPrevElements {

	public static int checkPrevElements(int arr[], int curr_idx, int N) {

		int temp_idx = curr_idx;

		for(int j=0; j<temp_idx; j++) {
			if(arr[j] == N) {
				System.out.print(arr[j]);
				System.out.print(" ");
				break;
			}
			
			if((arr[j] != N) && (j == (temp_idx-1)))
					return N;

		} //Ending of for loop
		N--;
		N = checkPrevElements(arr, temp_idx, N);
		
		return N;
	}

}
