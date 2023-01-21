public class Student {
    String name;

    int id;
    Student(){
        name="helina";
         id=247;
    }
    public static void main(String[] args) {
        Student myobj = new Student();
        System.out.println("Name: " + myObj.name);
        System.out.println("id: " + myObj.id);
    }
}
