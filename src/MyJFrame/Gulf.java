package MyJFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.JSONException;

import cn.ToJson.Gulf2Json;
import cn.ToJson.Gulf_data;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.Scrollable;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;

public class Gulf extends JFrame {

	private JScrollPane contentPane1;
	JScrollPane scrollPane ; 
//	String html = "{\"retcode\":0,\"message\":\"OK\",\"data\":{\"schedule_id\":17,\"start_time\":\"1614542400\",\"end_time\":\"1615838399\",\"total_battle_times\":17,\"total_win_times\":14,\"max_floor\":\"12-2\",\"reveal_rank\":[{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"value\":9,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"value\":5,\"rarity\":4}],\"defeat_rank\":[{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":45,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":26,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":21,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":17,\"rarity\":4},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":7,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":2,\"rarity\":4}],\"damage_rank\":[{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":79126,\"rarity\":5}],\"take_damage_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":117153,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":97732,\"rarity\":5},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":97569,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":95820,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":69403,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":56848,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":51553,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":28258,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":16765,\"rarity\":4}],\"normal_skill_rank\":[{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":280,\"rarity\":4},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":177,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":137,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":123,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":93,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":60,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":22,\"rarity\":4}],\"energy_skill_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":39,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":30,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":29,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":24,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":24,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":18,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":15,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":6,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":3,\"rarity\":4}],\"floors\":[{\"index\":9,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600719\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614600819\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600892\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601035\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601106\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601174\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]},{\"index\":10,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601319\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601460\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601564\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601647\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601719\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601808\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]}]},{\"index\":11,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":6,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604322\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614604447\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614603831\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614603982\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":3,\"star\":1,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604890\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605057\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]}]},{\"index\":12,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":4,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605324\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605484\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605646\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605862\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]}],\"total_star\":28,\"is_unlock\":true}}";
	String html ; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gulf frame = new Gulf("{\"retcode\":0,\"message\":\"OK\",\"data\":{\"schedule_id\":17,\"start_time\":\"1614542400\",\"end_time\":\"1615838399\",\"total_battle_times\":17,\"total_win_times\":14,\"max_floor\":\"12-2\",\"reveal_rank\":[{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"value\":14,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"value\":14,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"value\":9,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"value\":5,\"rarity\":4}],\"defeat_rank\":[{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":64,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":45,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":26,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":21,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":17,\"rarity\":4},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":7,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":2,\"rarity\":4}],\"damage_rank\":[{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":79126,\"rarity\":5}],\"take_damage_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":117153,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":97732,\"rarity\":5},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":97569,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":95820,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":69403,\"rarity\":4},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":56848,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":51553,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":28258,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":16765,\"rarity\":4}],\"normal_skill_rank\":[{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":280,\"rarity\":4},{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":177,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":137,\"rarity\":5},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":123,\"rarity\":5},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":93,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":60,\"rarity\":4},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":54,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":22,\"rarity\":4}],\"energy_skill_rank\":[{\"avatar_id\":10000042,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Keqing.png\",\"value\":39,\"rarity\":5},{\"avatar_id\":10000041,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Mona.png\",\"value\":30,\"rarity\":5},{\"avatar_id\":10000032,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Bennett.png\",\"value\":29,\"rarity\":4},{\"avatar_id\":10000023,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Xiangling.png\",\"value\":24,\"rarity\":4},{\"avatar_id\":10000037,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Ganyu.png\",\"value\":24,\"rarity\":5},{\"avatar_id\":10000031,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Fischl.png\",\"value\":18,\"rarity\":4},{\"avatar_id\":10000034,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Noel.png\",\"value\":15,\"rarity\":4},{\"avatar_id\":10000043,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Sucrose.png\",\"value\":6,\"rarity\":4},{\"avatar_id\":10000014,\"avatar_icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_side_icon/UI_AvatarIcon_Side_Barbara.png\",\"value\":3,\"rarity\":4}],\"floors\":[{\"index\":9,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600719\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614600819\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614600892\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601035\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601106\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601174\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]},{\"index\":10,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":9,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601319\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601460\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":2,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601564\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601647\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]},{\"index\":3,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614601719\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614601808\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":86,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]}]}]},{\"index\":11,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":6,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":3,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604322\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614604447\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614603831\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614603982\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]},{\"index\":3,\"star\":1,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614604890\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605057\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000043,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Sucrose.png\",\"level\":73,\"rarity\":4},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4}]}]}]},{\"index\":12,\"icon\":\"\",\"is_unlock\":true,\"settle_time\":\"0\",\"star\":4,\"max_star\":9,\"levels\":[{\"index\":1,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605324\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605484\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]},{\"index\":2,\"star\":2,\"max_star\":3,\"battles\":[{\"index\":1,\"timestamp\":\"1614605646\",\"avatars\":[{\"id\":10000037,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Ganyu.png\",\"level\":86,\"rarity\":5},{\"id\":10000023,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Xiangling.png\",\"level\":81,\"rarity\":4},{\"id\":10000031,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Fischl.png\",\"level\":70,\"rarity\":4},{\"id\":10000014,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Barbara.png\",\"level\":70,\"rarity\":4}]},{\"index\":2,\"timestamp\":\"1614605862\",\"avatars\":[{\"id\":10000042,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Keqing.png\",\"level\":87,\"rarity\":5},{\"id\":10000041,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Mona.png\",\"level\":85,\"rarity\":5},{\"id\":10000032,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Bennett.png\",\"level\":80,\"rarity\":4},{\"id\":10000034,\"icon\":\"https://upload-bbs.mihoyo.com/game_record/genshin/character_icon/UI_AvatarIcon_Noel.png\",\"level\":81,\"rarity\":4}]}]}]}],\"total_star\":28,\"is_unlock\":true}}",1);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public Gulf(String html , int index) {
		this.html = html;
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(index*200, 100, 701, 765);
		JPanel contentPane = new JPanel();
//		contentPane1 = new JScrollPane(contentPane);
//		contentPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{153, 154, 152, 144, 0};
		gbl_contentPane.rowHeights = new int[]{50, 80, 76, 233, 213, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("深渊信息"+(index == 1?"（本期）":"（上期）"));
		lblNewLabel.setFont(new Font("行楷", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		Box verticalBox = Box.createVerticalBox();

		try {
			JLabel starttime = new JLabel("开始时间:"+Gulf2Json.Getstart_time(html));
			starttime.setFont(new Font("行楷", Font.BOLD, 15));
			verticalBox.add(starttime);
			JLabel endtime = new JLabel("结束时间:"+Gulf2Json.Getend_time(html));
			endtime.setFont(new Font("行楷", Font.BOLD, 15));
			verticalBox.add(endtime);
		} catch (JSONException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}

		panel.add(verticalBox, BorderLayout.CENTER);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		JLabel label = null;
		try {
			label = new JLabel("最深层数:"+Gulf2Json.Getmax_floor(html));
			label.setFont(new Font("行楷", Font.BOLD, 15));
		} catch (JSONException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_1.add(verticalBox_1);
		
		JLabel label_1 = null;
		try {
			label_1 = new JLabel("战斗次数:"+Gulf2Json.Gettotal_battle_times(html));
			label_1.setFont(new Font("行楷", Font.BOLD, 15));
		} catch (JSONException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		verticalBox_1.add(label_1);
		
		JLabel label_2 = null;
		try {
			label_2 = new JLabel("胜利场数:"+Gulf2Json.Gettotal_win_times(html));
			label_2.setFont(new Font("行楷", Font.BOLD, 15));
		} catch (JSONException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		verticalBox_1.add(label_2);
		
		JLabel label_3 = null;
		try {
			label_3 = new JLabel("获得星数:"+Gulf2Json.Gettotal_star(html));
			label_3.setFont(new Font("行楷", Font.BOLD, 15));
		} catch (JSONException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridwidth = 4;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		contentPane.add(panel_2, gbc_panel_2);
		
		int bts_len = 6;
		String[] btn_names = {"出场次数","击破数","最大伤害","抗伤数","元素战技释放次数","元素爆发释放次数"};
		JButton[] btns = new JButton[bts_len];
		scrollPane = new JScrollPane();
		for (int i = 0 ; i < bts_len ; i++) {
			btns[i] = new JButton(btn_names[i]);
			panel_2.add(btns[i]);
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					for (int i = 0 ; i < btns.length ; i++) {
						if (!btns[i].isEnabled()) {
							btns[i].setEnabled(true);
						}
					}
					String[] data = null;
					if(((JButton)arg0.getSource()).getText().equals("出场次数")) {
						try {
							data = Gulf2Json.Getreveal_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else if (((JButton)arg0.getSource()).getText().equals("击破数")){
						try {
							data = Gulf2Json.Getdefeat_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else if (((JButton)arg0.getSource()).getText().equals("最大伤害")) {
						try {
							data = Gulf2Json.Getdamage_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else if (((JButton)arg0.getSource()).getText().equals("抗伤数")) {
						try {
							data = Gulf2Json.Gettake_damage_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else if (((JButton)arg0.getSource()).getText().equals("元素战技释放次数")) {
						try {
							data = Gulf2Json.Getnormal_skill_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else if (((JButton)arg0.getSource()).getText().equals("元素爆发释放次数")) {
						try {
							data = Gulf2Json.Getenergy_skill_rank(html);
						} catch (JSONException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
					
					scrollPane.setViewportView(new ShowMessage_JP(((JButton)arg0.getSource()).getText(), data));
					for (int i = 0 ; i < btns.length ; i++) {
						if (((JButton)arg0.getSource()).getText().equals(btns[i].getText())) {
							btns[i].setEnabled(false);
						}
					}
				}
			});
		}
		String[] data = null;
		try {
			data = Gulf2Json.Getreveal_rank(html);
		} catch (JSONException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
//		JPanel img_jp = new JPanel();
		scrollPane.setViewportView(new ShowMessage_JP(btns[0].getText(), data));
		btns[0].setEnabled(false);

		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);
	
		

		
		MyGulf panel_3 = new MyGulf();
		Box vb = Box.createVerticalBox();
//		vb.add(panel_3);
//		vb.add(new MyGulf());
		
		JTextArea jtx = new JTextArea("尽力了\n写不出深渊界面了,求放过\n\n");
		jtx.setEditable(false);
		jtx.setFont(new Font("行楷", Font.BOLD, 14));
		cn.ToJson.Gulf_data[] gd = null;
		try {
			gd = Gulf2Json.Getfloorsdata(html);
		} catch (JSONException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for (int i = 0 ; i < gd.length ; i++) {
			System.out.print("第"+gd[i].index+"关");
			jtx.append("第"+gd[i].index+"关");
			System.out.println("共获得:"+gd[i].star+"颗星");
			jtx.append("共获得:"+gd[i].star+"颗星\n");
			for (int j = 0 ; j < gd[i].floor_index.length ; j++) {
				
				System.out.print("   第"+gd[i].floor_index[j]+"层");
				jtx.append("   第"+gd[i].floor_index[j]+"层");
				System.out.println("获得:"+gd[i].floor_star[j]+"星");
				jtx.append("获得:"+gd[i].floor_star[j]+"星\n");
				String[] list = gd[i].data[j].split("@");
				jtx.append("\n");
				for (int k = 0 ; k < list.length ; k++) {
					
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String date = format.format(Long.parseLong(list[k].split(";")[0])*1000);
					String name = list[k].split(";")[1];
					String[] idlist = Gulf2Json.id2name.split("\r\n");
					for (int listlen = 0  ; listlen < idlist.length ; listlen++) {
						if (list[k].split(";")[1].equals(idlist[listlen].split(":")[0])) {
							name = idlist[listlen].split(":")[1];
							break;
						}
					}
					jtx.append("      "+date+":"+name+"/"+list[k].split(";")[3]+"级;  ");
					System.out.print("      "+date+":"+name+"/"+list[k].split(";")[3]+"级;  ");
					
					if (list[k].split("--;").length >= 1) {
						for (int kk = 1 ; kk < list[k].split("--;").length ;kk++) {
							for (int listlen = 0  ; listlen < idlist.length ; listlen++) {
								if (list[k].split("--;")[kk].split(";")[0].equals(idlist[listlen].split(":")[0])) {
									name = idlist[listlen].split(":")[1];
									break;
								}
							}
							System.out.print(name+"/"+list[k].split("--;")[kk].split(";")[2]+"级;  ");
							jtx.append(name+"/"+list[k].split("--;")[kk].split(";")[2]+"级;  ");
						}
					}else {
						
					}
					System.out.println();
					jtx.append("\n\n");
					
				}
			}
		}
		vb.add(jtx);
		
		
		
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(vb);
		
//		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 4;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 4;
		contentPane.add(jsp, gbc_panel_3);
		
//		img_jp.setPreferredSize(new Dimension(150*10,100));


		setVisible(true);
	}
	


}


class ShowMessage_JP extends JPanel{
	String Tittle ; 
	int len ;
	String[] html ; 
	
	public ShowMessage_JP(String str , String[] html) {
		this.Tittle = str;
		this.len = html.length;
		System.out.println("总长为:"+html.length);
		this.html = html;
		init();
	}
	
	void init(){
		GridBagLayout gbl = new GridBagLayout();
		gbl.columnWidths = new int[this.len];
		gbl.rowHeights = new int[2];
		for (int i = 0 ; i < this.len ; i++) {
			gbl.columnWidths[i] = 150;
		}
		gbl.rowHeights[0] = 150 ; 
		gbl.rowHeights[1] = 50 ;
		setLayout(gbl);
		
		for (int i = 0 ; i < this.len ; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = i;
			gbc.gridy = 0;
			gbc.insets = new Insets(0, 0, 0, 5);
			gbc.fill = GridBagConstraints.BOTH;
			//new MyJPanel(150, 150, ImageIO.read(new File("E:/a/head.png"))) 
			MyJPanel my_img = new MyJPanel(150, 150, null);
			if (html == null) {
				try {
					my_img = new MyJPanel(150, 150, ImageIO.read(new File("image/such.png")));
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}else {
				System.out.println("img链接为:"+html[i].split(";")[0]);
				repaintMyJP(my_img, html[i].split(";")[0]);
			}
			add(my_img, gbc);
	//		img_jp.add(new JLabel("Test") , gbc);
			GridBagConstraints gbc1 = new GridBagConstraints();
			gbc1.gridx = i;
			gbc1.gridy = 1;
			add(new JLabel(this.Tittle+":"+html[i].split(";")[1]) , gbc1);
		}
		
		
	}
	
	public void repaintMyJP(MyJPanel myweapondata ,  String url ) {
		
		
		GetImg gi = new GetImg(url);
		gi.start();
		new Thread() {
			public void run() {
				while (!gi.flag) {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				if (gi.getImg() == null) {
					try {
						myweapondata.setImg(ImageIO.read(new File("image/toError.png")));
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}else {
			//		myweapondata.setBackground(new Color(226,171,48));
					myweapondata.setImg((BufferedImage) gi.getImg());
				}
				myweapondata.repaint();
			};
		}.start();
	}
	
}