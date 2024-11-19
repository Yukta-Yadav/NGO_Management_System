import java.util.ArrayList;
import java.util.List;

public class NGO{
    private String ngoId;
    private String name;
    private String description;
    private List<Project> projects;
    private List<Donation> donations;
    private List<Event> events;

    public NGO(String ngoId,String name,String description){
        this.ngoId=ngoId;
        this.name=name;
        this.description=description;
        this.projects=new ArrayList<>();
        this.donations=new ArrayList<>();
        this.events=new ArrayList<>();
    }

    public String getNgoId(){
        return ngoId;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void addProject(Project project){
        projects.add(project);
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void addDonation(Donation donation) {
        donations.add(donation);
    }
    public List<Donation> getDonations(){
        return donations;
    }
    public List<Event> getEvents(){
        return events;
    }
    public void listProjects(){
        System.out.println("\nProjects under "+name+":");
        for(Project project: projects){
            System.out.println("- "+project.getProjectId()+": "+project.getName()+" ("+project.getDescription()+")");
        }
    }
    public void listDonations() {
        System.out.println("\nDonations for " + name + ":");
        for (Donation donation : donations) {
            System.out.println("- " + donation.getDonorName() + ": $" + donation.getAmount());
        }
    }
    public void listEvents() {
        System.out.println("\nEvents for " + name + ":");
        for (Event event : events) {
            System.out.println("- " + event.getEventId() + ": " + event.getName() + " (" + event.getDate() + ")");
        }
    } 
}