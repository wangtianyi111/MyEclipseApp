package wty.cqupt.util;

import java.util.Arrays;
import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.face.AipFace;

public class TestFace_01 {
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
	       
	        HashMap<String, String> options = new HashMap<String, String>();
	        String[] content = FileUtil.read("C:\\Users\\wty\\Desktop\\face_image\\index.txt", null);
	        for (int i = 1; i < content.length; i++) {
	        	String[] strings = content[i].split("	");
	        	JSONObject res = client.addUser(strings[0], "test_user_info", Arrays.asList(strings[1]), strings[2], options);
	        	System.out.println(res.toString());
			}
	        
	        
	        
	    }
}
