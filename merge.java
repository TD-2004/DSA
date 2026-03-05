//merge two sorted arrays and also remove duplicates
public class merge{
    public static void main(String args[]){
        int[] arr1={7,8,8,9};
        int[] arr2={4,4,5,5,6};
        int[] merged= new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(k==0 || merged[k-1]!=arr1[i]) //to avoid duplicates
                    merged[k++]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(k==0 || merged[k-1]!=arr2[j]) //to avoid duplicates
                    merged[k++]=arr2[j];
                j++;
            }
            else if(k==0 || merged[k-1]!=arr1[i]){ //to avoid duplicates
                    merged[k++]=arr1[i];
                i++;
                j++;
            }
        }
            while(i<arr1.length){
                if(k==0 || merged[k-1]!=arr1[i]) //to avoid duplicates
                    merged[k++]=arr1[i];
                i++;
            }
            while(j<arr2.length){
                if(k==0 || merged[k-1]!=arr2[j]) //to avoid duplicates
                    merged[k++]=arr2[j];
                j++;
            }

        
    
        System.out.println("Merged array without duplicates:");
        for(int m=0;m<k;m++){
            System.out.print(merged[m]+" ");
        }
    }
    }

