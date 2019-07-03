import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    private static final long serialVersionUID = 1L;
    private String piracyUrl = "https://v1.mrpiracy.xyz/",
                    youtubeUrl = "https://www.youtube.com/",
                    sportsUrl = "http://idimsports.eu",
                    googleUrl = "https://www.google.pt";

    public MyFrame(String title){
        super(title);

        BrowserManager bm = BrowserManager.getInstance();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 180);
        setResizable(false);
        JButton futebolButton = new JButton("Futebol");
        JButton filmesButton = new JButton("Filmes");
        JButton youtubeButton = new JButton("Youtube");
        JButton googleButton = new JButton("Google");

        futebolButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bm.openUrl(sportsUrl);
            }
        });
        filmesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bm.openUrl(piracyUrl);
            }
        });
        youtubeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bm.openUrl(youtubeUrl);
            }
        });
        googleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bm.openUrl(googleUrl);
            }
        });
        
        //Lay out the buttons from left to right.
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPane.add(Box.createVerticalGlue());
        buttonPane.add(futebolButton);
        buttonPane.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPane.add(filmesButton);
        buttonPane.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPane.add(youtubeButton);
        buttonPane.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPane.add(googleButton);

        Container contentPane = getContentPane();
        contentPane.add(buttonPane, BorderLayout.CENTER);
    }
}
