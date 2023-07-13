package cn.tuyucheng.taketoday.jar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MySampleGUIAppn extends JFrame {
	public MySampleGUIAppn() {
		if (!GraphicsEnvironment.isHeadless()) {
			setSize(300, 300);
			setTitle("MySampleGUIAppn");
			Button b = new Button("Click Me!");
			b.setBounds(30, 100, 80, 30);
			add(b);
			setVisible(true);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
					System.exit(0);
				}
			});
		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		MySampleGUIAppn app = new MySampleGUIAppn();
	}
}
