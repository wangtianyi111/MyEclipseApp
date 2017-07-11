package wty.cqupt.util;

import java.util.Arrays;
import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.face.AipFace;

public class identifyUser {
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
	        String path = "C:\\Users\\wty\\Desktop\\face_image\\testLi_1.jpg";
	        HashMap<String, Object> options = new HashMap<String, Object>(1);
	        options.put("user_top_num", 1);
	        JSONObject res = client.identifyUser(Arrays.asList("group_panLin", "group_liWeiFeng"), path, options);
	        System.out.println(res.toString(2));
	    }
}
