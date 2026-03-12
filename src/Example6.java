import java.util.HashMap;
import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++){
            map.put(i, i + " string");
        }

        System.out.println("Строки с ключем >5:");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getKey() > 5){
                System.out.println(entry.getValue());
            }
        }

        System.out.println("\nЕсли в коллекции есть ключ = 0, то выведем строки коллекции через запятую:");
        if (map.containsKey(0)){
            for(Map.Entry<Integer, String> entry : map.entrySet()){
                System.out.print(entry.getValue() + ", ");
            }
        }

        System.out.println("\nПеремножим ключи, где длина строки >5 (Исключая ключ 0, иначе в результате получим 0):");
        boolean isExist = false;
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getValue().length() > 5 && entry.getKey() != 0){
                result *= entry.getKey();
                isExist = true;
            }
        }
        if (isExist){
            System.out.println(result);
        } else {
            System.out.println("Строк с длиной >5 нет");
        }
    }
}