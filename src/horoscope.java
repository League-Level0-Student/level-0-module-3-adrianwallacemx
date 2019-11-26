import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		
	String horo	=JOptionPane.showInputDialog("what's your star sign");
	if (horo.equals ("aries")) {
		JOptionPane.showMessageDialog(null, "you are Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action");
	}
	else if (horo.equals("taurus")) {
		JOptionPane.showMessageDialog(null,"you are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature");
	}
	else if (horo.equals ("gemini")){
		JOptionPane.showMessageDialog(null, "you are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature");
	}
	else if (horo.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "you are Emotional, group oriented, seeks security, family");
	}
	else if(horo.equals("leo")) {
		JOptionPane.showMessageDialog(null, "you are Generous, organized, protective, beautiful");
	}
	else if (horo.equals("virgo")) {
		JOptionPane.showMessageDialog(null, "you are Particular, logical, practical, sense of duty, critical");
	}
	else if (horo.equals("libra")) {
		JOptionPane.showMessageDialog(null, "you are Balanced, seeks beauty, sense of justice");
	}
	else if (horo.equals("scopio")){
		JOptionPane.showMessageDialog(null, "you are Passionate, exacting, loves extremes, combative, reflective");
	}
	else if (horo.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "you are Happy, absent minded, creative, adventurous");
	}
	else if (horo.equals("capricorn")) {
		JOptionPane.showMessageDialog(null, "you are Timeless, driven, calculating, ambitious");
	}
	else if (horo.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "you are Forward thinking, communicative, people oriented, stubborn, generous, and dedicated");
		
	}
	else if (horo.equals("Pisces")) {
		JOptionPane.showMessageDialog(null,"you are Likeable, energetic, passionate, sensitive");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
	}
	
	

}
