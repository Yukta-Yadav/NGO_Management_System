import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NGOSystem{
    private List<NGO> ngos;
    private List<Volunteer> volunteers;

    public NGOSystem() {
        ngos = new ArrayList<>();
        volunteers = new ArrayList<>();
    }

    public void addNGO(NGO ngo) {
        ngos.add(ngo);
    }

    public void addVolunteer(Volunteer volunteer) {
        volunteers.add(volunteer);
    }

    public void menu(){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("\n=============== Welcome to Sunshine ===============");
            System.out.println(">>>>>> Kindly choose an option <<<<<< ");
            System.out.println("1. View All NGOs");
            System.out.println("2. View NGO Projects");
            System.out.println("3. Add Volunteer");
            System.out.println("4. Record Donation");
            System.out.println("5. Add Event");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice=s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nList of NGOs:");
                    for (NGO ngo : ngos) {
                        System.out.println(ngo.getNgoId() + " - " + ngo.getName() + " (" + ngo.getDescription() + ")");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter NGO ID to view projects: ");
                    String ngoId = s.nextLine();
                    NGO selectedNgo = null;

                    for (NGO ngo : ngos) {
                        if (ngo.getNgoId().equalsIgnoreCase(ngoId)) {
                            selectedNgo = ngo;
                            break;
                        }
                    }

                    if (selectedNgo != null) {
                        selectedNgo.listProjects();
                    } else {
                        System.out.println("NGO not found.");
                    }
                    break;

                case 3:
                    System.out.print("\nEnter volunteer name: ");
                    String volunteerName = s.nextLine();
                    Volunteer newVolunteer = new Volunteer("VOL" + (volunteers.size() + 1), volunteerName);
                    addVolunteer(newVolunteer);
                    System.out.println("Volunteer added successfully with ID: " + newVolunteer.getVolunteerId());
                    break;

                case 4:
                    System.out.print("\nEnter NGO ID to record donation: ");
                    String donationNgoId = s.nextLine();
                    selectedNgo = null;

                    for (NGO ngo : ngos) {
                        if (ngo.getNgoId().equalsIgnoreCase(donationNgoId)) {
                            selectedNgo = ngo;
                            break;
                        }
                    }

                    if (selectedNgo != null) {
                        System.out.print("Enter donor name: ");
                        String donorName = s.nextLine();
                        System.out.print("Enter donation amount: ");
                        double amount = s.nextDouble();
                        s.nextLine(); 

                        Donation donation = new Donation(donorName, amount);
                        selectedNgo.addDonation(donation);
                        System.out.println("Donation recorded successfully!");
                    } else {
                        System.out.println("NGO not found.");
                    }
                    break;

                case 5:
                    System.out.print("\nEnter NGO ID to add event: ");
                    String eventNgoId = s.nextLine();
                    selectedNgo = null;

                    for (NGO ngo : ngos) {
                        if (ngo.getNgoId().equalsIgnoreCase(eventNgoId)) {
                            selectedNgo = ngo;
                            break;
                        }
                    }

                    if (selectedNgo != null) {
                        System.out.print("Enter event name: ");
                        String eventName = s.nextLine();
                        System.out.print("Enter event date (YYYY-MM-DD): ");
                        String date = s.nextLine();

                        Event event = new Event("EVT" + (selectedNgo.getEvents().size() + 1), eventName, date);
                        selectedNgo.addEvent(event);
                        System.out.println("Event added successfully!");
                    } else {
                        System.out.println("NGO not found.");
                    }
                    break;

                case 6:
                    System.out.println("\nThank you for using the NGO Management System!");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}