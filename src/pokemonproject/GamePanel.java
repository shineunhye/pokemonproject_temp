package pokemonproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel{
	Image back,player;
	int x=570;
	int y=550;
	
	String [] img={"trainer1_Lt.gif","trainer1_Rt.gif"};
	
	public GamePanel(){
		back=Toolkit.getDefaultToolkit().getImage("C:\\JavaProjects\\JavaLab2\\pokemonproject\\img\\back.jpg");
		player=Toolkit.getDefaultToolkit().getImage("C:\\JavaProjects\\JavaLab2\\pokemonproject\\img\\trainer1_Rt.gif");
	}
	
	public void setImage(int no){
		player=Toolkit.getDefaultToolkit().getImage("C:\\JavaProjects\\JavaLab2\\pokemonproject\\img\\"+img[no]);
	}
	
	public void paint(Graphics g){
		g.drawImage(back, 0, 0,getWidth(),getHeight(),this);
		g.drawImage(player, x, y, this);
	}
}
