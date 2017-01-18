package sort;

import java.util.Arrays;

public class MergeSort {
	private static void sort(int[]a,int[]tmpArray, int left,int right){
	if(left<right){
		int mid=(left+right)/2;
		sort(a,tmpArray,left, mid);
		sort(a,tmpArray, mid+1, right);
		merge(a,tmpArray,left,mid+1,right);
	}
}
private static void merge(int[]a,int[]tmpArray,int leftPos,int rightPos,int rightEnd){
	int numElements=rightEnd-leftPos+1;	
	int leftEnd=rightPos-1;
	int tmpPos=leftPos;
	
	while(leftPos<=leftEnd&&rightPos<=rightEnd){
		if(a[leftPos]<a[rightPos]){
			tmpArray[tmpPos++]=a[leftPos++];
		}else{
			tmpArray[tmpPos++]=a[rightPos++];
		}
	}
	while(leftPos<=leftEnd) tmpArray[tmpPos++]=a[leftPos++];
	while(rightPos<=rightEnd) tmpArray[tmpPos++]=a[rightPos++];
	
	for(int i=0;i<numElements;i++,rightEnd--){
		a[rightEnd]=tmpArray[rightEnd];
	}
}

public static void mergeSort(int[] a){
	int[] tmpArray= new int[a.length];
	sort(a,tmpArray, 0, a.length-1);
	
}
public static void main(String[] args) {
	 // 初始化一个序列
    int[] array = {
            1, 3, 4, 5, 2, 6, 9, 7, 8, 0
    };

    mergeSort(array);
    System.out.println(Arrays.toString(array));
    
    
}
}
