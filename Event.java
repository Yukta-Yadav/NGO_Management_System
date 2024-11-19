public class Event {
    private String eventId;
    private String name;
    private String date;

    public Event(String eventId, String name, String date) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
    }

    public String getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}