package patterns;

public class p3 {
    public static void main(String[] args) {
        p3(4);
    }
    static void p3(int n){
        for(int row = n; row >= 1; row--){
            for(int col = row; col >=1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
