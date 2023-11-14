public class Main {

    static String DELIMETER = ",";
    public static void main(String[] args) {

        String inputString = "7,6,57,8,4,2,7,4";

        StringBuffer sb = getGreenerGrassList(inputString);

        System.out.print(sb.toString());

    }

    private static StringBuffer getGreenerGrassList(String inputStr){
        StringBuffer sb = new StringBuffer();
        String[] inputArray = inputStr.split(DELIMETER);

        int max = 0;
        for(int i =0;i<inputArray.length;i++){
            max = 0;

            max = findMax(inputArray,i);

            sb.append(max + "\n");
        }

        return sb;

    }

    private static int findMax(String[] strArry , int index){

        int max = 0;

        for(int i =0;i< strArry.length;i++){

            if (i!=index){
                max = Integer.parseInt(strArry[i])>=max? Integer.parseInt(strArry[i]):max;
            }
        }


        return max;

    }
}
