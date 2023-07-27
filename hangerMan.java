package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.awt.Component;
import javax.sound.sampled.*;




public class hangerMan extends JFrame implements ActionListener{  
	JLabel game;
	JLabel lblNewLabel_3;
	static int wrong=0; 
	 String ans="";
	static  int score=0;
	private JPanel contentPane;
	
	  HashMap<Character,Integer >hs;
	  StringBuffer word;
		JButton playagain;
	
	JPanel panel;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hangerMan frame = new hangerMan();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hangerMan() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 750);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel = new HangingAnimationPanel( wrong);
        panel.setBounds(645, 155, 309, 388);
        contentPane.add(panel);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Q");
		btnNewButton.setBackground(new Color(0, 204, 255));
	 btnNewButton.addActionListener(this);
		
		
		btnNewButton.setBounds(10, 507, 56, 33);
		contentPane.add(btnNewButton);

		
		JButton btnNewButton_1_1 = new JButton("E");
		 btnNewButton_1_1.addActionListener(this);

		
		btnNewButton_1_1.setBackground(new Color(0, 204, 255));
		btnNewButton_1_1.setBounds(139, 507, 51, 33);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("R");
		btnNewButton_1_2.setBackground(new Color(0, 204, 255));
		btnNewButton_1_2.setBounds(200, 503, 47, 40);
		contentPane.add(btnNewButton_1_2);
		 btnNewButton_1_2.addActionListener(this);

		
		JButton btnNewButton_1_3 = new JButton("T");
		 btnNewButton_1_3.addActionListener(this);

		
		
		btnNewButton_1_3.setBackground(new Color(0, 204, 255));
		btnNewButton_1_3.setBounds(257, 503, 47, 40);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Y");
		btnNewButton_1_4.setBackground(new Color(0, 204, 255));
		btnNewButton_1_4.setBounds(314, 507, 48, 33);
		contentPane.add(btnNewButton_1_4);
		 btnNewButton_1_4.addActionListener(this);

		
		JButton btnNewButton_1_5 = new JButton("U");
		btnNewButton_1_5.setBackground(new Color(0, 204, 255));
		btnNewButton_1_5.setBounds(372, 507, 66, 33);
		contentPane.add(btnNewButton_1_5);
		 btnNewButton_1_5.addActionListener(this);

		JButton btnNewButton_1_6 = new JButton("I");
		
		btnNewButton_1_6.setBackground(new Color(0, 204, 255));
		btnNewButton_1_6.setBounds(448, 507, 51, 33);
		contentPane.add(btnNewButton_1_6);
		 btnNewButton_1_6.addActionListener(this);

		JButton btnNewButton_1_7 = new JButton("O");
		btnNewButton_1_7.setBackground(new Color(0, 204, 255));
		btnNewButton_1_7.setBounds(515, 507, 63, 33);
		contentPane.add(btnNewButton_1_7);
		 btnNewButton_1_7.addActionListener(this);

		
		JButton btnNewButton_1_8 = new JButton("P");
		
		
		btnNewButton_1_8.setBackground(new Color(0, 204, 255));
		btnNewButton_1_8.setBounds(589, 503, 59, 40);
		contentPane.add(btnNewButton_1_8);
		 btnNewButton_1_8.addActionListener(this);

		JButton btnNewButton_1_9 = new JButton("W");
		btnNewButton_1_9.setBackground(new Color(0, 204, 255));
		btnNewButton_1_9.setBounds(76, 507, 56, 33);
		contentPane.add(btnNewButton_1_9);
		 btnNewButton_1_9.addActionListener(this);

		
		
		JButton btnNewButton_1_10 = new JButton("A");
	
		
		btnNewButton_1_10.setBackground(new Color(0, 204, 255));
		btnNewButton_1_10.setBounds(58, 551, 56, 38);
		contentPane.add(btnNewButton_1_10);
		 btnNewButton_1_10.addActionListener(this);

		
		JButton btnNewButton_1_11 = new JButton("S");
	
		
		btnNewButton_1_11.setBackground(new Color(0, 204, 255));
		btnNewButton_1_11.setBounds(124, 554, 50, 33);
		contentPane.add(btnNewButton_1_11);
		 btnNewButton_1_11.addActionListener(this);

		
		
		JButton btnNewButton_1_13 = new JButton("D");
	
		
		btnNewButton_1_13.setBackground(new Color(0, 204, 255));
		btnNewButton_1_13.setBounds(184, 554, 50, 33);
		contentPane.add(btnNewButton_1_13);
		
		 btnNewButton_1_13.addActionListener(this);

		
		JButton btnNewButton_1_14 = new JButton("F");
	
		
		
		btnNewButton_1_14.setBackground(new Color(0, 204, 255));
		btnNewButton_1_14.setBounds(244, 553, 52, 35);
		contentPane.add(btnNewButton_1_14);
		
		 btnNewButton_1_14.addActionListener(this);

		
		JButton btnNewButton_1_15 = new JButton("G");
	
		
		
		btnNewButton_1_15.setBackground(new Color(0, 204, 255));
		btnNewButton_1_15.setBounds(306, 550, 50, 40);
		contentPane.add(btnNewButton_1_15);
		 btnNewButton_1_15.addActionListener(this);

		
		JButton btnNewButton_1_16 = new JButton("H");
		
		btnNewButton_1_16.setBackground(new Color(0, 204, 255));
		btnNewButton_1_16.setBounds(365, 554, 59, 33);
		contentPane.add(btnNewButton_1_16);
		 btnNewButton_1_16.addActionListener(this);

		
		JButton btnNewButton_1_17 = new JButton("J");
		
		btnNewButton_1_17.setBackground(new Color(0, 204, 255));
		btnNewButton_1_17.setBounds(434, 554, 52, 35);
		contentPane.add(btnNewButton_1_17);
		 btnNewButton_1_17.addActionListener(this);

		JButton btnNewButton_1_18 = new JButton("K");
		
		
		btnNewButton_1_18.setBackground(new Color(0, 204, 255));
		btnNewButton_1_18.setBounds(496, 555, 58, 33);
		contentPane.add(btnNewButton_1_18);
		 btnNewButton_1_18.addActionListener(this);

		
		
		JButton btnNewButton_1_19 = new JButton("Z");
		btnNewButton_1_19.setBackground(new Color(0, 204, 255));
		btnNewButton_1_19.setBounds(96, 602, 55, 33);
		contentPane.add(btnNewButton_1_19);
		
		 btnNewButton_1_19.addActionListener(this);

		
		JButton btnNewButton_1_20 = new JButton("X");
		
		btnNewButton_1_20.setBackground(new Color(0, 204, 255));
		btnNewButton_1_20.setBounds(161, 602, 56, 33);
		contentPane.add(btnNewButton_1_20);
		 btnNewButton_1_20.addActionListener(this);

		
		JButton btnNewButton_1_21 = new JButton("C");
	
		btnNewButton_1_21.setBackground(new Color(0, 204, 255));
		btnNewButton_1_21.setBounds(227, 599, 51, 38);
		contentPane.add(btnNewButton_1_21);
		 btnNewButton_1_21.addActionListener(this);

		
		JButton btnNewButton_1_22 = new JButton("V");

		btnNewButton_1_22.setBackground(new Color(0, 204, 255));
		btnNewButton_1_22.setBounds(288, 602, 56, 33);
		contentPane.add(btnNewButton_1_22);
		 btnNewButton_1_22.addActionListener(this);

		
		JButton btnNewButton_1_23 = new JButton("B");
		
		
		btnNewButton_1_23.setBackground(new Color(0, 204, 255));
		btnNewButton_1_23.setBounds(354, 600, 50, 36);
		contentPane.add(btnNewButton_1_23);
		 btnNewButton_1_23.addActionListener(this);

		
		JButton btnNewButton_1_24 = new JButton("N");
		btnNewButton_1_24.setBackground(new Color(0, 204, 255));
		btnNewButton_1_24.setBounds(414, 599, 61, 38);
		contentPane.add(btnNewButton_1_24);
		 btnNewButton_1_24.addActionListener(this);

		
		JButton btnNewButton_1_25 = new JButton("M");
		btnNewButton_1_25.setBackground(new Color(0, 204, 255));
		btnNewButton_1_25.setBounds(493, 599, 61, 38);
		contentPane.add(btnNewButton_1_25);
		
		 btnNewButton_1_25.addActionListener(this);

        
		JButton btnNewButton_1 = new JButton("L");
	
		btnNewButton_1.setBackground(new Color(0, 204, 255));
		btnNewButton_1.setBounds(563, 552, 59, 35);
		contentPane.add(btnNewButton_1);
		 btnNewButton_1.addActionListener(this);
       
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(0, 153, 255));
		lblNewLabel.setBounds(236, 11, 432, 133);
		contentPane.add(lblNewLabel);
		Image img =new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_1 = new JLabel("Guess The Word ");
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("San Marino Beach", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setForeground(new Color(255, 153, 0));
		lblNewLabel_1.setBounds(76, 155, 402, 117);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Score : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(743, 56, 90, 33);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(""+score);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setForeground(new Color(102, 0, 0));
		lblNewLabel_3.setBounds(843, 56, 83, 28);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Play");
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Microsoft YaHei", Font.ITALIC, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setVisible(false);
				start();
			}
		});
		btnNewButton_2.setBounds(184, 317, 147, 54);
		contentPane.add(btnNewButton_2);
		
		
		
	    pic = new JLabel("");
		pic.setBounds(490, 279, 201, 157);		
	    imageTimer = new Timer(1000, new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	            pic.setVisible(false);
	        }
	    });
	    
	    
	    
	    try {
            tickSound = AudioSystem.getClip();
            AudioInputStream tickAudio = AudioSystem.getAudioInputStream(this.getClass().getResource("/tick.wav"));
            tickSound.open(tickAudio);

            crossSound = AudioSystem.getClip();
            AudioInputStream crossAudio = AudioSystem.getAudioInputStream(this.getClass().getResource("/cross.wav"));
            crossSound.open(crossAudio);
        } catch (Exception e) {
            e.printStackTrace();
        }
	    
	 
	}
	
	 private Clip tickSound;
	    private Clip crossSound;
	JLabel pic;
	private Timer imageTimer;

	
	List<JButton> col =new LinkedList<>();
	
	
	public void start(){
		
  if(!col.isEmpty()) {
	  
	  for(JButton tem:col)
	  {
			tem.setBackground(new Color(0, 204, 255));

	  }
	  
  }		
		
	//showing the words	    
    String wo=chose_word();
    
    wo=wo.toUpperCase();
    wo=edit_word(wo);
    ans=wo;
     word=new StringBuffer(wo);
    int l=wo.length();
   hs=new HashMap();
    
    int hidd=(l/2)-1;
    
    System.out.println(word);
    while(hidd>0)
    {
    
    	
        int ra=(int)(Math.random()*	(l-0));
        
        char ch=word.charAt(ra);
        if(ch==' ')continue;
        
        if(ch!='_'&&!hs.containsKey(ch)) 
        {
        	hs.put(ch,ra);
        	word.setCharAt(ra, '_');
        	
        }
    	
        --hidd;
    }
    
    System.out.println(hs);
    
    
    
	 game = new JLabel(word.toString());
	
	game.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
	game.setFont(new Font("Times New Roman", Font.PLAIN, 55));


	game.setBounds(170, 262, 448, 199);
	
	contentPane.add(game);
    contentPane.repaint();
    
	}
	
	
	public void actionPerformed(ActionEvent evt)
	{       
				
		if(hs!=null&&!hs.isEmpty())
		{
			pic.setVisible(false);
			JButton j=(JButton)evt.getSource();
			j.setBackground(UIManager.getColor("ToggleButton.light"));
            col.add(j);

           char click=evt.getActionCommand().charAt(0);
          
           if(hs.containsKey(click)) {
        	 tick(); 
        	  word.setCharAt(hs.get(click), click); 
        	  game.setText(word.toString());
        	  contentPane.repaint();
        	  hs.remove(click); 
           }else {
        	   cross();
        	   wronguess();
        	   
        	   
           }
           
           
           if(hs.isEmpty()) {
        	   score+=10;
        	   lblNewLabel_3.setText(""+score);
        	   contentPane.repaint();
        	   restart();
        	   win();
        	   
           }else if(wrong>5)
           {   
        	   restart();
        	   lose();
        	  
           }
		}
	
	}
	
	
	
