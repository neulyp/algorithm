package sort;

public class InsertionSort {
	public static void sort(int[] a){
		int n=a.length;		
		int j=0;
		for(int i=0;i<n;i++){
			int tmp=a[i];  //要插入排序的数
			/*for(j=i;j>0;j--){
				if(a[j-1]>tmp){
					a[j]=a[j-1];
				}else{
					break;
				}
			}*/
			for(j=i;j>0 && tmp<a[j-1];j--){
				a[j]=a[j-1];
			}
			a[j]=tmp;			
		}
	}
	public static void main(String[] args) {
		int[] a={9,2,4,7,4,10,3,8};
		sort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
}
