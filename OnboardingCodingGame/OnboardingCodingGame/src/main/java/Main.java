import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String enemy1 = scanner.next();
            int dist1 = scanner.nextInt();

            String enemy2 = scanner.next();
            int dist2 = scanner.nextInt();//TEST

            System.out.println(dist1<dist2?enemy1:enemy2);
        }
    }
}