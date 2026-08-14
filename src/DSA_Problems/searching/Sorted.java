package DSA_Problems.searching;

public class Sorted {
    public static void main(String[] args) {
      int [] arr = {7,22,44,77,100};
        System.out.println(Sorted(arr , 0));
    }
    public static boolean Sorted(int [] arr , int index){
        if(index == arr.length -1){
            return true;
        }
        return(arr[index] < arr[index + 1] && Sorted(arr , index + 1));
    }

}
