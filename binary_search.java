public class Main {
    public static void binarySearch(int[] a,int n,int x){
        int start=0;
        int end=n-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==x){
                System.out.println(mid);
                return;
            }
            else if(a[mid]>x){
                end=mid-1;
            }
            else if(a[mid]<x){
                start=mid+1;
            }
           
        }
         System.out.println("Not found");
    }
    public static void main(String[] args) {
       int[] a={1,4,5,6,7,10};
       int x=7;
       int n=a.length;
       binarySearch(a,n,x);
    }
}
