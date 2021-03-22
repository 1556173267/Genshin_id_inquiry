package MyJFrame;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

public class FloorJP extends JPanel {
	
	/**
	 * Create the panel.
	 */
	int len ; 
	int index ;
	public FloorJP(int len , int index) {
		this.len = len;	//�Ƿ������²�
		this.index = index;
		init();
	}
	
	public void init() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100,100,100,100,100,100, 0};
//		gridBagLayout.rowHeights = new int[]{49, 100, 103, 0};
		gridBagLayout.rowHeights = new int[len+2];
		for (int i = 0 ; i < gridBagLayout.rowHeights.length ; i++) {
			if (i == 0 ) {
				gridBagLayout.rowHeights[i] = 50;
				continue;
			}else if (i == gridBagLayout.rowHeights.length-1) {
				gridBagLayout.rowHeights[i] = 0;
				continue ; 
			}
			gridBagLayout.rowHeights[i] = 100;
		}
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("\u7B2C"+index+"\u5C42");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
//		GridBagLayout lb = new GridBagLayout();
		for (int l = 0; l < len ; l++) {
			for (int i = 0 ; i < 4 ; i++) {
				JPanel myjp = new JPanel();
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = i+1;
				gbc.gridy = l+1;
				gbc.insets = new Insets(0,0,0 , 5);
				gbc.fill = GridBagConstraints.BOTH;
				try {
					myjp.add(new MyJPanel(100, 100, ImageIO.read(new File("E:/a/face.jpg")))  , gbc);
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
		//		myjp.add(new JLabel("�ȼ�:80"));
				add(myjp , gbc);
			}
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 5;
			gbc.gridy = l;
			gbc.insets = new Insets(0, 0, 0, 5);
			gbc.fill = GridBagConstraints.BOTH;
			
			add(new JLabel("ʱ��:"),gbc);
//			System.out.println("Floor_JP����");
		}
//		System.out.println("Floor_JP����22");

	}

}
