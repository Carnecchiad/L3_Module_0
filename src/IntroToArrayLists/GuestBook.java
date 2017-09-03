package IntroToArrayLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class GuestBook implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<String> list = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	

	public static void main(String[] args) {
		GuestBook book  = new GuestBook();
	
	}
	GuestBook(){
		
		
	
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.setText("add");
		button2.setText("show");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			list.add(JOptionPane.showInputDialog("add"));
		}
		if(e.getSource() == button2) {
			for (int i = 0; i < list.size(); i++) {
				JOptionPane.showMessageDialog(null, list.get(i));
			}
			
		}
	}
}
