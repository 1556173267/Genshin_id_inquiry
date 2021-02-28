package MyJFrame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class AvatarsActionListener implements ActionListener{
	JButton[] jbs ; 
	String Avatars ;
	String Avatars_data;
	String weapon ;
	String reliquaries ;
	MyJPanel Avatars_jp ;
	JPanel reliquaries_jp ;
	JTextField jtx ; 
	/**
	 * 
	 * @param Avatars	角色名;角色图url 
	 * @param Avatars_data	jcid+";"+jcname+";"+fetter+";"+level+";"+rarity 角色id+角色名+好感度+等级+星级+命座
	 * @param weapon	武器名;武器星级;武器等级;武器图;武器精炼度 ; 武器类型。武器描述
	 * @param reliquaries 不知道多少的圣遗物:圣遗物属性名;圣遗物名;圣遗物等级;圣遗物星级;圣遗物图;类型;
	 * @param Avatars_jp //角色图面板
	 * @param reliquaries_jp	//武器及圣遗物面板
	 */
	public AvatarsActionListener(JButton[] jbs , String Avatars ,String Avatars_data , String weapon , String reliquaries , MyJPanel Avatars_jp , JPanel reliquaries_jp , JTextField jtx) {
		this.jbs = jbs;
		this.Avatars = Avatars;
		this.Avatars_data = Avatars_data;
		this.weapon = weapon;
		this.reliquaries = reliquaries;
		this.Avatars_jp = Avatars_jp;
		this.reliquaries_jp = reliquaries_jp;
		this.jtx = jtx;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("点击了"+Avatars.split(";")[0]);
		for (int i = 0 ; i < jbs.length ; i++) {
			
			
			if (jbs[i].getText().toString().equals(Avatars.split(";")[0])) {
				jbs[i].setEnabled(false);
			}else {
				jbs[i].setEnabled(true);
			}
		}
		
		GetImg gi = new GetImg(Avatars.split(";")[1]);
		gi.start();
		Avatars_jp.addMouseListener(new ShowUrl_ActionListener(jtx, Avatars.split(";")[1]));
		System.out.println("角色立绘链接:"+Avatars.split(";")[1]);
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
						Avatars_jp.setImg(ImageIO.read(new File("image/toError.png")));
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}else {
					Avatars_jp.setImg((BufferedImage) gi.getImg());
				}
				Avatars_jp.repaint();
			};
		}.start();
		
		Avatars_jp.setToolTipText("<html><h3>角色名:"+Avatars_data.split(";")[1]+"<br>等级:"+Avatars_data.split(";")[3]+"<br>好感度:"+Avatars_data.split(";")[2]+"<br>命座:"+Avatars_data.split(";")[5]+"<h3></html>");
		
		reliquaries_jp.removeAll();
		reliquaries_jp.setLayout(new GridLayout(6,2));
		
		MyJPanel myweapondata = new MyJPanel(90, 90, null);
		reliquaries_jp.add(myweapondata);
		repaintMyJP(myweapondata ,  weapon.split(";")[3]);
		myweapondata.addMouseListener(new ShowUrl_ActionListener(jtx,  weapon.split(";")[3]));
		myweapondata.setToolTipText("<html><h3>武器类型:"+weapon.split(";")[5].replace("[.]", "<br>描述:")+"<h3></html>");
		JPanel jptext = new JPanel(new GridLayout(4,1));
        jptext.add(new JLabel("名称:"+weapon.split(";")[0]));
        jptext.add(new JLabel("星级:"+weapon.split(";")[1]));
        jptext.add(new JLabel("等级:"+weapon.split(";")[2]));
        jptext.add(new JLabel("精炼:"+weapon.split(";")[4]));
		reliquaries_jp.add(jptext);
		
		if (reliquaries == null || reliquaries.equals("")) {
			for (int i = 0 ; i < 5 ; i++) {
				setNull();
			}
		}else {
			System.out.println("圣遗物有"+reliquaries.split("\t").length+"个:"+reliquaries);
			String[] all_data = {"生之花","死之羽","时之沙","空之杯","理之冠"};
			int k = 0;
			for (int i = 0 ; i+k < 5 ; i++) {
				if (i >= reliquaries.split("\t").length) {
					setNull();
					k++;
					continue;
				}
				if (reliquaries.split("\t")[i].split(";")[0].equals(all_data[i+k])) {
					MyJPanel myweapondata1 = new MyJPanel(90, 90, null);
					reliquaries_jp.add(myweapondata1);
					repaintMyJP(myweapondata1 , reliquaries.split("\t")[i].split(";")[4] );
					
					myweapondata1.setToolTipText("<html><h3>"+reliquaries.split("\t")[i].split(";")[5].replace("。", "<br>")+"<h3></html>");
					myweapondata1.addMouseListener(new ShowUrl_ActionListener(jtx,reliquaries.split("\t")[i].split(";")[4] ));
			
					JPanel reliquariestext = new JPanel(new GridLayout(3,1));
					reliquariestext.add(new JLabel("名称:"+reliquaries.split("\t")[i].split(";")[1]));
					reliquariestext.add(new JLabel("等级:"+reliquaries.split("\t")[i].split(";")[2]));
					reliquariestext.add(new JLabel("星级:"+reliquaries.split("\t")[i].split(";")[3]));
					reliquaries_jp.add(reliquariestext);
					System.out.println("加载圣遗物 "+reliquaries.split("\t")[i].split(";")[1]+" 成功");
				}else {
					k++;
					setNull();
					i--;
				}
				
			}
		}
		reliquaries_jp.validate();
	}
	
	void setNull(){
			MyJPanel myweapondata1 = new MyJPanel(90, 90, null);
			reliquaries_jp.add(myweapondata1);
			try {
				myweapondata1.setImg(ImageIO.read(new File("image/null.png")));
				myweapondata1.repaint();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			JPanel reliquariestext = new JPanel(new GridLayout(3,1));
			reliquariestext.add(new JLabel("名称:"));
			reliquariestext.add(new JLabel("星级:"));
			reliquariestext.add(new JLabel("等级:"));
			reliquaries_jp.add(reliquariestext);
			System.out.println("加载圣遗物"+" 空 "+"成功");
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

class GetImg extends Thread{
	
	Image img;
	String url;
	boolean flag = false;
	public GetImg(String url) {
		this.url = url;
	}
	
	public Image getImg() {
		return img;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setReadTimeout(150000);
            connection.setConnectTimeout(10000);
            connection.setRequestMethod("GET");
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();
                img = ImageIO.read(inputStream);
                flag = true;
                return ;
            }
        } catch (IOException e) {
            System.out.println("获取网络图片出现异常，图片路径为：" + url);
            flag = true;
            img = null;
        }
		
        img = null;
		
		
		
	}
}

class ShowUrl_ActionListener implements MouseListener {

	JTextField jtx ;
	String url ;
	public ShowUrl_ActionListener(JTextField jtx , String url) {
		this.jtx = jtx;
		this.url = url;
	}
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		jtx.setText("图片链接:"+url);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	
}
