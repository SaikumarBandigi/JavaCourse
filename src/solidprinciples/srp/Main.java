package solidprinciples.srp;

public class Main {
}

// Correct example following SRP
class Report {
    public void generateReport() {
        // Code to generate a report
    }
}

class ReportSaver {
    public void saveToFile(Report report) {
        // Code to save the report to a file
    }
}

class EmailSender {
    public void sendByEmail(Report report) {
        // Code to send the report by email
    }
}
