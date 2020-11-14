
package monkey;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class gameover extends JPanel{
	
	private ImageIcon feildover = new ImageIcon("back1.jpg");
	gameover(){
		this.setLayout(null);
	}
	public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  g.drawImage(feildover.getImage(),0,0,800,1000,this);
                  
        }
}

