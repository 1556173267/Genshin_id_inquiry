package cn.ToJson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Random;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.X509Certificate;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author Miku
 *
 */
public class GetUserId_Img {

	
	public static String[] GetAvatarsData(String html) throws JSONException {
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		
		JSONArray avatars = data.getJSONArray("avatars");
		JSONObject stats = data.getJSONObject("stats");
		
		String[] datastr = new String[avatars.length()];
		for (int len = 0 ; len < avatars.length() ; len++) {
			JSONObject jc = avatars.getJSONObject(len);
			String jcid = jc.getString("id");
			String jcname = jc.getString("name");
			int fetter = jc.getInt("fetter");//濂芥劅搴�
			int level = jc.getInt("level");//绛夌骇
			int rarity = jc.getInt("rarity");//鏄熺骇
		
			datastr[len] = new String(jcid+";"+jcname+";"+fetter+";"+level+";"+rarity);
		}
		return datastr;
	}
	public static String GetStatsData(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		
		JSONObject stats = data.getJSONObject("stats");
		
		int active_day_number = stats.getInt("active_day_number");//娲昏穬澶╂暟
		int achievement_number = stats.getInt("achievement_number");//鎴愬氨鏁�
		int anemoculus_number = stats.getInt("anemoculus_number");//椋庣鐬�
		int geoculus_number = stats.getInt("geoculus_number");//宀╃鐬�
		int avatar_number = stats.getInt("avatar_number");//瑙掕壊鏁�
		int way_point_number = stats.getInt("way_point_number");//浼犻�佺偣
		int domain_number = stats.getInt("domain_number");//瑙ｉ攣绉樺
		String spiral_abyss = stats.getString("spiral_abyss");//娣辨笂
		int precious_chest_number = stats.getInt("precious_chest_number");//鐝嶈吹瀹濈
		int luxurious_chest_number = stats.getInt("luxurious_chest_number");//鍗庝附瀹濈
		int exquisite_chest_number = stats.getInt("exquisite_chest_number");//绮捐嚧瀹濈
		int common_chest_number = stats.getInt("common_chest_number");//鏅�氬疂绠�
		return new String(active_day_number+";"+achievement_number+";"+anemoculus_number+";"+geoculus_number+";"+
									avatar_number+";"+way_point_number+";"+domain_number+";"+spiral_abyss+";"+
									luxurious_chest_number+";"+precious_chest_number+";"+exquisite_chest_number+";"+common_chest_number);
	}
	public static String[] GetAvatars_ImgUrl(String html) throws JSONException {
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray avatars = data.getJSONArray("avatars");
		String[] name_imgurl = new String[avatars.length()];
		for (int i = 0 ; i < avatars.length() ; i++) {
			JSONObject msg = avatars.getJSONObject(i);
			String ImgUrl = msg.getString("image");
			String name = msg.getString("name");
			name_imgurl[i] = new String(name+";"+ImgUrl);
			
			
		}
		return name_imgurl;
	}
	
