import java.util.*;
public class Main
{
    public static void main(String[] args){
       String[] s={"geeks","geeksforgeeks","geekyogurt"};
       Arrays.sort(s);
       String prefix=s[0];
       for(int i=0;i<s.length;i++){
           while(s[i].indexOf(prefix)!=0){
               prefix=prefix.substring(0, prefix.length()-1);
               if(prefix.isEmpty()){
                   System.out.println(" ");
               }
           }
       }
       System.out.println(prefix);
	   
	   
}
}
