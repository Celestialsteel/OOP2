// Correct code according to Liskov Substitution Principle
public class ReportDownloader {
    public String download() {
        return "Downloading report...";
    }
}

// Subclasses
public class PdfDownloader extends ReportDownloader {
    @Override
    public String download() {
        return "Downloading PDF report...";
    }
}

public class ExcelDownloader extends ReportDownloader {
    @Override
    public String download() {
        return "Downloading Excel report...";
    }
}

// Usage
public class DownloadService {
    public void startDownload(ReportDownloader downloader) {
        System.out.println(downloader.download());
    }
}
// Example usage
public class Main {
    public static void main(String[] args) {
        DownloadService service = new DownloadService();
        service.startDownload(new PdfDownloader());    // Works if you use PdfDownloader in place of ReportDownloader
        service.startDownload(new ExcelDownloader());  // Works if you use ExcelDownloader in place of ReportDownloader
       // service.startDownload(new BrokenDownloader()); //   crashes because of the exception in BrokenDownloader

    }
}



/*Erroneous code that violates Liskov Substitution Principle

 * public class BrokenDownloader extends ReportDownloader {
    @Override
    public String download() {
        throw new UnsupportedOperationException("Downloads not supported.");
    }
        }
    When one tries to use BrokenDownloader in place of ReportDownloader, it will throw an exception, violating the Liskov Substitution Principle.

 */