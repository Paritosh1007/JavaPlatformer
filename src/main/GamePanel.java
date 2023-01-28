package main;

import java.awt.Graphics;


import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private KeyboardInputs keyboardInputs;
	
	public GamePanel() {
		
		// adding input listeners to the panel
		
		keyboardInputs = new KeyboardInputs();
		mouseInputs = new MouseInputs();
		
		addKeyListener(keyboardInputs);
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.fillRect(100, 100, 200, 50);

	}

}
