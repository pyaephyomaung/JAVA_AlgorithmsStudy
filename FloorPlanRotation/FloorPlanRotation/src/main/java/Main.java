public class Main{

    static String[][] originalFloor = new String[5][5];
    public static void main(String[] args) {

        changeFloorPlan();
    }

    static void changeFloorPlan(){

        int floorSize = 5;
        int startRow = 2;
        int startColumn = 2;
        int rotateSize = 3;
        int degree = 90;



        originalFloor = new String[][]{
                {"1","1","1","1","1"},
                {"0","1","2","3","0"},
                {"1","4","5","6","1"},
                {"0","7","8","9","0"}
        };

        System.out.println("**Original Plan**");
        for(String[] floorRows:originalFloor){
            for(String vals:floorRows){
                System.out.print("  "+vals+" ");
            }
            System.out.println();
        }

        String[][] rotatedPortion = new String[rotateSize][rotateSize];

        for (int i = 0;i<rotateSize;i++){
            for (int j = 0;j<rotateSize;j++){

                rotatedPortion[i][j] = originalFloor[i+(startRow - 1)][j+(startColumn-1)] ;
            }
        }
        System.out.println();
        System.out.println("**Changed Portion**");
        for(String[] floorRows:rotatedPortion){
            for(String vals:floorRows){
                System.out.print("  "+vals+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Changed Portion Confirmed");

        for (int i = 0;i<rotateSize;i++){
            for (int j = 0;j<rotateSize;j++){

                if(i==0){
                    processTopRow(rotatedPortion[i][j],i,j,startRow,startColumn,rotateSize);
                }
                else if(i==(rotateSize - 1)){
                    processBottomRow(rotatedPortion[i][j],i,j,startRow,startColumn,rotateSize);
                }
                else if(j== 0){
                    processLeft(rotatedPortion[i][j],i,j,startRow,startColumn,rotateSize);
                }
                else if(j== (rotateSize -1)){
                    processRight(rotatedPortion[i][j],i,j,startRow,startColumn,rotateSize);
                }
            }
        }

        System.out.println("**Final Plan**");
        for(String[] floorRows:originalFloor){
            for(String vals:floorRows){
                System.out.print("  "+vals+" ");
            }
            System.out.println();
        }


    }

    static private void processTopRow(String floorData,int oldRow,int oldCOl,int rotateRow,int rotateCol,int size){
        int newRow = (oldCOl + (rotateRow -1));
        int newCol = (size - 1) + (rotateCol - 1);

        originalFloor[newRow][newCol] = floorData;

    }

    static private void processBottomRow(String floorData,int oldRow,int oldCOl,int rotateRow,int rotateCol,int size){
        int newRow = (oldCOl + (rotateRow -1));
        int newCol = (rotateCol - 1);

        originalFloor[newRow][newCol] = floorData;
    }

    static private void processLeft(String floorData,int oldRow,int oldCOl,int rotateRow,int rotateCol,int size){
        int newRow = (rotateRow -1);
        int newCol = (oldRow)+(rotateCol - 1);

        originalFloor[newRow][newCol] = floorData;
    }

    static private void processRight(String floorData,int oldRow,int oldCOl,int rotateRow,int rotateCol,int size){
        int newRow = (size -1) + (rotateRow -1);
        int newCol = (oldRow)+(rotateCol - 1);

        originalFloor[newRow][newCol] = floorData;
    }
}