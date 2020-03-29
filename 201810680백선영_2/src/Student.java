import java.util.Comparator;
public class Student implements Comparable<Student> {
   public static final Comparator<Student> WITH_NAME = new WithName();
   public static final Comparator<Student> WITH_DEPT = new WithDept();
   public static final Comparator<Student> WITH_GRADE = new WithGrade();
   
    int ID;
   String name;
   String dept;
    Integer grade;
   
   public Student(int IDIn, String nameIn, String deptIn, int gradeIn) {
      ID = IDIn;
      name = nameIn;
      dept = deptIn;
      grade = gradeIn;
     
      
   }
   public int getID() {return ID;}
   public String getname() {return nameIn;}
   public String getdept() {return deptIn;}
   public int getgrade() {return gradeIn;}
   
   public static class WithName implements Comparator<Student> {
	   public int compare(Student s1, Student s2) {
		   return s1.name.compareTo(s2.name);
	   }
   }
   public static class Withdept implements Comparator<Student> {
	   public int compare(Student s1, Student s2) {
		   return s1.dept.compareTo(s2.dept);
	   }
   }
   public static class Withgrade implements Comparator<Student> {
	   public int compare(Student s1, Student s2) {
		   return s1.grade-s2.grade);
	   }
   }
  
	   public int compareTo(Student s1) {
		   return this.ID - s1.ID;
	   }
   }
	   }
   }