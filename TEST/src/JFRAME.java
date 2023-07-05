import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class JFRAME {

	    public static void main(String[] args) {
	    	
	    	JFrame window = new JFrame("JFrame with text"); 
	    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	window.setLayout(new BorderLayout());
	    	window.add(new JLabel("Hello World"), BorderLayout.CENTER);
	    	window.pack();
	    	window.setVisible(true);
	    	window.setLocationRelativeTo(null);
	       

	    }
	}

