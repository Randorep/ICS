import java.applet.Applet;
import java.awt.*;
public class Exercise2 extends Applet{
	public void init() {
		resize(1000,600);
		Color blue = new Color(89, 69, 191);
		setBackground(blue);
		
	}
	public void painting(Graphics g) {
		Color black = new Color(0, 0, 0);
		g.drawString("Jason is big boy",1,1);
		g.fillRect(100,105,50,20);
		g.setColor(black);
		g.fillRect(100,105,50,20);
	}
	
	}


