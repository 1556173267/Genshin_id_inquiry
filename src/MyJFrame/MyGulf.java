package MyJFrame;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MyGulf extends JPanel {


	/**
	 * Create the panel.
	 */
	public MyGulf() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{153, 252, 0};
		gridBagLayout.rowHeights = new int[]{59, 68, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("\u7B2CX\u5173");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		
		int cen = 4 ; 
		int 上下层 = 2 ;
		
		GridBagLayout gb_panel = new GridBagLayout();
		panel.setLayout(gb_panel);
		gb_panel.columnWidths = new int[] {153+252};
		gb_panel.rowHeights = new int[cen];
		
		for (int i = 0 ; i < cen ; i++) {
			gb_panel.rowHeights[i] = 100;
			GridBagConstraints gbc = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = i+1;
			gbc_panel.gridy = 0;
			panel.add(new FloorJP(上下层 , i) , gbc);
			
		}
		

	}

}
