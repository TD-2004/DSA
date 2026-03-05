import java.util.HashSet;
public class remove_duplicates {
    public static int solution(int arr[],int n){
        HashSet<Integer> seen=new HashSet<>();
        for(int num:arr){
           // int num=arr[i];
            if(!seen.contains(num)){
                seen.add(num);
                arr[seen.size()-1]=num;

            }
        }
  //time complexity: O(n) space complexity: O(n)
        return seen.size();
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,4};
        remove_duplicates obj=new remove_duplicates();
        int m=arr.length;
        int result=obj.solution(arr,m);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+"|");
        }
       // System.out.println(result);
    }
    
}
