public class ConferenceEvent{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContack;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCost calculateEventCostObject;

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost=breakfastCost;
    }

    public void setLunchCost(double lunchCost){
        this.lunchCost=lunchCost;
    }

    public void setDinnerCost(double dinnerCost){
        this.dinnerCost=dinnerCost;
    }

    public void setconferenceEventCost(){
        this.conferenceEventCost=conferenceEventCost;
    }

    public double getBreakfastCost(){
        return breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }

    public double getConferenceEventCost(){
        return conferenceEventCost;
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
    public double geteventCost() {
        return  eventCost;
    }
    public void seteventCost(double eventCost){
        this.eventCost = eventCost;
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



    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost){
        
        this.breakfastCost=breakfastCost;
        this.lunchCost=lunchCost;
        this.dinnerCost=dinnerCost;
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventPointOfContack=pointOfContack;
        this.eventCost=eventCost;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
    }

    
    public void calculateEventCost(){
        eventCost = calculateEventCostObject.calculateEventCost() + 
(calculateEventCostObject.calculateEventCost() * 0.3);
    }

    public String  toString(){
        return "Conference Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:"+getEventName()+"\n"+
        "Event Location:"+geteventLocation()+"\n"+
        "Point of Contact:"+geteventPointOfContact()+"\n"+
        "Total participants:"+gettotalParticipants()+"\n"+
        "Total Conference Cost:"+getConferenceEventCost()+"\n";
    }
}
