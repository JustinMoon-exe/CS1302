//Justin Moonjeli
//GSU CS 1302


import java.util.*;
public class TimesAndInstructors {
	public static void main(String[] args) {
		
		
		// Create scanner object to get input from user
		Scanner input = new Scanner(System.in); 
		
	    
	    String[][] classes = {{"CS1302", "Course: CS1302 \r\nTime: Tue 11AM \r\nInstructor: Sadasivuni \r\n"},
	    					  {"PHYS2211k", "Course: PHYS2211k \r\nTime: Tue 5:30PM \r\nInstructor: Barooni \r\n"}};
	    
	    int on = 1;
	    
	    while (on == 1){
	    	System.out.println("Enter Course Name");
		    String className = input.nextLine();
		    for (int row =0; row < classes.length; row++) {
		    	if (classes[row][0].equals(className)) {
		    		System.out.println(classes[row][1]);		    		
		    		break;
		    	}
		    	else if (className.equals("x")) {
		    		on = 0;
		    	}
		    	else {
		    		System.out.println("Invalid Entry: No course of:" + className);
		    		break;
		    	}
		    }
	    }
	    
		    
//	    };
	    // You can hard-code the values you choose for each row of 
		// course, meet time, and instructor.
		// Ex for a row: 
		//     course[0][0]="CS1301"; course[0][1]="Tue 2pm"; course[0][2]="Johnson";
		//
		// Use 'while loop' and input String scanner to ask user for course ONLY
		// to search for in the 2D vector (not time or instructor)
		// If found, then print "Course: <course>  Time: <meet time>  Instructor: <instructor>""
		// If not found then print: "Invalid Entry: No course of: <course>, <meet time>, <instructor>"
		// Ex: "Invalid Entry: No course of: CS4330, Mon 5pm, Smith"
		
    }
}
