package PrintRec;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Assign11PanelMouse extends MouseAdapter{
	
	JPanel panel;

	public Assign11PanelMouse(JPanel panel) {
		this.panel = panel;
	}
		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = panel.getGraphics();
			g.drawRect(e.getX(), e.getY(), 20, 20);
		
		}
	

}