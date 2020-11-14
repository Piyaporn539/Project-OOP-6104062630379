
package monkey;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class monkey{
    
    public ImageIcon[] ip = new ImageIcon[7];
    public int x;
    public int y;
    public int count = 0;
    monkey(){
        for(int i=0;i<ip.length;i++){
            ip[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));
	}
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,130,130));
	}
}
