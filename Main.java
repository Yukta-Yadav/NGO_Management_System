import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        NGOSystem ngoSystem=new NGOSystem();
        NGO ngo1=new NGO("NGO001","Hope Foundation","Helping underprivileged children");
        NGO ngo2=new NGO("NGO002","Green Earth","Promoting environmental sustainability");

        Project p1=new Project("PR001","Child Education Program","Educational support for kids",5000);
        Project p2=new Project("PR002","Tree Plantation Drive","Planting trees in urban areas",3000);

        ngo1.addProject(p1);
        ngo2.addProject(p2);

        ngoSystem.addNGO(ngo1);
        ngoSystem.addNGO(ngo2);

        ngoSystem.menu();
    }
}