	public static String[] GetWeaponReliquaries(String html , String AvatarsName) throws JSONException {
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray avatars = data.getJSONArray("avatars");
		String[] name_imgurl = new String[avatars.length()];
		int i = 0;
		for ( ; i < avatars.length() ; i++) {
			JSONObject msg = avatars.getJSONObject(i);
			if (AvatarsName.equals(msg.getString("name"))) {
				break;
			}
			continue;
		}
		if (i >= avatars.length()) {
			System.out.println("鑾峰彇浜虹墿闈㈡澘error");
			return null;
		}
		String weapon_str = null;
		JSONObject msg = avatars.getJSONObject(i);
		JSONObject weapon = msg.getJSONObject("weapon");	//姝﹀櫒
			String weapon_name = weapon.getString("name");//姝﹀櫒鍚嶇О
			int weapon_rarity = weapon.getInt("rarity");//鐝嶆儨绋嬪害:鍑犳槦姝﹀櫒
			int weapon_level = weapon.getInt("level");	//姝﹀櫒绛夌骇
			String weapon_Imgurl = weapon.getString("icon");//姝﹀櫒鍥剧墖
			int weapon_affix_level = weapon.getInt("affix_level");//鎴戠寽鏄簿鐐肩瓑绾�
			
			String type_name = weapon.getString("type_name");
			String desc = weapon.getString("desc");
			
			weapon_str = new String(weapon_name+";"+weapon_rarity+";"+weapon_level+";"+weapon_Imgurl+";"+weapon_affix_level+";"+type_name+"[.]"+desc);
		JSONArray reliquaries = msg.getJSONArray("reliquaries");	//鍦ｉ仐鐗�
		String reliquaries_str = null;
		if (reliquaries.length() == 0) {
			reliquaries_str = "";
		}else {
			for (int number = 0 ; number < reliquaries.length() ; number++) {
				String pos_name = reliquaries.getJSONObject(number).getString("pos_name");	//鍦ｉ仐鐗╃被鍒�:鍏辨湁:鐢熶箣鑺便�佹涔嬬窘銆佹椂涔嬫矙銆佺┖涔嬫澂銆佺ぜ涔嬪啝 
				String name = reliquaries.getJSONObject(number).getString("name");//鍦ｉ仐鐗╁悕绉�
				int level = reliquaries.getJSONObject(number).getInt("level"); //鍦ｉ仐鐗╃瓑绾�
				int rarity = reliquaries.getJSONObject(number).getInt("rarity");//鍦ｉ仐鐗╃弽绋�绋嬪害
				String icon = reliquaries.getJSONObject(number).getString("icon");
				
				JSONObject set = reliquaries.getJSONObject(number).getJSONObject("set");
				String set_name = set.getString("name");
				JSONArray set_name_affixes = set.getJSONArray("affixes");
				String o = "。";
				for (int j = 0 ; j < set_name_affixes.length() ; j++) {
					o = new String(o+set_name_affixes.getJSONObject(j).getString("effect"));
				}
				
				if (number == 0) {
					reliquaries_str = new String(pos_name+";"+name+";"+level+";"+rarity+";"+icon+";"+set_name+o);
				}else {
					reliquaries_str = new String(reliquaries_str+"\t"+pos_name+";"+name+";"+level+";"+rarity+";"+icon+";"+set_name+o);	//姣忎釜鍦ｉ仐鐗╂暟鎹敤:鍒嗗紑
				}
			}
		}
		JSONArray constellations = msg.getJSONArray("constellations");//鍛藉骇
		int j = 0 ;
		for (; j < constellations.length() ; j++) {
			if (!constellations.getJSONObject(j).getBoolean("is_actived")) {
				break;		//j涓哄懡搴ф暟
			}
		}
		String[] w_c_data = new String[3];
		w_c_data[0] = weapon_str;
		w_c_data[1] = reliquaries_str;
		w_c_data[2] = new String(j+"");
		return w_c_data;
	}
	
	
	private static String GetVersion(){
		return "2.3.0";//
	}
	
	private static String GetDS(){
		
		String md5str = "h8w582wxwgqvahcdkpvdhbh2w9casgfl";//"cx2y9z9a29tfqvr1qsq6c7yz99b5jsqt";//
		String i = new String(""+System.currentTimeMillis()/1000);
		String r = MyRandom(6);
		String c = DigestUtils.md5Hex("salt=" + md5str + "&t="+ i + "&r=" + r);
		return i+","+r+","+c;
	}
	static String MyRandom(int len) {
		Random rd = new Random();
		char[] x = "1234567890abcdefghijklmnopqrstuvwxyz".toCharArray();//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		char[] str = new char[len];
		for (int i = 0 ; i < len ; i++) {
			str[i] = x[rd.nextInt(x.length)];
		}
		return new String(str);
	}
	
