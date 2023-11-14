package View;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
public class CalendarFrame extends JFrame {
	JPanel Date;
	JButton RightButton;
	JButton LeftButton;
	JPanel CalendarPanel;
	JPanel addPanel;
	public CalendarFrame(LocalDate today) {
		setSize(1000,1000);
		JLabel testlabel1 = new JLabel("North label");
		JLabel testlabel2 = new JLabel("South label");
		JLabel testlabel3 = new JLabel("West label");
		JLabel testlabel4 = new JLabel("East label");
		JLabel testlabel5 = new JLabel("Center label");
		add(testlabel1,"North");
		add(testlabel2,"South");
		add(testlabel3,"West");
		add(testlabel4,"East");
		add(testlabel5,"Center");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
