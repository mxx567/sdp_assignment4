import classes.DownloaderFacade;

public class Main {
    public static void main(String[] args){
        DownloaderFacade facade = new DownloaderFacade();
        facade.download("https://example.com/report.pdf", "D:/Downloads");
    }
}