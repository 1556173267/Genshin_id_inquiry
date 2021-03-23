package cn.ToJson;

import java.text.SimpleDateFormat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Gulf2Json {
	
	static public String id2name= null;
	

	
	static public String Getstart_time(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String start_time = data.getString("start_time");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date = format.format(Long.parseLong(start_time)*1000);
		return date;
	}
	
	static public String Getend_time(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String end_time = data.getString("end_time");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date = format.format(Long.parseLong(end_time)*1000);
		return date;
	}
	
	/**
	 * 全部场次total_battle_times
	 */
	
	static public String Gettotal_battle_times(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String total_battle_times = data.getString("total_battle_times");
		return total_battle_times;
	}
	
	/**
	 * 胜利场次:total_win_times
	 */
	static public String Gettotal_win_times(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String total_win_times = data.getString("total_win_times");
		return total_win_times;
	}
	
	/**
	 * 最深层数max_floor
	 */
	static public String Getmax_floor(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String max_floor = data.getString("max_floor");
		return max_floor;
	}
	
	/**
	 * 获得星星total_star
	 */
	static public String Gettotal_star(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		String total_star = data.getString("total_star");
		return total_star;
	}
	
	/**
	 * 所有角色出场次数+信息reveal_rank
	 */	
	static public String[] Getreveal_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray reveal_rank = data.getJSONArray("reveal_rank");
		String[] reveal_rank_data = new String[reveal_rank.length()];
		for (int i = 0 ; i < reveal_rank.length() ; i++) {
			
			JSONObject temp = reveal_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色出战次数
			String rarity = temp.getString("rarity");	//角色星级
			reveal_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return reveal_rank_data;
	}
	
	/**
	 * 击破数defeat_rank
	 */
	static public String[] Getdefeat_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray defeat_rank = data.getJSONArray("defeat_rank");
		String[] defeat_rank_data = new String[defeat_rank.length()];
		for (int i = 0 ; i < defeat_rank.length() ; i++) {
			
			JSONObject temp = defeat_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色击破数
			String rarity = temp.getString("rarity");	//角色星级
			defeat_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return defeat_rank_data;
	}
	
	/**
	 * 最高伤害damage_rank
	 */
	static public String[] Getdamage_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray damage_rank = data.getJSONArray("damage_rank");
		String[] damage_rank_data = new String[damage_rank.length()];
		for (int i = 0 ; i < damage_rank.length() ; i++) {
			
			JSONObject temp = damage_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色最大伤害
			String rarity = temp.getString("rarity");	//角色星级
			damage_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return damage_rank_data;
	}
	
	/**
	 * 角色抗伤take_damage_rank
	 */
	static public String[] Gettake_damage_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray take_damage_rank = data.getJSONArray("take_damage_rank");
		String[] take_damage_rank_data = new String[take_damage_rank.length()];
		for (int i = 0 ; i < take_damage_rank.length() ; i++) {
			
			JSONObject temp = take_damage_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色最大抗伤
			String rarity = temp.getString("rarity");	//角色星级
			take_damage_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return take_damage_rank_data;
	}
	
	/**
	 * 角色元素战技释放次数normal_skill_rank
	 */
	static public String[] Getnormal_skill_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray normal_skill_rank = data.getJSONArray("normal_skill_rank");
		String[] normal_skill_rank_data = new String[normal_skill_rank.length()];
		for (int i = 0 ; i < normal_skill_rank.length() ; i++) {
			
			JSONObject temp = normal_skill_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色元素战技次数
			String rarity = temp.getString("rarity");	//角色星级
			normal_skill_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return normal_skill_rank_data;
	}
	
	/**
	 * 角色元素爆发释放次数energy_skill_rank
	 */
	static public String[] Getenergy_skill_rank(String html) throws JSONException{
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray energy_skill_rank = data.getJSONArray("energy_skill_rank");
		String[] energy_skill_rank_data = new String[energy_skill_rank.length()];
		for (int i = 0 ; i < energy_skill_rank.length() ; i++) {
			
			JSONObject temp = energy_skill_rank.getJSONObject(i);
			String img = temp.getString("avatar_icon");
			String value = temp.getString("value");	//	角色元素爆发次数
			String rarity = temp.getString("rarity");	//角色星级
			energy_skill_rank_data[i] = new String(img+";"+value+";"+rarity);
			
		}
		return energy_skill_rank_data;
	}
	
	static public Gulf_data[] Getfloorsdata(String html) throws JSONException {
		JSONObject jo = new JSONObject(html);
		JSONObject data = jo.getJSONObject("data");
		JSONArray floors = data.getJSONArray("floors");
		Gulf_data[] list_data = new Gulf_data[floors.length()];
		for (int i = 0 ; i < floors.length() ; i ++) {
			JSONObject temp = floors.getJSONObject(i);
			int floor = temp.getInt("index");//深渊关卡
			int getstar = temp.getInt("star");//该关获得星星
			JSONArray floorlist = temp.getJSONArray("levels");
			list_data[i] = new Gulf_data(floorlist.length());	//该关卡总共层数
			list_data[i].index = floor;
			list_data[i].star = getstar;
			
			for (int j = 0 ; j < floorlist.length() ; j++) {
				JSONObject floor_temp  = floorlist.getJSONObject(j);
				int floor_index = floor_temp.getInt("index");//层数
				int floor_star = floor_temp.getInt("star");//层数对应星星
				list_data[i].floor_index[j] = floor_index;
				list_data[i].floor_star[j] = floor_star;
				list_data[i].data[j] = new String();
				JSONArray battles = floor_temp.getJSONArray("battles");//进入上下层
				for (int k = 0 ; k < battles.length() ; k++) {
					String time = battles.getJSONObject(k).getString("timestamp");//进入时间
					list_data[i].data[j] += time;
					for (int l = 0 ; l < battles.getJSONObject(k).getJSONArray("avatars").length() ; l++) {
						String id = battles.getJSONObject(k).getJSONArray("avatars").getJSONObject(l).getString("id");
						String img = battles.getJSONObject(k).getJSONArray("avatars").getJSONObject(l).getString("icon");
						int level = battles.getJSONObject(k).getJSONArray("avatars").getJSONObject(l).getInt("level");
						int rarity = battles.getJSONObject(k).getJSONArray("avatars").getJSONObject(l).getInt("rarity");
						
						list_data[i].data[j] = new String(list_data[i].data[j]+";"+id+";"+img+";"+level+";"+rarity+"--");//每个人用+-+分割
						
					}
					list_data[i].data[j] += "@";
				}

			}	
			
		}
		
		return list_data;
	}
	
	
}
