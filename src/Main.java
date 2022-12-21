import java.util.Random;

public class Main {
    public static void main(String[] args) {

        myMethod( new int[15]);

    }
    public static void myMethod(int [] array){
        Random random = new Random();
        for (int i = 0;i< array.length; i++) {
           array[i]= random.nextInt(1,49);
                System.out.print(array[i]*2+" ");

        }
    }
}