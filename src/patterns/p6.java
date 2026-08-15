package patterns;

public class p6 {
    public static void main(String[] args) {
        p6(4);
    }
    static void p6(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j =0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
