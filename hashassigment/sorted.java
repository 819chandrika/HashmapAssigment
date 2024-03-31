import java.util.*;
public class sorted {
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of key-value pairs");
       int n=sc.nextInt();
       TreeMap<String,Integer>map=new TreeMap<>();
       System.out.println("enter the key-value pairs");
       for(int i=0;i<n;i++){
        int key=sc.nextInt();
        String value=sc.next();
        map.put(value,key);

       }
       
       
       System.out.println("the map is:"+map);
    }
    
}
