import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener  {

		//variables
		private static JLabel title;
		private static JLabel userLabel;
		private static JLabel passwordLabel;
		private static JLabel success; 
		private static JTextField userText;
		private static JTextField passwordText;
		private static JButton button;
		private static JLabel attempts;
		int count = 3;
		
		
	public static void main(String[] args) {
		JPanel panel = new JPanel();//obj	
		JFrame frame = new JFrame("MY APP");//obj
		
		frame.setSize(300,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		title = new JLabel("Java Enterprise");
		title.setBounds(90, 5, 110, 50);
		panel.add(title);
		
		userLabel = new JLabel("Username:");
		userLabel.setBounds(10,50,80,25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(80, 50, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 80, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(80, 80, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 110, 100, 25);
		button.addActionListener(new Login());
		panel.add(button);
		
		success = new JLabel();
		success.setBounds(10, 110, 300, 100);
		panel.add(success);
		
		
		frame.setVisible(true);
		
		
	
		
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText();
	
			try {
			if (count != 0) {
				if(user.equals("Psalm") && password.equals("Alonzo")) {
					success.setText("Access Approved");
				}else {
					success.setText("Incorrect! " + "Attempts left: " +count);
		           --count;
				}
				}else{
					success.setText("Access Denied");
					System.exit(0);
				}
			
				}	catch(Exception f) {
					System.out.println(f.getMessage());
					
			}
	}
}

