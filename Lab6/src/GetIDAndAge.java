import java.util.*;

public class GetIDAndAge {
  static final int HIGHID = 999;
  static final int HIGHAGE = 119;
  static final int LOW = 0;

  public static void main(String[] args) {
    int id = 0;
    int age = 0;
    boolean bSTOP = false;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input zero for ID and Age to quit.");
    while (!bSTOP) {
      // your try block:
      try {
        // display message using showStatus() to input ID in range 0..999
        // use 'keyboard' scanner to get int value for ID
        showStatus("Please input ID (0..999)");
        id = Integer.parseInt(keyboard.next());
        // display message using showStatus() to input Age in range 0..119
        // use 'keyboard' scanner to get int value for Age3
        showStatus("Please input Age (0..119)");
        age = Integer.parseInt(keyboard.next());
        // call 'check' with ID and Age and set "bSTOP" as value back from 'check'
        bSTOP = check(id, age);
        // catch block for 'DataEntryException'
      } catch (DataEntryException r) {
        System.out.println(r.getMessage());
      // catch block for 'InputMismatchException'
      } catch (InputMismatchException s) {
        new InputMismatchException();
        System.out.println(s);
        // }
      }
    }
    // close Scanner
    keyboard.close();
    // dispay thank you message
    System.out.println("Thank You");
  }

  public static boolean check(int idNum, int ageNum) throws DataEntryException {

    // code the 'if' testing for idNum and ageNum
    // throw DataEntryException with correct parameters
    // when both idNum and ageNum are zero, return true

    if (idNum > 999 || idNum < 0) {
      throw new DataEntryException("Invalid ID Input: ", idNum);

    }

    if( ageNum < 0 || ageNum > 119){
      throw new DataEntryException("Invalid Age Input: ", ageNum);
    }

    if (idNum == 0 && ageNum == 0) {
      return true;
    }

    return false;
  }

  public static void showStatus(String msg) {
    System.out.println(msg);
  }
}
