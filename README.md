

Run `Main.java` to download a file using the downloader facade.
A small Java example of the Facade design pattern for downloading files.

## How it works

`DownloaderFacade` provides one simple `download()` method while coordinating:

- `UrlValidator` — checks that the URL is valid.
- `HttpDownloader` — opens a connection and creates the downloaded file.
- `FileVerifier` — verifies that the file is not empty.
- `FileStorage` — saves the file to the requested path.

The current downloader uses placeholder data rather than making a real HTTP request.

## Run

From the `src` directory:

```bash
javac Main.java classes/*.java
java Main
```

The example in `Main.java` downloads `report.pdf` to `D:/Downloads`.
