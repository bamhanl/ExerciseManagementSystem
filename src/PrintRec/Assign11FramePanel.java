package PrintRec;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Assign11FramePanel extends JPanel {

	
		public Assign11FramePanel() {
			this.addMouseListener(new Assign11PanelMouse(this));
	}
	

}