package OOPs.Student;

public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++ )
        {
            Student student = new Student("592300"+i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        default -> "Anonymous";
                    },
            "05/11/1985", "Java Masterclass");
            System.out.println(student);
        }
        Student pojoStudent = new Student("5923006", "Ann"
        , "05/11/1985", "Java MasterClass");
        LPAStudent recordStudent= new LPAStudent("5923007",
                "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+" ,Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList()+" ,Java OCP Exam 829");


        System.out.println(pojoStudent.getName() + " is taking "+
                pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking "+
                recordStudent.classList());


    }
}
