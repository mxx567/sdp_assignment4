package classes;

public class HttpDownloader {
    public String OpenConnection(String url){
        return "Connection is opened for " + url;
    }

    public String ServerResponse(String url){
        return "Server Responds : true " + url;
    }

    public File DownloadFile(String url){
        String fileName = url.substring(url.lastIndexOf('/') + 1);

        if(fileName.isBlank()){
            fileName = "download.bin";
        }

        String data = "Placeholder data at the" + fileName;

        return new File(fileName,data);
    }
}
