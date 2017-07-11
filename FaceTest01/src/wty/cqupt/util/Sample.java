package wty.cqupt.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import com.baidu.aip.face.AipFace;

public class Sample {

    //设置APPID/AK/SK
    public static final String APP_ID = "9874738";
    public static final String API_KEY = "duGHXDBoo2SK1lLQLKfnyBfL";
    public static final String SECRET_KEY = "LMUowlYLhZO1e1A6w52981ebeaGsMorY";

    public static void main(String[] args) {

        // 初始化一个FaceClient
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 调用API
        /*String image = "test.jpg";
        JSONObject res = client.detect(path, new HashMap<String, String>());
        System.out.println(res.toString(2));*/
        
        //HashMap<String, String> options = new HashMap<String, String>();
        HashMap<String, Object> options = new HashMap<String, Object>();
        //options.put("user_top_num", 1);
        //options.put("max_face_num", "1");
        //options.put("face_fields", "gender");
        //options.put("face_fields", "age");
        //options.put("face_fields", "beauty");
        //options.put("ext_fields", "qualities");
        //options.put("image_liveness", "faceliveness");
        //,"C:\\Users\\wty\\Desktop\\face_image\\jiang_2.jpg"
        /*String[] iPath = {"C:\\Users\\wty\\Desktop\\face_image\\pan_2.jpg",
        		"C:\\Users\\wty\\Desktop\\face_image\\pan_3.jpg",
        		"C:\\Users\\wty\\Desktop\\face_image\\pan_4.jpg"};*/
        
        //List<String> pathlist = Arrays.asList(iPath);
        String imagePath1 = "C:\\Users\\wty\\Desktop\\face_image\\pan_1.jpg";
        String imagePath2 = "C:\\Users\\wty\\Desktop\\face_image\\pan_2.jpg";
        String imagePath3 = "C:\\Users\\wty\\Desktop\\face_image\\pan_3.jpg";
        String imagePath4 = "C:\\Users\\wty\\Desktop\\face_image\\pan_4.jpg";
        //JSONObject res = client.addUser("pan_2", "test_user_info", Arrays.asList("group1"), imagePath4, options);
        //ArrayList<String> pathArray = new ArrayList<String>();
        //pathArray.add(imagePath1);
        //pathArray.add(imagePath2);
        //pathArray.add(imagePath3);
        //JSONObject response = client.match(pathArray, options);
        //JSONObject response = client.detect(imagePath1, options);
        JSONObject res = client.identifyUser(Arrays.asList("group1"), imagePath1, options);
        //System.out.println(response.toString());
        System.out.println(res.toString());
        
    }
}