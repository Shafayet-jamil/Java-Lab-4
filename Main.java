import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Now we find the area of the traingle.");
//        System.out.println("Enter the height of the traingle: ");
//        Scanner input = new Scanner(System.in);
//        int high = input.nextInt();
//        System.out.println("Enter the base of the traingle: ");
//        int base = input.nextInt();
//        Traingle one = new Traingle(high, base);
//        one.Area(high, base);
        //here is the starting of the grade calculatior
        System.out.println("The result of the student 'Shafayet Jamil' is given below: ");
        int physics = 81;
        int dld = 82;
        int java = 87;
        System.out.println("Marks of three subjects: \n" + "Physics : " + physics + "\nDLD: " + dld + "\nJAVA: "+java);
        Grades studentOne = new Grades("Shafayet Jamil", 220305055,physics,dld, java);
        studentOne.gradeCalc();

    }
}