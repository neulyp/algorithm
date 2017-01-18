package sort;

public class BubbleSort {
	public static void sort(int[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a={2,4,7,4,10,3,8};
		sort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
}
