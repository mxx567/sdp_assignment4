package classes;

public class DownloaderFacade {
    private final UrlValidator urlValidator = new UrlValidator();
    private final HttpDownloader httpDownloader = new HttpDownloader();
    private final FileVerifier fileVerifier = new FileVerifier();
    private final FileStorage fileStorage = new FileStorage();

    File downloadedFile;

    public void download(String url, String path){
        if(!urlValidator.isValid(url)){
            throw new IllegalArgumentException("Invalid URL!");
        }

        System.out.println(httpDownloader.OpenConnection(url));
        System.out.println(httpDownloader.ServerResponse(url));

        downloadedFile = httpDownloader.DownloadFile(url);

        fileVerifier.verify(downloadedFile);
        fileStorage.saveFile(downloadedFile,path);
    }
}
