public class Ex17C3{
    public static void main(String[]args){
        int a = 1;
        int b = 2;
        do{
            System.out.println(a);
            a = a + b;
            b = b * 2;
        }while(a <= 10000);
    }
}