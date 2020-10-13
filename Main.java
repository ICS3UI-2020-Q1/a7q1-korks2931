import java.util.Scanner; 
/**
 * This program will take an exam percentage as a paramater 
 * @author Sevde 
 */
public class Main {
 // A method to see which letter grade the user has given the average number grades
  public static void gradeLetters( int examGrade) {
    // if statements to see if they are bigger or smaller than a number , printing out a letter 
    if ( examGrade >= 80){
      System.out.print( "- A");

    }
    if ( examGrade >= 70 && examGrade <= 79){
      System.out.print( "- B");

    }
     else if (examGrade >= 60 && examGrade <= 69){
      System.out.print("- C");
    }
    if (examGrade > 50 && examGrade <= 59){
      System.out.print( "- D");

    }
     else if ( examGrade <= 50){
      System.out.print ("- F");
    }

  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner (System.in);
    // prompt the user for the average grade
    int grades = input.nextInt();
   // do the method
    gradeLetters(grades);

   
    
  }
}
