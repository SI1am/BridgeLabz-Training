package implementingInterface;


interface ReportExporter {
    void exportCSV();
    default void exportToJSON() {
        System.out.println("Exported report to JSON format");
    }
}

class SalesReportExporter implements ReportExporter {
    public void exportCSV() {
        System.out.println("Exported report to CSV format");
    }
}


public class Reports {
	public static void main(String[] args) {
		
		ReportExporter exporter = new SalesReportExporter();
		exporter.exportCSV();
		exporter.exportToJSON(); 
	}

}
