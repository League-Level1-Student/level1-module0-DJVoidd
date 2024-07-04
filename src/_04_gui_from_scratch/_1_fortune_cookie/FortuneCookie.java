package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JOptionPane.showMessageDialog(null, "Woohoo!");
	}
}
