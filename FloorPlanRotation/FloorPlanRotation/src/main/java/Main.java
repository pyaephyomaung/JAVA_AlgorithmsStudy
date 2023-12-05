public class Main{

    private static String[][] originalFloor;
    private static int originalSize = 6;

    private static int orientStartX = 2;
    private static int orientStartY = 2;
    private static int orientSize = 4;

    private static int orientTime = 1;
    public static void main(String[] args) {
        rotateFloor();
    }

    private static void rotateFloor(){

        //set Original Floor Data
        originalFloor = new String[][]{
                {"0","0","0","0","0","0"},
                {"0","a","b","c","d","0"},
                {"0","e","f","g","h","0"},
                {"0","i","j","k","l","0"},
                {"0","m","n","o","p","0"},
                {"0","0","0","0","0","0"}

        };

        //Display Original Floor Before Rotation
        for(int i =0;i<originalSize;i++){
            for(int j=0;j<originalSize;j++){
                System.out.print(originalFloor[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i =0;i<orientTime;i++){
            rotateOneTime();
        }

        //display Floor Data

        for(int i =0;i<originalSize;i++){
            for(int j=0;j<originalSize;j++){
                System.out.print(originalFloor[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotateOneTime(){

        //set rotatePortionData
        String[][] rotatePortion = new String[orientSize][orientSize];

        int originalX ,originalY = 0;
        for(int x=0;x<orientSize;x++){
            for(int y=0;y<orientSize;y++){
                originalX = x + (orientStartX - 1);
                originalY = y + (orientStartY - 1);
                rotatePortion[x][y] = originalFloor[originalX][originalY];
            }
        }

        //display rotatePortion
        for(int x=0;x<orientSize;x++){
            for(int y=0;y<orientSize;y++){
                System.out.print(rotatePortion[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println();


        //loop rotatePortion and update to original Floor
        String rotateData = "";
        for(int x=0;x<orientSize;x++){
            for(int y=0;y<orientSize;y++){
                rotateData = rotatePortion[x][y];
                if (x == 0){ // TOP
                    rotateTop(rotateData , y);
                }else if (x == (orientSize - 1)){ // BOTTOM
                    rotateBottom(rotateData , y);
                }else if (y == 0){ // LEFT
                    rotateLeft(rotateData , x);
                }else if (y == (orientSize - 1)){ // RIGHT
                    rotateRight(rotateData , x);
                }
            }
        }

        //Method Ends Here
    }

    private static void rotateTop(String data,int y){
        int newX =(orientStartX -1);
        int newY = (orientStartY -1);

        newX = newX + y;
        newY = newY + (orientSize - 1);

        originalFloor[newX][newY] = data;
    }

    private static void rotateBottom(String data,int y){
        int newX =(orientStartX -1);
        int newY = (orientStartY -1);

        newX = newX + y;

        originalFloor[newX][newY] = data;
    }

    private static void rotateLeft(String data,int x){
        int newX =(orientStartX -1);
        int newY = (orientStartY -1);

        newY = newY + (  (orientSize - 1) - x);

        originalFloor[newX][newY] = data;

    }

    private static void rotateRight(String data,int x){
        int newX =(orientStartX -1);
        int newY = (orientStartY -1);

        newX = newX + (orientSize - 1);
        newY = newY + (  (orientSize - 1) - x);

        originalFloor[newX][newY] = data;

    }



}