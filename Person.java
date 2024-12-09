public class Person
{
    private String Fname;
    private String Lname;
    private int personAge;
    private int SSN;


    public void setfname(String f){
        Fname = f;
    }
    public void setlname(String l){
        Lname = l;
    }
    public void setage(int age){
        personAge = age;
    }
    public void setSSN(int s){
        SSN = s;
    }
    public String toString(){
        return "SSN: " + SSN + "\n\tName: " + Fname + " " + Lname + "\n\tAge: " + personAge;
    }
}
