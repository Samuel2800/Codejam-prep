import java.util.*;
public class SearchEngine {
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        String a = word.nextLine();
        for(int i = 0; i < predictions(a).length; i++){
            System.out.println(Arrays.toString(predictions(a)[i]));
        }

    }
    private static String[] elements = new String[]{"captain", "car", "cared", "carpet", "carter", "carton", "cartoon", "cartoonist"};

    public static String[][] predictions(String query){
        ArrayList<String[]> result = new ArrayList<String[]>();
        for(int i = 2; i <= query.length(); i++){
            String sub = query.substring(0, i);
            ArrayList<String> list = new ArrayList<String>();
            for(String words : elements){
                if(words.startsWith(sub)){
                    list.add(words);
                }
                if(list.size() == 3){
                    break;
                }
            }
            result.add(list.toArray(new String[0]));
        }
        return result.toArray(new String[0][]);
    }
}
