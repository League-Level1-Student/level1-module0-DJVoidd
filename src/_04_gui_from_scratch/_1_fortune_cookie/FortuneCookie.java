package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FortuneCookie implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	public void showButton() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		System.out.println("Button clicked");	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "A lifetime of happiness lies ahead of you.");
		}
		else if (rand==1) {
			JOptionPane.showMessageDialog(null, "Any decision you have to make tomorrow is a good decision.");
		}
		else if (rand ==2) {
			JOptionPane.showMessageDialog(null, "Don’t just think, act!");
		}
		else if (rand ==3) {
			JOptionPane.showMessageDialog(null, "Fortune Not Found: Abort, Retry, Ignore?");
		}
		else if (rand ==4) {
			JOptionPane.showMessageDialog(null, "The harder you work, the luckier you get.");
		}
	}
}
