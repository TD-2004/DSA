import java.util.*;
public class movezeros{
    public static void main(String a[]){
        int arr[]={1,0,2,3,6,0,0,1,5,4,1,0};
        int size=arr.length;

        //process 1:

        // int[] arr1=new int[size];
        // for(int i=0,j=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr1[j]=arr[i];
        //         j++;
        //     }
        // }
        // for(int num:arr1){
        //     System.out.print(num+" | ");
        // }


        //process 2:
        //better solution using hashmap

        // ArrayList<Integer> map=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         map.add(arr[i]);
        //     }
        // }
        // for(int i=0;i<map.size();i++){
        //    arr[i]=map.get(i);
        // }
        // for(int i=map.size();i<arr.length;i++){
        //    arr[i]=0;
        // }
        // for(int num:arr){
        //     System.out.print(num+"|");
        // }

        //process 3:
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            System.out.println("No zero found in the array");
            return;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num:arr){
            System.out.print(num+"|");
        }

//time complexity of process 1 and 2 is O(n) and space complexity is O(n)
//time complexity of process 3 is O(n) and space complexity is O(1)-
    }
}