public void tick()
{
	pic.setVisible(true);
	Image im =new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
	pic.setIcon(new ImageIcon(im));
	contentPane.add(pic);
	contentPane.repaint();
    imageTimer.restart();

    if (tickSound != null) {
        playSound(tickSound);
    }
}
public void cross()
{
	pic.setVisible(true);
	Image im =new ImageIcon(this.getClass().getResource("/cross.png")).getImage();
	pic.setIcon(new ImageIcon(im));
	contentPane.add(pic);
	contentPane.repaint();
    imageTimer.restart();
    if (crossSound != null) {
        playSound(crossSound);
    }

}
private void playSound(Clip sound) {
    try {
        if (sound.isRunning()) {
            sound.stop();
        }
        sound.setFramePosition(0);
        sound.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


//Inside the hangerMan class



	

public void win()
{
	 
	game.setVisible(false);
	JButton next = new JButton("Next");
	next.setBackground(Color.DARK_GRAY);
	next.setForeground(Color.RED);
	next.setFont(new Font("Microsoft YaHei", Font.ITALIC, 25));
    next.setBounds(184, 317, 147, 54);
  contentPane.add(next);
  contentPane.repaint();
  
	next.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			next.setVisible(false);
			start();
		}
	});
  
}
public void lose() {
	
	game.setVisible(false);
	 playagain = new JButton("Play Again");
	playagain.setBackground(Color.DARK_GRAY);
	playagain.setForeground(Color.RED);
	playagain.setFont(new Font("Microsoft YaHei", Font.ITALIC, 25));
    playagain.setBounds(184, 317, 190, 70);
  contentPane.add(playagain);
  contentPane.repaint();
  
	playagain.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			playagain.setVisible(false);
			start();
		}
	});
	
}


