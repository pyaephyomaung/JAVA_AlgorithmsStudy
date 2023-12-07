import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arry = new int[]{1,2,3,9,5,6};
        int key = in.nextInt();
        int foundIndex = -1;
        for(int i=0;i<arry.length;i++){
            System.out.println("Scanning Index "+i+" ...");
            if (arry[i] == key){
                foundIndex = i;
                System.out.println("found at-> "+i);
                break;
            }
        }

        if (foundIndex == -1)
            System.out.println("The input Key is not found...");
    }
}