	/**
	 * Cookies 涓鸿嚜宸盋ookies
	 * @param allConfigUrl
	 * @return
	 */
	
	public static String getHttpResponse(String allConfigUrl , String cookies) {
		BufferedReader in = null;
		StringBuffer result = null;
		try {
			URI uri = new URI(allConfigUrl);
			URL url = uri.toURL();
			URLConnection connection = url.openConnection();
			String str = GetDS();
			connection.setRequestProperty("DS", GetDS());
			/**
			# 1:  ios
            # 2:  android
            # 4:  pc web
            # 5:  mobile web
			 */
			connection.setRequestProperty("x-rpc-client_type", "5");
			connection.setRequestProperty("x-rpc-app_version", GetVersion());
			connection.setRequestProperty("x-rpc-channel", "baidu");
			connection.setRequestProperty("x-rpc-device_model", "HUAWEI LIO-AN00");
			connection.setRequestProperty("Referer", "https://app.mihoyo.com");
			connection.setRequestProperty("Host", "bbs-api.mihoyo.com");
			connection.setRequestProperty("Connection", "Keep-Alive");
			connection.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 7.1.2; LIO-AN00 Build/LIO-AN00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/75.0.3770.143 Mobile Safari/537.36 miHoYoBBS/2.4.0");
			connection.setRequestProperty("Charset", "utf-8");
			connection.setRequestProperty("X-Requested-With", "com.mihoyo.hyperion");
			
			connection.setRequestProperty("Cookie", cookies);
			connection.connect();
			result = new StringBuffer();
			in = new BufferedReader(new InputStreamReader(
			connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line);
			}
			return result.toString();
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
		try {
		if (in != null) {
		in.close();
		}
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		}
		return null;
		}
	
	public static String httpPost(String html , String id_data , String game_id , String cookies) {
		String content = null;
		DefaultHttpClient httpclient = null;
		try {
			httpclient = new DefaultHttpClient();
			httpclient = (DefaultHttpClient) wrapClient(httpclient);
			/** 閿熸枻鎷烽敓鐭揪鎷烽敓鏂ゆ嫹IP **/
		//	HttpHost proxy = new HttpHost(ip, dk);
		//	httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY,proxy);
 
			HttpPost httpget = new HttpPost(html);
			
			httpget.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,1000*3);	//閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹鏃�
			httpget.setHeader("x-rpc-client_type", "5");
			httpget.setHeader("DS", GetDS());
			httpget.setHeader("x-rpc-app_version", GetVersion());
			httpget.setHeader("x-rpc-channel", "baidu");
			httpget.setHeader("x-rpc-device_model", "HUAWEI LIO-AN00");
			httpget.setHeader("Referer", "https://webstatic.mihoyo.com");
			httpget.setHeader("Host", "bbs-api.mihoyo.com");
			httpget.setHeader("Connection", "Keep-Alive");
			httpget.setHeader("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
			httpget.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 7.1.2; LIO-AN00 Build/LIO-AN00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/75.0.3770.143 Mobile Safari/537.36 miHoYoBBS/2.5.1");
			httpget.setHeader("Content-Type", "application/json;charset=utf-8");
			httpget.setHeader("X-Requested-With", "com.mihoyo.hyperion");
			httpget.setHeader("Cookie", cookies);
			StringEntity entity1 = new StringEntity("{\"character_ids\":["+id_data+"],\"role_id\":\""+game_id+"\",\"server\":\""+(game_id.toCharArray()[0] == '1'?"cn_gf01":"cn_qd01")+"\"}", Charset.forName("utf-8")) ;
		      entity1.setContentEncoding("utf-8");

		      entity1.setContentType("application/json");
		      httpget.setEntity(entity1);
			HttpResponse responses = httpclient.execute(httpget);
			HttpEntity entity = responses.getEntity();
			
			content = EntityUtils.toString(entity,"utf-8");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			httpclient.getConnectionManager().shutdown();	
		}
		return content;
	}
	
	 /** 
     * 閼惧嘲褰囬崣顖欎繆娴犵爆ttps闁剧偓甯撮敍灞间簰闁灝鍘ゆ稉宥呭綀娣団�叉崲鐠囦椒鍔熼崙铏瑰箛peer not authenticated瀵倸鐖� 
     * 
     * @param base 
     * @return 
     */ 
    public static HttpClient wrapClient(HttpClient base) { 
        try { 
            SSLContext ctx = SSLContext.getInstance("TLS"); 
            X509TrustManager tm = new X509TrustManager() { 
                public void checkClientTrusted(X509Certificate[] xcs, 
                        String string) { 
                } 

                public void checkServerTrusted(X509Certificate[] xcs, 
                        String string) { 
                } 

                public java.security.cert.X509Certificate[] getAcceptedIssuers() { 
                    return null; 
                }

				@Override
				public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws CertificateException {
					
					
				}

				@Override
				public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws CertificateException {
					
					
				} 
            }; 
            ctx.init(null, new TrustManager[] { tm }, null); 
            SSLSocketFactory ssf = new SSLSocketFactory(ctx); 
            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER); 
            ClientConnectionManager ccm = base.getConnectionManager(); 
            SchemeRegistry sr = ccm.getSchemeRegistry(); 
            sr.register(new Scheme("https", ssf, 443)); 
            return new DefaultHttpClient(ccm, base.getParams()); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
            return null; 
        } 
    } 
    
