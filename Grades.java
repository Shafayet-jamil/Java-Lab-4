//here i was given to the  name, roll and marks of 3 subjects,
// I need to find the grades of teh student using the oop

public class Grades {
   private String name;
   private int roll;
   private double marks1, marks2, marks3;

   Grades(String name, int roll, double marks1, double marks2, double marks3) {
       this.name = name;
       this.roll = roll;
       this.marks1 = marks1;
       this.marks2 = marks2;
       this.marks3 = marks3;
   }
   public String getName() {
       return name;
   }
   public int getRoll() {
       return roll;
   }
   public double getMarks1() {
       return marks1;
   }
   public double getMarks2() {
       return marks2;
   }
   public double getMarks3() {
       return marks3;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void setRoll(int roll) {
       this.roll = roll;
   }
   public void setMarks1(double marks1) {
       this.marks1 = marks1;
   }
   public void setMarks2(double marks2) {
       this.marks2 = marks2;
   }
   public void setMarks3(double marks3) {
       this.marks3 = marks3;
   }
   //calculating the grades of all individual subjects and the overall cgpa
   public void gradeCalc(){
//       double grade1=0, grade2=0, grade3 =0;
       double avarage = (marks1+marks2+marks3)/3;
       double totalgrade = 0;
           if(avarage >= 80){
               totalgrade = 4.00;
           }

           else if(avarage >= 70){
              totalgrade = 3.00;
           }

           else if(avarage >= 60){
              totalgrade = 2.00;
           }

           else if(avarage >= 40){
               totalgrade = 1.00;
           }

           else if(avarage < 40){
              totalgrade = 1.00;
           }



//       System.out.println("Grades of total 3 subjects is: " + grade1 + " " + grade2 + " " + grade3);
       System.out.println("Total cgpa of the 3 subject is " + totalgrade);
   }


}
