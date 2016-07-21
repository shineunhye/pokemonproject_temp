package pokemonproject;
import java.awt.*;
import javax.swing.*;
//import GameUsingTimer.GamePanel;

import java.awt.event.*;
public class GameView extends JPanel implements KeyListener{
	GamePanel gp=new GamePanel();
	public static void main(String[] args) {
		new GameView();
	}
	GameView(){
		int WIDTH=1280;
		int HEIGHT=720;
		int gamePanelWidth, gamePanelHeight;
		
		JPanel controlPanel=new JPanel();
		JButton start=new JButton("START");
		JButton end=new JButton("THE END");
		//JLabel timing=new JLabel("시간  : 0분 0초");
		//JLayeredPane lp = new JLayeredPane();	
		//JPanel coverPanel;					
		
		String user1,user2;
		
		
		
		//게임 메뉴 패널
		controlPanel.add(start);
		controlPanel.add(end);
		//controlPanel.add(timing);
		controlPanel.add(new JLabel(" Player : "));
		controlPanel.add(new JLabel(" Time : "));
		controlPanel.add(new JLabel(" Life : "));
		
		//전체 프레임
		
		setLayout(null);
		gp.setBounds(0, 0, WIDTH, 644);
		controlPanel.setBounds(0, 645, WIDTH, 75);
		add(gp);
		add(controlPanel);
		
		
		//게임이 이루어질 패널의 실제 크기
		gamePanelWidth=WIDTH;
		gamePanelHeight=HEIGHT-75;
		
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
