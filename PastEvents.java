import java.time.LocalDate;

public class PastEvents{
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost=10000;
    private String paymentDetails=eventCost+paymentStatus+requiresExtension;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContack;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCost calculateEventCostObject;






    public PastEvents(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays){
        

    }





    public String toString(){
        return paymentDetails;
    }
    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID){
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventID;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String geteventLocation() {
        return eventLocation;
    }
    public void seteventLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }
    public String geteventPointOfContact() {
        return  eventPointOfContack;
    }
    public void seteventPointOfContact(String eventPointOfContact){
        this.eventPointOfContack = eventPointOfContact;
    }
    public int gettotalParticipants() {
        return  totalParticipants;
    }
    public void settotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }
    public int gettotalEventDays() {
        return  totalEventDays;
    }
    public void setotalEventDays(int totalEventDays){
        this.totalEventDays =totalEventDays;
    }
}
