import java.util.*;
public class Duplicate {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter the number of array element");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        boolean hasDuplicate=false;
        for(int num:arr){
            if(map.containsKey(num)){
                hasDuplicate=true;
                break;

            }
            else{
                map.put(num,1);
            }
        }
        if(hasDuplicate){
            System.out.println("the array contains at most one duplicate element");
        }
            else{
                System.out.println("the array does not contain any duplicate");
            }
        }
        
        

    }
    

