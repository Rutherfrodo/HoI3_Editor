import javax.swing.JComboBox;
import javax.swing.JLabel;

public class CBoxItem {
	
	
	public CBoxItem(JComboBox<String> box, JLabel label, String Budynek, String textLabel)  {
		if(box.getSelectedItem()==Budynek) {
			label.setText(textLabel);
		}
		
	}
}
