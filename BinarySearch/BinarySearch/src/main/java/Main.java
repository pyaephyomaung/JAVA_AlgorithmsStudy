public class Main {
    public static void main(String[] args) {

        //Initialize sorted array
        int[] valuesArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        int key =10;

        int start = 0;
        int end = valuesArray.length - 1;
        int searchIndex;
        int foundIndex = -1;
        while((start <= valuesArray.length - 1)&&(end >0)){

            searchIndex =  ((start+end)/2);

            System.out.println("Start = "+start+" , End = "+end+" , SearchIndex = "+searchIndex);

            if (valuesArray[searchIndex] == key){
                end = 0;
                foundIndex = searchIndex;
                System.out.println("Key is found at "+foundIndex);
            }else if (valuesArray[searchIndex] < key){
                start = searchIndex + 1;
            }else if (valuesArray[searchIndex] > key){
                end = searchIndex - 1;
            }
        }

        if (foundIndex == -1){
            System.out.println("The given key cannot be found!!!");
        }
    }
}
