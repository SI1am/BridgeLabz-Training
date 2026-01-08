import java.util.*;

class InteractionRecord{

    private String contactNumber;
    private String details;
    private long recordedTime;

    InteractionRecord(String contactNumber, String details){
        this.contactNumber = contactNumber;
        this.details = details;
        this.recordedTime = new Date().getTime();
    }

    public String getContact(){
        return contactNumber;
    }

    public String getDetails(){
        return details;
    }

    public long getTimestamp(){
        return recordedTime;
    }

    @Override
    public String toString(){
        return "InteractionRecord [Contact=" + contactNumber +", Details="+ details+", Timestamp=" + new Date(recordedTime) + "]";
    }
}

public class SupportInteractionHandler{
    private static ArrayList<InteractionRecord> interactionRecords = new ArrayList<>();

    public void recordInteraction(InteractionRecord record){
        interactionRecords.add(record);
    }

    public ArrayList<InteractionRecord> filterByTimestamp(long time){
        ArrayList<InteractionRecord> result = new ArrayList<>();
        for (InteractionRecord record : interactionRecords) {
            if (record.getTimestamp() >= time) {
                result.add(record);
            }
        }
        return result;
    }

    public ArrayList<InteractionRecord> findByTerm(String term){

        ArrayList<InteractionRecord> result = new ArrayList<>();

        for (InteractionRecord record : interactionRecords) {

            if (record.getDetails().toLowerCase().contains(term.toLowerCase())){
                result.add(record);

            }
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException{

        SupportInteractionHandler handler = new SupportInteractionHandler();

        handler.recordInteraction(new InteractionRecord("9856487595", "Hi call me back"));
        
        
        handler.recordInteraction(new InteractionRecord("9123456789", "Issue with payment"));

        handler.recordInteraction(new InteractionRecord("9000000000", "Call disconnected"));

        System.out.println("Find by term 'call':");

        for (InteractionRecord record : handler.findByTerm("call")) {

            System.out.println(record);
        }
    }
}
