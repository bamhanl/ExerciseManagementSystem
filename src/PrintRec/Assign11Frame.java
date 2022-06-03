package PrintRec;

import javax.swing.JFrame;

public class Assign11Frame extends JFrame {

	public Assign11Frame() {
		this.setSize(500, 500);
		this.setTitle("My Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Assign11FramePanel panel = new Assign11FramePanel();
		
        this.add(panel);
		
		this.setVisible(true);
	}

}
