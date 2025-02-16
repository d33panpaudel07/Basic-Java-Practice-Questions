import java.util.HashMap;
import java.util.Map;

public class hashmapTesting {
    public static void main(String[] args) {
        Map<String, Object> testObj = new HashMap<>();

        testObj.put("key1","Value1");
        testObj.put("key2","Value2");
        testObj.put("key3",5);
        testObj.put("key4",99.99);
        testObj.put("key5","Value5");

//        System.out.println(testObj.get("key3"));

        System.out.println(testObj);

    }
}
