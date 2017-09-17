package IntroToStacks; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.xml.soap.Text;

public class TextUndoRedo implements ActionListener,KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String text = "";
	Stack<String> chars = new Stack<String>();


//
// Choose a key to be the Undo key. Make it so that when that key is
// pressed, the top Character is popped off the Stack and added back to the
// JLabel.
	
	TextUndoRedo() {
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(label);
		frame.setVisible(true);
//		panel.setVisible(true);
//		label.setVisible(true);
		frame.pack();
		
	}

	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() != 37) {
		text+=(char)(e.getKeyCode());
		label.setText(text);
		}
		if(e.getKeyCode() == 8){
			chars.push(text.substring(text.length()-2));
			text = text.substring(0,text.length()-2);
			label.setText(text);
		}
		if(e.getKeyCode() == 37) {
			text+=chars.pop();
		
		}
		label.setText(text);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
