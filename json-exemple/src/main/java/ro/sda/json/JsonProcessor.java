package ro.sda.json;

import org.json.JSONObject;

public class JsonProcessor {
    public static void main(String[] args) {
        System.out.println(userToJson("Clau", 28));
    }

    public static JSONObject userToJson(String name, int age) {

        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("age", age);

        return obj;
    }
}
