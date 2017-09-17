package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.HashMap;

import javax.swing.*;
public class LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer,String>map = new HashMap<Integer,String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	LogSearch(){
	frame.setSize(800, 500);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.pack();
	
	button1.setText("Add Entry");
	button2.setText("Search by ID");
	button3.setText("View List");
	button4.setText("Remove Entry");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	}
	public static void main(String[] args) {
	LogSearch l = new LogSearch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String identification = JOptionPane.showInputDialog("Enter an ID");
			String name = JOptionPane.showInputDialog("Enter a name");
			int id = Integer.parseInt(identification);
			map.put(id, name);
		}
		if(e.getSource() == button2) {
			String identification = JOptionPane.showInputDialog("Search for an ID");
			Integer id = Integer.parseInt(identification);
			if(map.get(id) == null) {
			JOptionPane.showMessageDialog(null, "User not found");
			} else {
			JOptionPane.showMessageDialog(null,"ID #" + id + ", " + map.get(id));
		}
		}
		if(e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, map.toString());
		}
		if(e.getSource() == button4) {
			String s = JOptionPane.showInputDialog("Which user would you like to delete (id)");
			int id = Integer.parseInt(s);
			if(map.containsKey(id)) {
				map.remove(id);
			}
			else {
				JOptionPane.showMessageDialog(null, "User not found");
			}
		}
	}
}
