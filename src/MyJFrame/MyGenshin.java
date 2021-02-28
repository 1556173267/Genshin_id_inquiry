package MyJFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.json.JSONException;

import cn.ToJson.GetUserId_Img;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.imageio.ImageIO;
import java.awt.Insets;
import java.awt.Panel;

public class MyGenshin extends JFrame {

	private JFrame me ; 
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblid;
	private JTextField textField_1;
	private JLabel label;
	private Panel panel;
	private JButton button;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lbling;
	String id_data  ;

	String Avatars_data_html;
	String AllGameData ; 
	
	MyJPanel mp;
	JPanel mp2;
	
	JButton[] Avatarsbts ; 
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGenshin frame = new MyGenshin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyGenshin() {
		this.me = this;
		setTitle("原神查询小助手 & by 贴吧 神无月[樱花]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 549, 831);
	//	setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//add(contentPane);
		GridBagLayout gb = new GridBagLayout();
		gb.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		gb.rowHeights = new int[]{47, 15, 12, 65, 57, 45, 31, 461, 0};
		gb.columnWeights = new double[]{1.0, 0.0, 0.0,0.0};
		gb.columnWidths = new int[]{ 78, 238, 133,55};
		contentPane.setLayout(gb);
		GridBagConstraints c=new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0;
		
        int index = 1;
        
        label = new JLabel("原神反装X数据查询");
        label.setFont(new Font("行楷", Font.BOLD, 19));
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.gridwidth = 4;
        gbc_label.insets = new Insets(0, 0, 5, 0);
        gbc_label.gridx = 0;
        gbc_label.gridy = 0;
        contentPane.add(label, gbc_label);
        
        JLabel lblcookies = new JLabel("输入米游社Cookies:");
        lblcookies.setFont(new Font("微软雅黑",0,12));
        GridBagConstraints gbc_lblcookies = new GridBagConstraints();
        gbc_lblcookies.fill = GridBagConstraints.VERTICAL;
        gbc_lblcookies.insets = new Insets(0, 0, 5, 5);
        gbc_lblcookies.gridx = 1;
        gbc_lblcookies.gridy = 1;
        contentPane.add(lblcookies, gbc_lblcookies);
        
        textField = new JTextField(60);
        textField.setFont(new Font("微软雅黑",0,12));
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.fill = GridBagConstraints.BOTH;
        gbc_textField.insets = new Insets(0, 0, 5, 5);
        gbc_textField.gridx = 2;
        gbc_textField.gridy = 1;
        contentPane.add(textField, gbc_textField);
        textField.setColumns(10);
        
        button = new JButton("查询");
        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.insets = new Insets(0, 0, 5, 0);
        gbc_button.gridheight = 2 ;
        gbc_button.gridx = 3;
        gbc_button.gridy = 1;
        contentPane.add(button, gbc_button);
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(new JLabel("等待查询中ing..."));
				panel.validate();
				
				String game_id = textField_1.getText().toString();
				String cookies = textField.getText().toString();
				
				String html = GetUserId_Img.getHttpResponse("https://api-takumi.mihoyo.com/game_record/genshin/api/index?server="+(game_id.toCharArray()[0] == '1'?"cn_gf01":"cn_qd01")+"&role_id="+ game_id, 
					cookies	);
				
				if (html == null || html.equals("{\"data\":null,\"message\":\"Params error\",\"retcode\":-1}")) {
					System.out.println("cookies 或 id 填写错误");
					new DemoDialog(me,"米游社Cookies或对方ID输入错误");
					return ;
				}else if (html.equals("{\"data\":null,\"message\":\"用户信息不匹配\",\"retcode\":1008}")){
					System.out.println("id 填写错误");
					new DemoDialog(me,"对方ID输入错误");
					return ;
				}else if (html.equals("{\"data\":null,\"message\":\"Please login\",\"retcode\":10001}")) {
					new DemoDialog(me,"Cookies有误或已过期");
					return ;
				}
				try {
					html = new String(html.getBytes("gbk"),"utf-8");
				} catch (UnsupportedEncodingException e4) {
					// TODO 自动生成的 catch 块
					e4.printStackTrace();
				}
				Avatars_data_html = html;
				try {
//					System.out.println("天\t成就\t风\t岩\t角色\t传送\t秘境\t深渊\t珍\t华\t精\t普");
//					System.out.println(GetUserId_Img.GetStatsData(html).replace(";", "\t"));
					
					String JLtext = new String ("活跃天数:"+"成就达成数:"+"风神瞳:"+"岩神瞳:"+"获得角色数:"+"解锁传送点:"+"解锁秘境:"+"深渊螺旋:"+"华丽宝箱数:"+"珍贵宝箱数:"+"精致宝箱数:"+"普通宝箱数");
			        
					panel_1.removeAll();
					panel.setLayout(new GridLayout(5,7));
					for (int i = 0 ; i < JLtext.split(":").length ; i++) {
			        	JPanel jpp = new JPanel(new GridLayout(2,1));
			        	jpp.add(new JLabel(GetUserId_Img.GetStatsData(html).split(";")[i]));
			        	jpp.add(new JLabel(JLtext.split(":")[i]));
			        	panel_1.add(jpp);
			        }
					panel_1.validate();
					
				} catch (JSONException e1) {
					System.out.println(html);
					System.out.println("cookies 或 id 填写错误");
						new DemoDialog(me , "可能为程序错误");
					return ;
				}
				String[] data = null;
				try {
					data = GetUserId_Img.GetAvatarsData(html);
				} catch (JSONException e2) {
					System.out.println("解析REEOR");
					e2.printStackTrace();
				}
				/*********获取所有角色的id*********/
				id_data = new String("");
				for (int i = 0 ; i < data.length ; i++) {
//					System.out.println(data[i]);
					if (i == 0 ) {
						id_data  = new String (data[i].split(";")[0]);
						continue ; 
					}
					id_data  = new String (id_data+","+data[i].split(";")[0]);
				}
				/**********将角色名一一加入选项卡中********/
				panel.removeAll();
				panel.setLayout(new GridLayout(5,7));
				Avatarsbts = new JButton[data.length] ; 
				for (int i = 0 ; i < data.length ; i++) {
					JButton jb = new JButton();
					jb.setFont(new Font("楷书",0,13));
					jb.setText(data[i].split(";")[1]);//角色名
					panel.add(jb);
					int lv = 0;
					try {
						lv = Integer.parseInt(GetUserId_Img.GetAvatarsData(Avatars_data_html)[i].split(";")[4]);
					} catch (NumberFormatException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					} catch (JSONException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					if (lv == 4) {
						jb.setBackground(new Color(146,110,171));
					}else if(lv == 5) {
						jb.setBackground(new Color(226,171,48));
					}
					Avatarsbts[i] = jb;
				}
				panel_2.removeAll();
				panel_2.add(new JLabel("共"+data.length+"个角色 , 鼠标移至角色立绘查看角色"));
				panel.validate();
				panel_2.validate();

				String dataandimg = GetUserId_Img.httpPost("https://api-takumi.mihoyo.com/game_record/genshin/api/character", id_data, game_id, cookies);
				AllGameData = dataandimg;
				
			       String[] Avatars = null;
			   	try {
			   		Avatars = GetUserId_Img.GetAvatars_ImgUrl(AllGameData);
			   	} catch (JSONException e3) {
			   		// TODO 自动生成的 catch 块
			   		e3.printStackTrace();
			   	}
			          System.out.println(html+"\n"+dataandimg);
			           for (int i = 0 ; i < Avatarsbts.length ; i++) {
			           	String[] w_r_data = null;
			   			try {
			   				w_r_data = GetUserId_Img.GetWeaponReliquaries(AllGameData, Avatarsbts[i].getText().toString());
			   			} catch (JSONException e2) {
			   				// TODO 自动生成的 catch 块
			   				e2.printStackTrace();
			   			}
			           	try {
			   				Avatarsbts[i].addActionListener(new AvatarsActionListener(Avatarsbts , Avatars[i], GetUserId_Img.GetAvatarsData(Avatars_data_html)[i]+";"+w_r_data[2],
			   							w_r_data[0], w_r_data[1], mp, mp2 , textField_2));
			   			} catch (JSONException e1) {
			   				// TODO 自动生成的 catch 块
			   				e1.printStackTrace();
			   			}
			           }
				
			}
		});
        
        
        lblid = new JLabel("输入游戏ID:");
        lblid.setFont(new Font("微软雅黑",0,12));
        GridBagConstraints gbc_lblid = new GridBagConstraints();
        gbc_lblid.fill = GridBagConstraints.VERTICAL;
        gbc_lblid.insets = new Insets(0, 0, 5, 5);
        gbc_lblid.gridx = 1;
        gbc_lblid.gridy = 2;
        contentPane.add(lblid, gbc_lblid);
        
