public class Project{
    private String projectId;
    private String name;
    private String description;
    private double budget;
    
    public Project(String projectId, String name, String description, double budget) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.budget = budget;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBudget() {
        return budget;
    }
}