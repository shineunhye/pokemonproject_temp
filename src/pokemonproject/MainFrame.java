package pokemonproject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainFrame extends JFrame implements ActionListener,KeyListener{
	GamePanel gp=new GamePanel();
	int type=0;
	GameView gv=new GameView();
	CardLayout card=new CardLayout();
	JButton game=new JButton("게임 화면으로");
	MainFrame(){
		
		setLayout(card);
		add(game);
		add("GV",gv);
		setSize(1280,720);
		setVisible(true);
		gp.addKeyListener(this);
		game.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {	
		new MainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==game){
			card.show(getContentPane(),"GV");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("작동");
		switch(e.getKeyCode()){
		case KeyEvent.VK_RIGHT:
			type=0;
			gp.setImage(0);
			gp.x+=9;
			if(gp.x>640)
				gp.x=0;
			break;
		case KeyEvent.VK_LEFT:
			type=1;
			gp.setImage(1);
			gp.x-=9;
			if(gp.x<0)
				gp.x=1280;
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
