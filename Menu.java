import java.util.Scanner;

public class Menu 
{
    Scanner scanner = new Scanner (System.in);
    
    public void show ()
    {
        System.out.println();
        System.out.println("=== MENIU ===");
        System.out.println("1. Registruoti nauja kursa.");
        System.out.println("2. Perziureti visus kursus.");
        System.out.println("3. Registruoti nauja studenta.");
        System.out.println("4. Perziureti studentu sarasa.");
        System.out.println("5. Ivesti nauja pazyma.");
        System.out.println("0. Iseiti");
    }
    
    public int getItem ()
    {
        return 0;
    }
    
    public void start ()
    {
        show ();
    }

    private void doAddCourse() throws Exception
    {
        System.out.println("Registruoti nauja kursa.");
    }

    private void doShowCourses () throws Exception 
    {
        System.out.println("Perziureti visus kursus.");
    }

    private void doAddStudent() throws Exception
    {
        System.out.println("Registruoti nauja studenta.");
    }

    private void doShowStudents() throws Exception 
    {
        System.out.println("Perziureti studentu sarasa.");
    }

    private void doAddPoint() 
    {
        System.out.println("Ivesti nauja pazyma.");
    }
    
    private String getErrorText (String error)
    {
        switch (error)
        {
            case "course not found"  : return "Kursas nerastas"; 
            case "student not found" : return "Studentas nerastas";
            case "invalid point"     : return "Pazyma turi buti nuo 1 iki 10";
            case "ok"                : return "Pazyma uzregistruota";
            default                  : return "Nepazistama klaida";
        }
    }
    

}
