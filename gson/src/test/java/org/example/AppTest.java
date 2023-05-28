package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.example.entity.School;
import org.example.util.SchoolUtil;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void test01() {

        Gson gson = new Gson();

        School schoolData = SchoolUtil.getSchoolData();

        //JSONObject info = new JSONObject();
        //info.put("name", "张三");
        //info.put("age", "18");
        //info.put("地理", "70");
        //info.put("英语", "60");

        //JSON对象转字符串
        String str = gson.toJson(schoolData);
        //JSON字符串转JSON对象
        School school = gson.fromJson(str, School.class);



        JsonElement jsonElement = gson.toJsonTree(str);
        JsonObject asJsonObject = gson.fromJson(str, JsonObject.class);
        long id = asJsonObject.get("id").getAsLong();

        System.out.println(school);


    }

}
