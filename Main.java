public class Main {
    public static void main(String[] args) throws Exception{
        ConferenceEvent ConferenceEvent=new ConferenceEvent(null, null, null, null, 0, 0, 0);
        ConferenceEvent.calculateEventCost();
        System.out.println(ConferenceEvent);
    }
}
