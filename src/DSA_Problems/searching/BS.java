package DSA_Problems.searching;

// Binary Search using recursion
public class BS {
    public static void main(String[] args) {
        int [] arr = {8,5,3,7,2,1,11,10,44,77,100};
        int target = 1;
        int ans = Search(arr ,target , 0 , arr.length - 1);
        System.out.println(ans);
    }
    static int Search(int [] arr , int target , int first , int last){
        if(first > last){
            return -1;
        }
        int mid = first + (last - first)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return Search(arr , target , first , mid - 1);
        }
            return Search(arr , target , mid + 1 , last);
    }
}
