import java.util.HashMap;
import java.util.Map;

public class Main {

    static String DELIMETER = ">";

    public static void main(String[] args) {

        String[] inputStrArry = {"jump>over", "the>fence", "over>the", "brown lazy fox>jump"};

        getOutputLinkArray(inputStrArry);

    }

    private static void getOutputLinkArray(String[] inputStrArry) {

        Map<String,String> linkMap = parseIntoMap(inputStrArry);

        String firstNodeKey = getFirstNodeKey(linkMap);

        System.out.print(firstNodeKey + " ");

        String parent = firstNodeKey;
        String child = "";

        for(int i=0;i< linkMap.size();i++){

            child = linkMap.get(parent);
            System.out.print(child + " ");
            parent = child;

        }

    }

    private static Map<String,String> parseIntoMap(String[] inputStrArry){
        Map<String,String> linkMap = new HashMap<>();
        String[] valuePairs = null;

        for ( String str : inputStrArry ){
            valuePairs = str.split(DELIMETER);
            linkMap.put(valuePairs[0],valuePairs[1]);
        }

            return linkMap;
    }

    private static String getFirstNodeKey(Map<String,String> linkMap){
        String firstKey = "";
        int count = 0;

        for(String key: linkMap.keySet()){
            count = 0;
            for (String value : linkMap.values()){
                if (key.equals(value)) count++;
            }

            if (count == 0) return key;
        }


        return firstKey;
    }
}
