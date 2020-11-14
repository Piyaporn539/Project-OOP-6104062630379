
package monkey;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playstate1 extends JPanel implements ActionListener{
    
	private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("back5.jpg"));
	private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("back3.jpg"));
        private final ImageIcon imheart = new ImageIcon(this.getClass().getResource("heart.png"));
        
	monkey m = new monkey();
        
	homegames hg = new homegames();
        
	ImageIcon feildover = new ImageIcon(this.getClass().getResource("back4.5.jpg"));
	ImageIcon img_stop = new ImageIcon(this.getClass().getResource("monkey.png"));
        ImageIcon play = new ImageIcon(this.getClass().getResource("play.png"));
        JButton Bplay = new JButton(play);
	
	private JLabel score = new JLabel(); 
	public ArrayList<apple> ap = new ArrayList<apple>();
	public ArrayList<grape> gr = new ArrayList<grape>();
        public ArrayList<banana> ba = new ArrayList<banana>();
        public ArrayList<orange> or = new ArrayList<orange>();
	public ArrayList<bom> bo = new ArrayList<bom>();
        public ArrayList<toom> tom = new ArrayList<toom>();
        public ArrayList<boss> boss = new ArrayList<boss>();
        public ArrayList<plane> plane = new ArrayList<plane>();
         public ArrayList<boll4> boll4 = new ArrayList<boll4>();
	public int times = 90;
	public int HP = 5;
	boolean timestart = true;
	boolean startball = false;
	
	private gameover gover = new gameover();
	public int scor = 0;
	boolean stop = false;
	int time_stop=5;
	
	Thread time = new Thread(new Runnable(){
            public void run(){
		while(true){
                    try{
			Thread.sleep(5 );
                    }catch(Exception e){ }
                    
                    if(timestart == false){
			repaint();
                    }
		}
            }
	});
        Thread tballs3 = new Thread(new Runnable(){
            public void run() {
                while(true){
                	try{
                            if(startball == false){
				Thread.sleep((long)(Math.random()*10000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            boll4.add(new boll4());
			}
		}
            }
            
	}); 
	
	Thread timeapple = new Thread(new Runnable(){ //กำนหนดเวลา
            public void run() {
                while(true){
                	try{
                            if(startball == false){
				Thread.sleep(3000); //3วิ
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ap.add(new apple());
			}
		}
            }
	});
	Thread timegrape = new Thread(new Runnable(){
            public void run() {
		while(true){
			try{
                            if(startball==false){
				Thread.sleep(3500);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            gr.add(new grape());
			}
                }
            }
         });
        Thread timebanana = new Thread(new Runnable(){
            public void run() {
		while(true){
			try{
                            if(startball==false){
				Thread.sleep(5500);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba.add(new banana());
                       
			}
		}
            }
	});
	Thread timeorange = new Thread(new Runnable(){
            public void run() {
		while(true){
			try{
                            if(startball==false){
				Thread.sleep(6000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            or.add(new orange());
                       
			}
		}
            }
	});
	Thread timebom = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep(4000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            bo.add(new bom());                         
			}
		}
            }
	});
        
        Thread timetoom = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep(5000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            tom.add(new toom());
                            try{
                                Thread.sleep(500);
                            }catch(Exception e){ }
                                repaint();
                            tom.add(new toom());
                            try{
                                Thread.sleep(600);
                            }catch(Exception e){ }
                                repaint();
                            tom.add(new toom());
                            try{
                                Thread.sleep(700);
                            }catch(Exception e){ }
                                repaint();
                            tom.add(new toom());
                            try{
                                Thread.sleep(800);
                            }catch(Exception e){ }
                                repaint();
                            tom.add(new toom());
                            try{
                                Thread.sleep(900);
                            }catch(Exception e){ }
                                repaint();
			}
		}
            }
	});
        Thread timeboss = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep(500);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            boss.add(new boss());
                            try{
                                Thread.sleep(1000);
                            }catch(Exception e){ }
                                repaint();
                            boss.add(new boss());
                            try{
                                Thread.sleep(1050);
                            }catch(Exception e){ }
                                repaint();
                            boss.add(new boss());
                            try{
                                Thread.sleep(1100);
                            }catch(Exception e){ }
                                repaint();
                            boss.add(new boss());
                            try{
                                Thread.sleep(1150);
                            }catch(Exception e){ }
                                repaint();
                            boss.add(new boss());
                            try{
                                Thread.sleep(1200);
                            }catch(Exception e){ }
                                repaint();
                            boss.add(new boss());
                            try{
                                Thread.sleep(1250);
                            }catch(Exception e){ }
                                repaint();
 
			}
		}
            }
	});
        
	Thread timeplane = new Thread(new Runnable(){ //กำนหนดเวลา
            public void run() {
                while(true){
                	try{
                            if(startball == false){
				Thread.sleep(3000); //3วิ
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            plane.add(new plane());
			}
		}
            }
	});
	
        // การลดเวลาของ time
        Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                	if(timestart == false){
                            times = (times-1) ;
                            if(stop){
				time_stop--;
                            }
			}
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
	
	playstate1(){
		this.setFocusable(true);
		this.setLayout(null);
		this.add(score);
		this.addKeyListener(new KeyAdapter(){
                    public void keyPressed(KeyEvent e){ //การเคลื่อนที่โดยใช้ ลูกศร
                        int a = e.getKeyCode();
			if(!stop){ 
			    if(a==KeyEvent.VK_LEFT){
			     	m.x-=10;
                                m.count=0;
                            }
                            else if(a == KeyEvent.VK_RIGHT){
                                m.x+=10;
                                m.count=1;
			   }
                            else if(a== KeyEvent.VK_UP ){
                                m.y-=10;
                                m.count=0;
                            }
                            else if(a== KeyEvent.VK_DOWN ){
                                m.y+=10;
                                m.count=1;
                            }
                            
			}
                    }
		});
		
		m.x = 350; 
                m.y = 800;
		time.start(); 
		t.start();
		timeapple.start(); //เวลาของแอปเปิ้ลที่ตกลงมา
		timegrape.start();
                timebanana.start();
                timeorange.start();
		timebom.start();
                timetoom.start();
                timeboss.start();
                timeplane.start();
                tballs3.start();
                          
                
	}

	public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(times <= 0 || HP<=0){  //หน้าเกมover
                this.setLayout(null);
                g.drawImage(feildover.getImage(),0,0,800,1000,this);
		g.setColor(Color.BLACK);
                g.setFont(new Font("Arial Rounded MT Bold",Font.HANGING_BASELINE,90));	
                g.drawString("GAME OVER",100,150);	     
                g.setFont(new Font("Arial Rounded MT Bold",Font.HANGING_BASELINE,40));
                g.drawString("YOUR SCORE :  "+scor,220,250);
                g.setFont(new Font("Arial Rounded MT Bold",Font.HANGING_BASELINE,30));
                g.drawString(" Thank you for playing !!! ",220,320);   
            }
            
            else if(times <= 30 ){  // กลับด่านแรก
                g.drawImage(imgstate1.getImage(),0,0,800,1000,this);
                if(stop){
                    g.drawImage(img_stop.getImage(), m.x, m.y,100,150, this);
//                  g.drawImage(img_stop.getImage(), m.y, 550,100,150, this);
                }else{
                    g.drawImage(m.ip[m.count].getImage(), m.x, m.y,130,130, this); //ตำแหน่งของตัวละคร
                }
   		if(m.x<0){
                    m.x=this.getWidth()-10;

   		}
   		if(m.x>this.getWidth()){
                    m.x=20;
   		}
                
		for(int i=0 ; i<ap.size();i++){
                    g.drawImage(ap.get(i).getImage(),ap.get(i).getX(),ap.get(i).getY(),100,100,this);
 		}
		    for(int j=0 ; j<ap.size();j++){
		    	if(Intersect(ap.get(j).getbound(),m.getbound())){
			    scor += 10;
                            ap.remove(j);
			    g.drawString("+10",m.x+100,m.x+100);
			} 
		    }
                    
                    
		for(int i=0 ; i<gr.size();i++){
		    g.drawImage(gr.get(i).getImage(),gr.get(i).getX(),gr.get(i).getY(),90,90,this);
		 }
		    for(int j=0 ; j<gr.size();j++){
		    	if(Intersect(m.getbound(),gr.get(j).getbound())){
			    gr.remove(j);
			    scor += 20;
			    g.drawString("+20",m.x+100,650);
			 } 
		    }
                    
                
		for(int i=0 ; i<ba.size();i++){
		    g.drawImage(ba.get(i).getImage(),ba.get(i).getX(),ba.get(i).getY(),100,100,this);
		 }
		    for(int j=0 ; j<ba.size();j++){
		    	if(Intersect(m.getbound(),ba.get(j).getbound())){
			    ba.remove(j);
			    scor += 30;
			    g.drawString("+30",m.x+100,650);
			 } 
		    }
		
               for(int i=0 ; i<or.size();i++){
		    g.drawImage(or.get(i).getImage(),or.get(i).getX(),or.get(i).getY(),100,100,this);
		 }
		    for(int j=0 ; j<or.size();j++){
		    	if(Intersect(m.getbound(),or.get(j).getbound())){
			    or.remove(j);
			    scor += 30;
			    g.drawString("+40",m.x+100,500);
			 } 
		    }
		for(int i=0 ; i<tom.size();i++){
		    g.drawImage(tom.get(i).getImage(),tom.get(i).getX(),tom.get(i).getY(),50,100,this);
		}
                    for(int j=0 ; j<tom.size();j++){
                        if(Intersect(m.getbound(),tom.get(j).getbound())){
                            tom.remove(j);
			    scor -=20;
			    g.drawString("-20",m.x+100,650);
			} 
		    }
                         ////////plane////////
                for(int i=0 ; i<plane.size();i++){
		    g.drawImage(plane.get(i).getImage(),plane.get(i).getX(),plane.get(i).getY(),50,100,this);
		}
                    for(int j=0 ; j<plane.size();j++){
                        if(Intersect(m.getbound(),plane.get(j).getbound())){
                            plane.remove(j);
			    scor +=100;
			    g.drawString("+100",m.x+100,650);
			} 
		    }
               

		g.setFont(new Font("Arial Rounded MT Bold",Font.HANGING_BASELINE,30));
		g.setColor(Color.BLACK);
		g.drawString("SCORE =  "+scor,300, 50);	     
		g.setFont(new Font("Arial Rounded MT Bold",Font.HANGING_BASELINE,30)); 
                g.drawString("TIME =   "+times,570,50);
                g.setColor(Color.RED);
		g.drawString("      x "+HP,100,50); 
                g.drawImage(imheart.getImage(), 95, 15, 50, 50, this);
                
            }
            
            else if(times <= 60){ //หน้าเกมโบนัสเก็บหัวใจแต่มีอุปสรรคเป็นระเบิด
                g.drawImage(imgstate2.getImage(),0,0,800,1000,this); 
                if(stop){
                    g.setColor(Color.RED);
                    g.setFont(new Font("Hobo Std",Font.BOLD,50));
                    g.drawImage(img_stop.getImage(), m.x, m.y,100,150, this);
                    g.drawString("-10",m.x+100,650);
                }else{
                    g.drawImage(m.ip[m.count].getImage(), m.x, m.y,130,130, this); //ตำแหน่งของตัวละคร
                }
		if(m.x<0){
                    m.x=this.getWidth()-10;
		}
		if(m.x>this.getWidth()){
                    m.x=20;
		}
		for(int i=0 ; i<boll4.size();i++){
                    g.drawImage(boll4.get(i).getImage(),boll4.get(i).getX(),boll4.get(i).getY(),100,100,this);
 		}
                for(int j=0 ; j<boll4.size();j++){
		    	if(Intersect(boll4.get(j).getbound(),m.getbound())){
			    scor -=40;
			    HP=HP-1;
                            boll4.remove(j);
			    g.drawString("-10",m.x+100,m.x+100);
			} 
		    }
                for(int i=0 ; i<or.size();i++){
		    g.drawImage(or.get(i).getImage(),or.get(i).getX(),or.get(i).getY(),100,100,this);
		 }
		    for(int j=0 ; j<or.size();j++){
		    	if(Intersect(m.getbound(),or.get(j).getbound())){
			    or.remove(j);
			    scor += 30;
			    g.drawString("+40",m.x+100,500);
			 } 
		    }
                
		for(int i=0 ; i<boss.size();i++){
		    g.drawImage(boss.get(i).getImage(),boss.get(i).getX(),boss.get(i).getY(),80,80,this);
		}
	
		    for(int j=1 ; j<boss.size();j++){ //โดนระเบิด -1
		    	if(Intersect(m.getbound(),boss.get(j).getbound())){
			    boss.remove(j);
			    scor -=40;
			    HP=HP-1;
			    g.drawString("-1",m.x+100,650);
			    g.drawString("-40",m.x+100,580);
			} 
		    }
                    
                    
                    for(int i=0 ; i<bo.size();i++){
                        g.drawImage(bo.get(i).getImage(),bo.get(i).getX(),bo.get(i).getY(),80,80,this);
		}
		    for(int j=0 ; j<bo.size();j++){  //เก็บหัวใจ +1
		    	if(Intersect(m.getbound(),bo.get(j).getbound())){
			    bo.remove(j);
			    HP=HP+1;
			    g.drawString("+1",m.x+100,650);
			} 
		    }    
                g.setFont(new Font("Kristen ITC",Font.HANGING_BASELINE,30));
		g.setColor(Color.BLACK);
		g.drawString("SCORE =  "+scor,300, 50);	     
		g.setFont(new Font("Kristen ITC",Font.HANGING_BASELINE,30)); 
		g.drawString("TIME =   "+times,570,50);
                g.setColor(Color.RED);
		g.drawString("      x "+HP,100,50);
                g.drawImage(imheart.getImage(), 95, 15, 50, 50, this);
	      
	    }
            
            
        else { //ด่านแรกของเกม
                
                g.drawImage(imgstate1.getImage(),0,0,800,1000,this);
                if(stop){
                    g.drawImage(img_stop.getImage(), m.x, m.y,100,150, this); 
                }else{
                    g.drawImage(m.ip[m.count].getImage(), m.x, m.y,130,130, this); //ตำแหน่งของตัวละคร
                }
   		if(m.x<0){
                    m.x=this.getWidth()-10;

   		}
   		if(m.x>this.getWidth()){
                    m.x=20;
   		}        
                for(int i=0 ; i<boll4.size();i++){
                    g.drawImage(boll4.get(i).getImage(),boll4.get(i).getX(),boll4.get(i).getY(),100,100,this);
 		}
                for(int j=0 ; j<boll4.size();j++){
		    	if(Intersect(boll4.get(j).getbound(),m.getbound())){
			    scor -=40;
			    HP=HP-1;
                            boll4.remove(j);
			    g.drawString("-10",m.x+100,m.x+100);
			} 
		    }

                for(int i=0 ; i<ap.size();i++){
                    g.drawImage(ap.get(i).getImage(),ap.get(i).getX(),ap.get(i).getY(),100,100,this);
 		}
		    for(int j=0 ; j<ap.size();j++){
		    	if(Intersect(ap.get(j).getbound(),m.getbound())){
			    scor += 10;
                            ap.remove(j);
			    g.drawString("+10",m.x+100,m.x+100);
			} 
		    }
                    
                    
		for(int i=0 ; i<gr.size();i++){
		    g.drawImage(gr.get(i).getImage(),gr.get(i).getX(),gr.get(i).getY(),90,90,this);
		 }
		    for(int j=0 ; j<gr.size();j++){
		    	if(Intersect(m.getbound(),gr.get(j).getbound())){
			    gr.remove(j);
			    scor += 20;
			    g.drawString("+20",m.x+100,650);
			 } 
		    }
                    
                
		for(int i=0 ; i<ba.size();i++){
		    g.drawImage(ba.get(i).getImage(),ba.get(i).getX(),ba.get(i).getY(),100,100,this);
		 }
		    for(int j=0 ; j<ba.size();j++){
		    	if(Intersect(m.getbound(),ba.get(j).getbound())){
			    ba.remove(j);
			    scor += 30;
			    g.drawString("+30",m.x+100,650);
			 } 
		    }
		
               for(int i=0 ; i<or.size();i++){
		    g.drawImage(or.get(i).getImage(),or.get(i).getX(),or.get(i).getY(),100,100,this);
		 }
		    for(int j=0 ; j<or.size();j++){
		    	if(Intersect(m.getbound(),or.get(j).getbound())){
			    or.remove(j);
			    scor += 40;
			    g.drawString("+30",m.x+100,650);
			 } 
		    }
		for(int i=0 ; i<tom.size();i++){
		    g.drawImage(tom.get(i).getImage(),tom.get(i).getX(),tom.get(i).getY(),50,100,this);
		}
                    for(int j=0 ; j<tom.size();j++){
                        if(Intersect(m.getbound(),tom.get(j).getbound())){
                            tom.remove(j);
			    scor -=20;
			    g.drawString("-20",m.x+100,650);
			} 
		    }
                    
                    ////////plane////////
                for(int i=0 ; i<plane.size();i++){
		    g.drawImage(plane.get(i).getImage(),plane.get(i).getX(),plane.get(i).getY(),50,100,this);
		}
                    for(int j=0 ; j<plane.size();j++){
                        if(Intersect(m.getbound(),plane.get(j).getbound())){
                            plane.remove(j);
			    scor +=100;
			    g.drawString("+100",m.x+100,650);
			} 
		    }
  
                
		g.setFont(new Font("Kristen ITC",Font.HANGING_BASELINE,30));
		g.setColor(Color.BLACK);
		g.drawString("SCORE =  "+scor,300, 50);	     
		g.setFont(new Font("Kristen ITC",Font.HANGING_BASELINE,30));
		g.drawString("TIME =   "+times,570,50);
                g.setColor(Color.RED);
		g.drawString("      x "+HP,100,50); 
                g.drawImage(imheart.getImage(), 95, 15, 50, 50, this);
            }
	}

	public boolean Intersect(Rectangle2D a, Rectangle2D b){
		return (a.intersects(b));
	}
        
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Bplay){		
                    this.setSize(800,1000);
                    this.add(hg);
                    this.setLocation(null);
                    timestart = true;
                    startball = true;
		}		
	}
}
