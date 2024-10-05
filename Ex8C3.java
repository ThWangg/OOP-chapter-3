public class Ex8C3{
    public static void main(String[] args){
        double sum = 0;
        int i = 1;
        double SSH = 0;
        while(i <= 100){
            sum = sum + i;
            i = i + 1;
            SSH = SSH + 1;
        }
        System.out.println("Average 1 to 100= "+ sum/SSH);
    }
}