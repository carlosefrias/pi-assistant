public class MyUrl{
    public String url, label;
    /**
     * Defaut constructor
     * @param url url string
     * @param label button label
     */
    public MyUrl(String url, String label){
        this.url = url;
        this.label = label;
    }
    /**
     * Getter for the url string
     * @return url string
     */
    public String getUrl(){return url;}
    /**
     * Getter for the label (text for the button)
     * @return label
     */
    public String getLabel(){return label;}
}