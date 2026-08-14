package DSA_Problems.stack;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        for(int i = 0; i < 5; i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
                System.out.println("customstack pop");
            }catch(Exception e){
                System.out.println("customstack is empty");
            }
        }
        DynamicStack stack2 = new DynamicStack();
        for(int i = 0; i < 9; i++){
            stack2.push(i);
        }
        while(!stack2.isEmpty()){
            try{
                System.out.println(stack2.pop());
                System.out.println("dynamicstack pop");
            }catch(Exception e){
                System.out.println("dynamicstack is empty");
            }
        }
    }
}
