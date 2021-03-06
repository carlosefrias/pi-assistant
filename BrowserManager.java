
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class BrowserManager{

    private static BrowserManager instance = null; 
    
    /**
     * Default constructor
     */
    private BrowserManager() 
    {
    } 
    /**
     * Retrives the singleton instance of this class
     * @return singleton instance
     */
    public static BrowserManager getInstance() 
    { 
        if (instance == null) 
            instance = new BrowserManager();  
        return instance; 
    }

    /**
     * Opens a specified web page in the default browser
     * @param url Url to be opened
     */
    public void openUrl(String url){
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
