import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("are you happy");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		} else if (happy.equals("no")) {
			String hap = JOptionPane.showInputDialog("do you want to be happy");
			if (hap.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			}
			if (hap.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep ding whatever you are doing");
			}

		}

	}

}
