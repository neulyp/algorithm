package sort;

/**
 * 快排
 * @author neuly
 *
 */
public class QuickSort {
	
	public static int[] swap(int[] s, int l,int r){
		//将中间的数和第一个数进行交换
		int tmp=s[l];
		s[l]=s[(r-l)/2];
		s[(r-l)/2]=tmp;
		return s;
	}
	
	public static void quickSort(int[] s, int l,int r){
		if(l<r){	
			int i=l,j=r,x=s[l];
			while(i<j){
				while(i<j&&s[j]>=x) j--;
				if(i<j) s[i++]=s[j];
				
				while(i<j&&s[i]<=x) i++;
				if(i<j) s[j--]=s[i];
			}
			s[i]=x;
			quickSort(s, l, i-1);
			quickSort(s, i+1, r);
		}
	}
	
	public static void sort(int[] a){
		quickSort(a, 0, a.length-1);
	}
	public static void main(String[] args) {
		int[] a={2,4,7,4,10,3,8};
		sort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
}
