public class Main
{
    public static void selectionSort(int[] a, int n){
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
                
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
    }
	public static void main(String[] args) {
		int[] a={2,4,1,5,4,7};
		selectionSort(a,a.length);
		for(int num: a){
		    System.out.print(num+" ");
		}
	}
}