	public static void main(String[] args) {
		String cookies = "";
		String game_id = "";
		String html = getHttpResponse("https://api-takumi.mihoyo.com/game_record/genshin/api/index?server="+(game_id.toCharArray()[0] == '1'?"cn_gf01":"cn_qd01")+"&role_id="+ game_id, 
			cookies	);
		System.out.println(html);
		try {
			System.out.println(GetStatsData(html).replace(";", "\t"));
		} catch (JSONException e) {
			System.out.println(html);
			return ;
		}
		String[] data = null;
		try {
			data = GetAvatarsData(html);
		} catch (JSONException e) {
			System.out.println("瑙ｆ瀽REEOR");
			e.printStackTrace();
		}
		String id_data = new String("");
		for (int i = 0 ; i < data.length ; i++) {
//			System.out.println(data[i]);
			if (i == 0 ) {
				id_data  = new String (data[i].split(";")[0]);
				continue ; 
			}
			id_data  = new String (id_data+","+data[i].split(";")[0]);
		}
		
		String dataandimg = httpPost("https://api-takumi.mihoyo.com/game_record/genshin/api/character", id_data, game_id, cookies);
		String[] Avatars = null;
		System.out.println(dataandimg);
		try {
			Avatars = GetAvatars_ImgUrl(dataandimg);
		} catch (JSONException e) {
			System.out.println("閿欒");
			System.out.println(dataandimg);
			e.printStackTrace();
		}
		
		for (int i = 0 ; i < Avatars.length ; i++) {
			String[] Avatarsdata = null;
			try {
				Avatarsdata = GetWeaponReliquaries(dataandimg, Avatars[i].split(";")[0]);
			} catch (JSONException e) {
				System.out.println("鑾峰彇瑙掕壊灞炴�уけ璐�");
				System.out.println("瑙掕壊鍚�:"+Avatars[i].split(";")[0]);
				e.printStackTrace();
			}//鑾峰彇瑙掕壊name
			System.out.print(Avatars[i].split(";")[0]+":");
			for (int j = 0 ; j < 3 ; j++) {
				System.out.println(Avatarsdata[j]);	//0涓烘鍣ㄥ睘鎬э紝1涓哄叏閮ㄥ湥閬楃墿灞炴�э紝姣忎釜鍦ｉ仐鐗╃敤*鍒嗗壊锛�2涓哄懡搴ф暟
			}
			
		}
		
	}
    
}
