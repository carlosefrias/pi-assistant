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
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

import java.io.IOException;

public class MainWindow{

    private static String piracyUrl = "https://v1.mrpiracy.xyz/",
                    youtubeUrl = "https://www.youtube.com/",
                    sportsUrl = "http://idimsports.eu",
                    googleUrl = "https://www.google.pt";

    public static void main(String[] args){
        JFrame frame = new JFrame("Assistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 180);
        frame.setResizable(false);
        JButton futebolButton = new JButton("Futebol");
        JButton filmesButton = new JButton("Filmes");
        JButton youtubeButton = new JButton("Youtube");
        JButton googleButton = new JButton("Google");

        futebolButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openUrl(sportsUrl);
            }
        });
        filmesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openUrl(piracyUrl);
            }
        });
        youtubeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openUrl(youtubeUrl);
            }
        });
        googleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openUrl(googleUrl);
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

        Container contentPane = frame.getContentPane();
        contentPane.add(buttonPane, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }

    private static void openUrl(String url){
        System.out.println("A abrir site " + url);
        //open url
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try{
                Desktop.getDesktop().browse(new URI(url));
            }catch(URISyntaxException | IOException e){
                System.out.println("Erro ao abrir " + url);
                e.printStackTrace();
            }
        }
    }
}
