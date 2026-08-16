package DSA_Problems.searching;
import java.util.ArrayList;
public class Subsequence {
    public static void main(String[] args) {

        SubSequence(" " , "abc");

        System.out.println(SubSeqRet("" , "abc"));
    }
    //without return type
    static void SubSequence(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubSequence(p + ch, up.substring(1));
        SubSequence(p , up.substring(1));
    }

    // Using ArrayList
    static ArrayList<String> SubSeqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = SubSeqRet(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}
