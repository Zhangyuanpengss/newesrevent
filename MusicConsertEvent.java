public class MusicConsertEvent{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double MusicConsertEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContack;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCost calculateEventCostObject;

    public MusicConsertEvent(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays){
       
        this.merchandiseCost=merchandiseCost;
  
    }

    public void setmerchandiseCost(double cost){
        this.merchandiseCost=cost;

    }

    public double getmerchandiseCost(){
        return merchandiseCost;
    }

    
    public void calculateEventCost(){
        MusicConsertEventCost=calculateEventCostObject.calculateEventCost() + 
        (calculateEventCostObject.calculateEventCost() * 0.3);
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



    public String  toString(){
        return "Conference Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:"+getEventName()+"\n"+
        "Event Location:"+geteventLocation()+"\n"+
        "Point of Contact:"+geteventPointOfContact()+"\n"+
        "Total participants:"+gettotalParticipants()+"\n"+
        "Total Conference Cost:"+getmerchandiseCost()+"\n";
    }
     
        

    
}
