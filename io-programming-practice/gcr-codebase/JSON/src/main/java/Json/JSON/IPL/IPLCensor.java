package Json.JSON.IPL;

public class IPLCensor {
    public static void main(String[] args) throws Exception {

        CSVCensor.processCSV("src/main/java/samplefiles/IPL.csv","src/main/java/samplefiles/IPLoutput.csv");

        JSONCensor.processJSON("src/main/java/samplefiles/IPL.json" , "src/main/java/samplefiles/IPLOutput.json");

        System.out.println("Censorship completed successfully!");
    }
}
