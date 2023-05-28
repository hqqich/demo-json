package org.example;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.example.entity.School;
import org.example.util.SchoolUtil;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void test01() {

        School schoolData = SchoolUtil.getSchoolData();

        JSONObject info = new JSONObject();
        info.put("name", "张三");
        info.put("age", "18");
        info.put("地理", "70");
        info.put("英语", "60");

        //JSON对象转字符串
        String str = JSON.toJSONString(schoolData);
        //JSON字符串转JSON对象
        JSONObject json = JSONObject.parseObject(str);

        System.out.println(json);

    }

}