public void restart()
{
wrong=0;
((HangingAnimationPanel) panel).setWrongGuesses(wrong);
panel.repaint();

}



	
	
public String chose_word()
{
	data obj =new data();
	
	int total_words=obj.words.length;
	
    int ra=(int)(Math.random()*	(total_words-0));
    
	return obj.words[ra];
}

public String edit_word(String str)
{
  String ans="";
  for(int i=0;i<str.length()-1;++i)
  {   
	  char tem=str.charAt(i);
	  ans+=tem+" ";
	  
  }
  ans+=str.charAt(str.length()-1);
	
return ans;}
	
	
	
	
	
		public void  wronguess() {
			wrong++;
             ((HangingAnimationPanel) panel).setWrongGuesses(wrong);
             panel.repaint();
			
		}

	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}


class HangingAnimationPanel extends JPanel {
    private int wrongGuesses;
    
    

    public HangingAnimationPanel (int wr) {
        this.wrongGuesses = wr;
    }

    public void setWrongGuesses(int wrongGuesses) {
        this.wrongGuesses = wrongGuesses;
        repaint(); // Redraw the animation when the number of wrong guesses changes
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawHanging(g, wrongGuesses);
    }

    private void drawHanging(Graphics g, int wrongGuesses) {
        Graphics2D g2d = (Graphics2D) g;

        // Draw the scaffold
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(100, 400, 300, 400);
        g2d.drawLine(200, 400, 200, 100);
        g2d.drawLine(100, 100, 200, 100);

        if (wrongGuesses >= 1) {
        	
            // Draw the head
        	g2d.setColor(Color.black);
            g2d.fillOval(175, 125, 50, 50);
        }

        if (wrongGuesses >= 2) {
            // Draw the body
            g2d.drawLine(200, 175, 200, 300);
        }

        if (wrongGuesses >= 3) {
            // Draw the left arm
            g2d.drawLine(200, 200, 160, 250);
        }

        if (wrongGuesses >= 4) {
            // Draw the right arm
            g2d.drawLine(200, 200, 240, 250);
        }

        if (wrongGuesses >= 5) {
            // Draw the left leg
            g2d.drawLine(200, 300, 160, 350);
        }

        if (wrongGuesses >= 6) {
            // Draw the right leg
            g2d.drawLine(200, 300, 240, 350);
        }
    }

    
}

