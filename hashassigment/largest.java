import java.util.*;
public class largest {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("enter the number of element in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],1);
        }
    }
    
    System.out.println("The largest element is: " + map.lastEntry().getKey());

    }

