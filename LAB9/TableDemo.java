import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;
	TableDemo(){
		super("JTable pane Demo");
		
		String[] heading = {"Name","Course","RoollNo"};
		String[][] data = {
					{"DELL","CSE","123456"},
					{"BELL","CSD","123457"},
					{"CELL","CSM","123458"},
					{"YELL","CSIT","123459"},
		};
					
		JTable jt = new JTable(data,heading);
		JScrollPane jsp = new JScrollPane(jt);
		
		add(jsp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TableDemo();
	}	
}	
	
