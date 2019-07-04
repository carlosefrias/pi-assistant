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
    /**
     * Default Constructor
     * @param title Title of the Frame
     */
    public MyFrame(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 250);
        setResizable(false);
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPane.add(Box.createVerticalGlue());
        addNewLinkButton(Constants.PIRACY_URL, buttonPane);
        addNewLinkButton(Constants.SPORTS_URL, buttonPane);
        addNewLinkButton(Constants.YOUTUBE_URL, buttonPane);
        addNewLinkButton(Constants.PLURALSIGHT_URL, buttonPane);
        addNewLinkButton(Constants.GOOGLE_URL, buttonPane);
        Container contentPane = getContentPane();
        contentPane.add(buttonPane, BorderLayout.CENTER);
    }
    /**
     * Adds a button for the specified url link
     * @param buttonLabel Text that appears on the button
     * @param url Url link
     * @param panel Panel where the button is addded to
     */
    private void addNewLinkButton(MyUrl mUrl, JPanel panel){
        JButton button = new JButton(mUrl.getLabel());
        BrowserManager bm = BrowserManager.getInstance();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bm.openUrl(mUrl.getUrl());
            }
        });
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
    }
}
