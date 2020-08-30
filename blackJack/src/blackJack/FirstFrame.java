package blackJack;

import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FirstFrame {
	//메인 윈도우 창
	JFrame firstFrame = new JFrame(); 
	
	//버튼 패널
	JPanel btsPanel = new JPanel();
	
	//라벨
	JLabel tittle1 = new JLabel("이것은..");
	JLabel tittle2 = new JLabel("블랙잭!");
	
	//메인화면 버튼
	JButton singleBtn = new JButton("Single Game");
	JButton joinBtn = new JButton("join Game");
	JButton hostBtn = new JButton("Host Game");
	JButton exitBtn = new JButton("Exit Game");
	
	public void makeFrame() {
		JButton[] btns = {singleBtn,joinBtn,hostBtn,exitBtn};
		
		//프레임 설정
		firstFrame.setBounds(800, 400, 400, 600);
		firstFrame.setLayout(null);
		
		//타이틀 라벨
		firstFrame.add(tittle1);
		firstFrame.add(tittle2);
		
		tittle1.setBounds(0, 20, 100, 45);
		tittle2.setBounds(0, 100, 100, 80);
		
		//버튼 패널 추가
		firstFrame.add(btsPanel);
		
		//버튼 패널 설정
		btsPanel.setBounds(0, 150, 400, 400);
		
		GridLayout gl = new GridLayout(4, 1);
		btsPanel.setLayout(gl);
		
		//버튼 크기 설정, 패널에 추가
		for (JButton jButton : btns) {
			btsPanel.add(jButton); //패널에 추가
			
			jButton.setSize(btsPanel.getX(), btsPanel.getY()/4);//버튼 크기 설정
		}
		
		//버튼 액션 설정
		singleBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		joinBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNotReady();
			}
		});
		
		hostBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNotReady();
			}
		});
		
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//화면 보이기
		firstFrame.setVisible(true);
		firstFrame.setResizable(false);
	}
	
	public void setVisibleOff() {
		firstFrame.setVisible(false);
	}
	
	public static void main(String[] args) {
		new FirstFrame().makeFrame();
	}
	
	public void showNotReady() {
		JOptionPane.showMessageDialog(null,"이 기능은 아직 준비중 입니다.","Message",JOptionPane.ERROR_MESSAGE);
	}
}
