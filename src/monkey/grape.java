package monkey;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;

public class grape extends apple{
    Image img;
    grape(){
        String imageLocation = "grape.png";
        URL imageURL1 = this.getClass().getResource(imageLocation);
        img = Toolkit.getDefaultToolkit().getImage(imageURL1);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
	public void run() {
            while(true){
		y += 1; //เลขมากผลไม้ตกลงมาเร้ว
		if(y >= 1000){
                    img = null;
                    runner = null;
                    x = -200;
                    y = 500;
                }
                try{
                    runner.sleep(15);
                }catch(InterruptedException e){}
            }
	}
    });

    public Image getImage(){
	return img;
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,45,45));
	}
}
