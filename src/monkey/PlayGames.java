
package monkey;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PlayGames extends JFrame implements ActionListener{  
	homegames homegames1 = new homegames();
	playstate1 state = new playstate1();
	gameover gover = new gameover();
	public PlayGames(){
		this.setSize(800,1000);
		this.add(homegames1);
                homegames1.Bstart.addActionListener(this);
                homegames1.BExit1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()== homegames1.Bstart){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(800,1000);
                this.add(state);
                state.requestFocusInWindow();
		state.startball=false;
		state.timestart=false;
            }
            else if(e.getSource() == homegames1.BExit1){
		System.exit(0);
            }
            this.validate();
            this.repaint();
	}
        
     public static void main(String[] args) {
            JFrame jf = new PlayGames();
            jf.setSize(800,1000);
            jf.setTitle(" MONKEY FRUITY ");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
    }    
        
}
