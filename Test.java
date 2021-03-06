import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class Test extends JFrame implements ActionListener{
	private JButton button;
	private JFrame frame;
	private JButton rick;
	public Test(){
		setTitle("Nonsensical Haiku Generator that may or may not rhyme");
		setSize(500, 500);
	}
	public void start(){
		frame = new Test();
		frame.show();
		Gen g = new Gen();
		g.generate();
		button = new JButton("Click here to generate another Haiku!");
		rick = new JButton("Click me!");
		JPanel panel = new JPanel();
		JLabel j1 = new JLabel("<html>"  +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" +  "<br>" + "Beautiful Haiku:" + "<br>" + g.getLine1() +  "<br>" + g.getLine2() + "<br>"  + g.getLine3() + "</html>");
		button.addActionListener(this);
		rick.addActionListener(this);
		frame.add(panel);
		panel.add(rick);
		panel.add(button);
		panel.add(j1);
		panel.setBackground(Color.GREEN);
		button.setVerticalAlignment(JLabel.TOP);
		j1.setVerticalAlignment(JLabel.TOP);
		frame.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			start();
		}
		if(e.getSource() == rick){
			if(Desktop.isDesktopSupported()){
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Oo0twK2ZbLU"));
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
				
					e1.printStackTrace();
				}
			}
		}
	}
	
}