        textField_1 = new JTextField(20);
        textField_1.setFont(new Font("微软雅黑",0,12));
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.fill = GridBagConstraints.BOTH;
        gbc_textField_1.insets = new Insets(0, 0, 5, 5);
        gbc_textField_1.gridx = 2;
        gbc_textField_1.gridy = 2;
        contentPane.add(textField_1, gbc_textField_1);
        
        panel_1 = new JPanel(new GridLayout(2,6));
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridwidth = 4;
        gbc_panel_1.gridx = 0;
        gbc_panel_1.gridy = 3;
        contentPane.add(panel_1, gbc_panel_1);
        String JLtext = new String ("活跃天数:"+"成就达成数:"+"风神瞳:"+"岩神瞳:"+"获得角色数:"+"解锁传送点:"+"解锁秘境:"+"深渊螺旋:"+"华丽宝箱数:"+"珍贵宝箱数:"+"精致宝箱数:"+"普通宝箱数");
        for (int i = 0 ; i < JLtext.split(":").length ; i++) {
        	JPanel jpp = new JPanel(new GridLayout(2,1));
        	jpp.add(new JLabel("-"));
        	jpp.add(new JLabel(JLtext.split(":")[i]));
        	panel_1.add(jpp);
        }
//        panel_1.add(new JLabel());//"天\t成就\t风\t岩\t角色\t传送\t秘境\t深渊\t珍\t华\t精\t普"

        
        panel = new Panel();
        
