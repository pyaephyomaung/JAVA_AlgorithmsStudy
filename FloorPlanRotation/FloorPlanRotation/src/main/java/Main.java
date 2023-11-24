public class Main{

    private static String[][] originalFloor ;
    private static int floorSize = 5;
    private static int rotateStartRow = 2;
    private static int getRotateStartCol = 2;

    private static int rotateSize = 3;

    private static int rotateDegree = 90;
    public static void main(String[] args) {
        rotateFloor(rotateDegree);
    }

    private static void rotateFloor(int degree){

        originalFloor = new String[][]{
                {"0","0","0","0","0"},
                {"0","1","2","3","0"},
                {"0","4","5","6","0"},
                {"0","7","8","9","0"},
                {"0","0","0","0","0"},
        };

        System.out.println("Original Floor Plan");
        for(int i = 0;i<floorSize;i++){
            for(int j =0;j<floorSize;j++){
                System.out.print(originalFloor[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int rotateTimes = degree/90;

        for(int i=0;i<rotateTimes;i++){
            singleRotation();
        }

    }

    private static void singleRotation(){

        System.out.println("Rotation started!!");

        String[][] changedPortion = new String[rotateSize][rotateSize];

        for(int i = 0;i<rotateSize;i++){
            for(int j =0;j<rotateSize;j++){
                changedPortion[i][j] = originalFloor[i + (rotateStartRow - 1)][j + (getRotateStartCol -1)];
            }
        }

        for(int i = 0;i<rotateSize;i++){
            for(int j =0;j<rotateSize;j++){
                System.out.print(changedPortion[i][j]+" ");
            }
            System.out.println();
        }


        for(int i = 0;i<rotateSize;i++){
            for(int j =0;j<rotateSize;j++){
                if (i==0){
                    rotateTopRow(changedPortion[i][j],j);
                }else if(i== (rotateSize-1)){
                    rotateBottomRow(changedPortion[i][j],j);
                }else if(j==0){
                    rotateLeftColumn(changedPortion[i][j],i);
                }else if(j== (rotateSize - 1)){
                    rotateRightColumn(changedPortion[i][j],i);
                }
            }
        }

        System.out.println("Rotation End!!");

        for(int i = 0;i<floorSize;i++){
            for(int j =0;j<floorSize;j++){
                System.out.print(originalFloor[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

    }

    private static void rotateTopRow(String floorContent,int changeCol){
        int newRow = (rotateStartRow -1) + changeCol;
        int newColumn = (getRotateStartCol - 1) + (rotateSize - 1);

        originalFloor[newRow][newColumn] = floorContent;
    }

    private static void rotateBottomRow(String floorContent,int changeCol){
        int newRow = (rotateStartRow -1) + changeCol;
        int newColumn = (getRotateStartCol - 1) ;

        originalFloor[newRow][newColumn] = floorContent;

    }

    private static void rotateLeftColumn(String floorContent,int changeRow){
        int newRow = (rotateStartRow -1) ;
        int newColumn = (getRotateStartCol - 1) + changeRow ;

        originalFloor[newRow][newColumn] = floorContent;

    }

    private static void rotateRightColumn(String floorContent,int changeRow){
        int newRow = (rotateStartRow -1) + (rotateSize - 1) ;
        int newColumn = (getRotateStartCol - 1) + changeRow ;

        originalFloor[newRow][newColumn] = floorContent;

    }
}