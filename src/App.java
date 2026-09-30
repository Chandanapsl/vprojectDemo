import university.college.computers.*;
import university.college.ece.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        Books b = new Books();
       s.setNo(123);
       b.setNo(567);
        System.out.println("This is student number "+ s.getNo());
        System.out.println("This is book number "+ b.getNo());
       
    }
}