        JLabel jt = new JLabel("这里放置所有角色");
        jt.setFont(new Font("微软雅黑" , 0 , 25));
        panel.add(jt);
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.gridwidth = 4;
        gbc_panel.gridheight = 2;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 4;
        contentPane.add(panel, gbc_panel);
        
        panel_2 = new JPanel();
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridwidth = 4;
        gbc_panel_2.gridx = 0;
        gbc_panel_2.gridy = 6;
        contentPane.add(panel_2, gbc_panel_2);
        
        try {
			mp = new MyJPanel(307,554, ImageIO.read(new File("image/such.png")));
		} catch (IOException e1) {
			new DemoDialog(me, "图片索引错误，缺少/image");
			e1.printStackTrace();
			return ;
		}
        
        gb.setConstraints(mp, c);
        GridBagConstraints gbc_mp = new GridBagConstraints();
        gbc_mp.insets = new Insets(0, 0, 5, 5);
        gbc_mp.fill = GridBagConstraints.BOTH;
        gbc_mp.gridwidth = 2;
        gbc_mp.gridy = 7;//横坐标
        gbc_mp.gridx = 0;//纵坐标
        contentPane.add(mp, gbc_mp);
        
        mp2 = new JPanel(new GridLayout(6,2));
        gb.setConstraints(mp2, c);
        GridBagConstraints gbc_mp2 = new GridBagConstraints();
        gbc_mp2.insets = new Insets(0, 0, 5, 0);
        gbc_mp2.fill = GridBagConstraints.BOTH;
        gbc_mp2.gridwidth = 2;
        gbc_mp2.gridy = 7;//横坐标
        gbc_mp2.gridx = 2;//纵坐标
        contentPane.add(mp2, gbc_mp2);
        
        textField_2 = new JTextField();
        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        gbc_textField_2.insets = new Insets(0, 0, 0, 5);
        gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_2.gridwidth = 4; 
        gbc_textField_2.gridx = 0;
        gbc_textField_2.gridy = 8;
        contentPane.add(textField_2, gbc_textField_2);
        textField_2.setColumns(10);
        

        
        for (int i = 0 ; i < 6 ; i++) {
        	try {
    			mp2.add(new MyJPanel(90, 90, ImageIO.read(new File("image/such.png"))));
    		} catch (IOException e1) {
    			// TODO 自动生成的 catch 块
    			e1.printStackTrace();
    		}
            JPanel jptext = new JPanel(new GridLayout(4,1));
            jptext.add(new JLabel("名称:xx"));
            jptext.add(new JLabel("星级:x星"));
            jptext.add(new JLabel("等级:xx级别"));
            jptext.add(new JLabel("精炼:x精"));
            mp2.add(jptext);
        }
        
	}
	

}
class MyJPanel extends JPanel{
	Image img;
	int width;
	int hight ;
	public MyJPanel(int width , int hight , Image img2) {
		this.img = img2;
		this.width = width;
		this.hight = hight;
	}
	
	public void setImg(Image img) {
		this.img = img;
	}
	
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        try {
        	if (img != null) {
        		g.drawImage(img, 0,0,width,hight,this);
        	}else {
        		g.drawImage(ImageIO.read(new File("image/loding.png")), 0,0,width,hight,this);
        	}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    //    index++;
    }
}