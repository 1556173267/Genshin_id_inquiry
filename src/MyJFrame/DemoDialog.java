package MyJFrame;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DemoDialog extends JDialog {
    //construct method ���췽����ʼ��������ʽ
    public DemoDialog(JFrame jf , String str){
        this.setTitle("!����!");
        this.setVisible(true);
        Point a = jf.getLocation();
        if (jf == null ) {
        	this.setLocation(200,300);
        }else {
        	try {
        		this.setLocation(a.x+jf.getSize().width/2 - 175,a.y+jf.getSize().height/2 - 50);
        	}catch(Exception e){
        		this.setLocation(200,300);
        	}
        }this.setSize(350,100);
        //add one label
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(2,1));
        JLabel jLabel = new JLabel(str);
        contentPane.add(jLabel);
        JLabel jl = new JLabel("!!!!!!!!!!!!");
        contentPane.add(jl);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        //center ����
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

    }
}