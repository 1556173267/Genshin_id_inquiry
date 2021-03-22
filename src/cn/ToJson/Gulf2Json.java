package cn.ToJson;

import java.text.SimpleDateFormat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Gulf2Json {
	
	static public String id2name= "10000042:刻晴\r\n" + 
			"10000041:莫娜\r\n" + 
			"10000029:可莉\r\n" + 
			"10000033:达达利亚\r\n" + 
			"10000026:魈\r\n" + 
			"10000023:香菱\r\n" + 
			"10000034:诺艾尔\r\n" + 
			"10000032:班尼特\r\n" + 
			"10000014:芭芭拉\r\n" + 
			"10000031:菲谢尔\r\n" + 
			"10000046:胡桃\r\n" + 
			"10000003:琴\r\n" + 
			"10000020:雷泽\r\n" + 
			"10000037:甘雨\r\n" + 
			"10000015:凯亚\r\n" + 
			"10000043:砂糖\r\n" + 
			"10000027:凝光\r\n" + 
			"10000021:安柏\r\n" + 
			"10000039:迪奥娜\r\n" + 
			"10000025:行秋\r\n" + 
			"10000006:丽莎\r\n" + 
			"10000024:北斗\r\n" + 
			"10000035:七七\r\n" + 
			"10000022:温迪\r\n" + 
			"10000044:辛焱\r\n" + 
			"10000036:重云\r\n" + 
			"10000005:旅行者(男)\r\n" + 
			"10000007:旅行者(女)";
	
	public static void main(String[] args) {
		String html = "{\"retcode\":0,\"message\":\"OK\",\"data\":{\"schedule_id\":17,\"start_time\":\"1614542400\",\"end_time\":\"1615838399\",\"total_battle_times\":17,\"total_win_times\":14,\"max_floor\":\"12-2\",\"reveal_rank\":[{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"value\":9,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"value\":5,\"rarity\":4}],\"defeat_rank\":[{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":45,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":26,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":21,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":17,\"rarity\":4},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":7,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":2,\"rarity\":4}],\"damage_rank\":[{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":79126,\"rarity\":5}],\"take_damage_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":117153,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":97732,\"rarity\":5},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":97569,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":95820,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":69403,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":56848,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":51553,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":28258,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":16765,\"rarity\":4}],\"normal_skill_rank\":[{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":280,\"rarity\":4},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":177,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":137,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":123,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":93,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":60,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":22,\"rarity\":4}],\"energy_skill_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":39,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":30,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":29,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":24,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":24,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":18,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":15,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":6,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":3,\"rarity\":4}],\"floors\":[{\"index\":9,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600719\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614600819\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600892\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601035\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601106\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601174\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]},{\"index\":10,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601319\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601460\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601564\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601647\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601719\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601808\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]}]},{\"index\":11,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":6,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604322\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614604447\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614603831\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614603982\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":3,\"star\":1,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604890\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605057\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]}]},{\"index\":12,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":4,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605324\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605484\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605646\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605862\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]}],\"total_star\":28,\"is_unlock\":true}}";
				
		try {
			System.out.println("开始时间:"+Getstart_time(html));
			System.out.println("结束时间:"+Getend_time(html));
			System.out.println("最深层数:"+Getmax_floor(html));
			System.out.println("总共挑战次数:"+Gettotal_battle_times(html));
			System.out.println("挑战胜利次数:"+Gettotal_win_times(html));
			System.out.println("获得星数:"+Gettotal_star(html));
			
			Gulf_data[] gd = Getfloorsdata(html);
			for (int i = 0 ; i < gd.length ; i++) {
				System.out.print("第"+gd[i].index+"关");
				System.out.println("共获得:"+gd[i].star+"颗星");
				for (int j = 0 ; j < gd[i].floor_index.length ; j++) {
					System.out.print("\t第"+gd[i].floor_index[j]+"层");
					System.out.println("获得:"+gd[i].floor_star[j]+"星");
					String[] list = gd[i].data[j].split("@");
					for (int k = 0 ; k < list.length ; k++) {
						
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String date = format.format(Long.parseLong(list[k].split(";")[0])*1000);
						String name = list[k].split(";")[1];
						String[] idlist = id2name.split("\r\n");
						for (int listlen = 0  ; listlen < idlist.length ; listlen++) {
							if (list[k].split(";")[1].equals(idlist[listlen].split(":")[0])) {
								name = idlist[listlen].split(":")[1];
								break;
							}
						}
						System.out.print("\t\t"+date+":"+name+"/"+list[k].split(";")[3]+"级别;");
						if (list[k].split("--;").length >= 1) {
							for (int kk = 1 ; kk < list[k].split("--;").length ;kk++) {
								for (int listlen = 0  ; listlen < idlist.length ; listlen++) {
									if (list[k].split("--;")[kk].split(";")[0].equals(idlist[listlen].split(":")[0])) {
										name = idlist[listlen].split(":")[1];
										break;
									}
								}
								System.out.print(name+"/"+list[k].split("--;")[kk].split(";")[2]+";");
							}
						}else {
							
						}
						System.out.println();
						
					}
				}
			}
			
		} catch (JSONException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	
	}
	
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
