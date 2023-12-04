public class Main{

    static String[][] originalFloor ;
    static int originalSize = 6;

    static int changeX = 2;
    static int changeY = 2;

    static int changeWidth = 4;

    static int rotateTime = 1;

    public static void main(String[] args) {
        roateFloor();
    }

    private static void roateFloor(){

        originalFloor = new String[][]{
                {"0","0","0","0","0","0"},
                {"0","a","b","c","d","0"},
                {"0","e","f","g","h","0"},
                {"0","i","j","k","l","0"},
                {"0","m","n","o","p","0"},
                {"0","0","0","0","0","0"}
        };

        String[][] tmpFloor = new String[changeWidth][changeWidth];

        //create tmpFloor

        for(int i=0;i<changeWidth;i++){
            for(int j=0;j<changeWidth;j++){

                tmpFloor[i][j] = originalFloor[i + (changeX - 1)][j + (changeY -1 )];

            }
        }

        //display tmpFllor

        for(int i=0;i<changeWidth;i++){
            for(int j=0;j<changeWidth;j++){

                System.out.print(tmpFloor[i][j] + " ");

            }
            System.out.println();
        }

        //loop tmp Floor and update Original Floor

        for(int i=0;i<changeWidth;i++){
            for(int j=0;j<changeWidth;j++){

                //Top
                if(i == 0){
                    rotateTop(tmpFloor[i][j],j);
                }else if(i == (changeWidth - 1)){ // Bottom
                    rotateBottom(tmpFloor[i][j],j);
                }else if(j == 0){ // Left
                    rotateLeft(tmpFloor[i][j],i);
                }else if(j == (changeWidth - 1)){ // right
                    rotateRight(tmpFloor[i][j],i);
                }

            }

        }


        //display originalFloor

        for(int i=0;i<originalSize;i++){
            for(int j=0;j<originalSize;j++){

                System.out.print(originalFloor[i][j] + " ");

            }
            System.out.println();
        }

    }

    private static void rotateTop(String data , int y ){
        int newX , newY;

        newX = y + (changeX - 1);
        newY = (changeWidth - 1) + (changeY - 1);

        originalFloor[newX][newY] = data;
    }

    private static void rotateBottom(String data , int y ){
        int newX , newY;

        newX = y + (changeX - 1);
        newY = (changeY - 1);

        originalFloor[newX][newY] = data;
    }

    private static void rotateLeft(String data , int x ){
        int newX , newY;

        newX =  (changeX - 1);
        newY = ( (changeWidth -1) -x)+(changeY - 1);

        originalFloor[newX][newY] = data;
    }

    private static void rotateRight(String data , int x ){
        int newX , newY;

        newX =  (changeWidth - 1)+(changeX - 1);
        newY = ( (changeWidth -1) -x)+(changeY - 1);

        originalFloor[newX][newY] = data;
    }
}