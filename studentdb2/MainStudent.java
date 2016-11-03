package studentdb2;

import java.io.*;
import java.util.*;

public class MainStudent {
 
 List<Student> myList = new ArrayList<Student>();
 Student student = null;
 FileInputStream fis = null;
 ObjectInputStream ois = null;
 FileOutputStream fos = null;
 ObjectOutputStream oos = null;
 
 public static void main(String[] args) throws IOException { 
  MainStudent stud = new MainStudent();
  stud.test();
  
 }
 
 @SuppressWarnings({ "unchecked", "resource" })
 public void test() throws IOException{
  
   try {
      fis = new FileInputStream("output.txt");
      ois = new ObjectInputStream(fis);
      
      myList = (List<Student>) ois.readObject();
       
      ois.close();

   } catch (ClassNotFoundException ef) {
      ef.printStackTrace();
  } finally {
    try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        int choice;
        boolean b = false;
     do{
     System.out.println("\t\tMenu\n\t1. Register Student\n\t2. Search Student\n\t3. Delete Student\n\t4. Save Student\n\t5. Exit\n");
     choice = new Scanner(System.in).nextInt();
   
     switch (choice) {
         
     case 1: {
                     
            System.out.println("Student Number:");
            String studentNumber = new Scanner(System.in).nextLine();
            check(myList, studentNumber);
            
            System.out.println("First Name:");
            String firstName = new Scanner(System.in).nextLine();
            
            System.out.println("Middle Initial:");
            char middleInitial = new Scanner(System.in).next(".").charAt(0);
            
            System.out.println("Last Name:");
            String lastName = new Scanner(System.in).nextLine();
            
            System.out.println("Degree Program:");
            String course = new Scanner(System.in).nextLine();
            
            System.out.println("Year Level:");
            int yearLevel = new Scanner(System.in).nextInt();
 
            System.out.println("Crush Name: ");
            String crushName = new Scanner(System.in).nextLine();
            
            System.out.println("Course Code: ");
            String courseCode = new Scanner(System.in).nextLine();
            
            System.out.println("Course Description: ");
            String courseDescription = new Scanner(System.in).nextLine();
            
            student = new Student(studentNumber, firstName, middleInitial, lastName, course, yearLevel, crushName, new Course(courseCode, courseDescription));
            myList.add(student);
            System.out.println("\nSTUDENT ADDED!");
            break;
          }
          
          case 2: {
            System.out.println("Search Student:");
            String searchStudentNumber = new Scanner(System.in).nextLine();
            
             for(Student s: myList) {
                    if(s.getStudentNumber().equals(searchStudentNumber)){
                     System.out.println("Student Number: " + s.getStudentNumber() + "\n"
                          + "Name: " + s.getLastName() + ", " + s.getFirstName() + " " + s.getMiddleInitial() + "." + "\n"
                          + "Program: " + s.getCourse() + "\n"
                          + "Year Level: " + s.getYearLevel() + "\n"
                          + "Crush Name: " + s.getCrushName() + "\n"
                          + "CourseCode: " + s.getFaveSubject());
                     b = true;
                     break;
                    }
                }
             if(b == false){
              System.out.println("Student does not exist!\n");
             }
            
             break; 
          }
          
          case 3: {
            System.out.println("Delete Student:");
            String deleteStudent = new Scanner(System.in).nextLine();
            for(Student s: myList) {
                   if(s.getStudentNumber().equals(deleteStudent)){
                    myList.remove(s);
                    System.out.println("\nStudent " + s.getStudentNumber() + " deleted!\n");
                    b = true;
                    break;
                   }
               } 
            if(b == false){
             System.out.println("Student cannot be found!\n");
            }
            break;
          }
          
          case 4: {
           try {
                  fos = new FileOutputStream("output.txt");
                  oos = new ObjectOutputStream(fos);
                  oos.writeObject(myList);
                  oos.close();
                  System.out.println("SAVED!");
              } catch (IOException e) {
                  e.printStackTrace();
              } finally {
                  try {
                      fos.close();
                  } catch (IOException ex) {
                      ex.printStackTrace();
                  }
              }
           break;
          }         
              
          case 5: {
            System.out.println("Exit!");
            break;
          }
          
          default:
           throw new IllegalArgumentException("Invalid input!\n");
    }
   }while(choice != 5); 
  }
 
  private static void check(List<Student> myList, String studentNumber){
   for (Student s: myList){
    if(s.getStudentNumber().equals(studentNumber)){
     throw new IllegalArgumentException("Student already exist!");
    }
   }
  }
}
