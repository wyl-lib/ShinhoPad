package cn.pad.send;
import com.zhenzi.sms.ZhenziSmsClient;


public class T1 {

	/**
	 * @param args
	 */
	private static String apiUrl = "http://sms_developer.zhenzikj.com";
	private static String appId = "100244";
	private static String appSecret = "NGQ2MjRlOGQtYThiMS00NmMxLTk5NzMtN2YwMjZkMWI5MDhm";
	
	
	public static void main(String[] args) throws Exception {
		ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
		String phone = "555";
		client.send(phone, "");
	}

}
