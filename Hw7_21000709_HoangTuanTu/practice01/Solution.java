package Hw7_21000709_HoangTuanTu.practice01;

public class Solution {
	static int isRepresentingBST(int[] arr , int N){
		for (int i = 0; i  < N - 1; i++){
			if (arr[i] > arr[i+1]){
				return 0;
			}
		}
		return 1;
	}
}