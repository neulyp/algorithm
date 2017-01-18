package sort;

public class HeapSort {
	private static int leftchild(int i){
		return 2*i+1;
	}
	
	private static void percDown(int[] a, int i,int n){
		int child;
		int tmp;
		for(tmp=a[i];leftchild(i)<n;i=child){
			child=leftchild(i);
			if(child!=n-1&&a[child]<a[child+1]){
				child++;
			}
			if(tmp<a[child]){
				a[i]=a[child];
			}else{
				break;
			}
		}
		a[i]=tmp;
	}
	
	public static void sort(int[] a){
		for(int i=a.length/2;i>=0;i--){
			percDown(a, i, a.length);
		}
		for(int i=a.length-1;i>0;i--){
			int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            percDown(a, 0, i);
		}
	}
	public void print(int[] list,int begin,int end){
		for(int i=0;i<begin;i++) System.out.print("\t");
		for(int i=begin;i<=end;i++) System.out.print(list[i] + "\t");
		System.out.println();
	}
	 public static void main(String[] args) {
	        // 初始化一个序列
	        int[] array = {
	                1, 3, 4, 5, 2, 6, 9, 7, 8, 0
	        };
	 
	        // 调用快速排序方法
	        HeapSort heap = new HeapSort();
	        System.out.print("排序前:\t");
	        heap.print(array, 0, array.length - 1);
	        heap.sort(array);
	        System.out.print("排序后:\t");
	        heap.print(array, 0, array.length - 1);
	    }
	
}
