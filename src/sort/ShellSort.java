package sort;

public class ShellSort {
	public static void sort(int[] a){
		int n=a.length;
		int j;
		for(int gap=n/2;gap>0;gap/=2){
			for(int i=gap;i<a.length;i++){
				int tmp=a[i];
				for(j=i;j>=gap&&tmp<a[j-gap];j=j-gap){
					a[j]=a[j-gap];
				}
				a[j]=tmp;
			}
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
