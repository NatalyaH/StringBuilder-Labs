import javax.swing.JOptionPane; // Imports JOptionPane class
public class Lab07c {

    /**
    * Takes a String given by user input 
    * Deletes characters based on index number user has inputted
    * Natalya Habib
     */

    // declared Instance variable in order for it to be used within both methods
    static String charPosition; 
    
    /* method deleteChar takes variable charPosition
    and prints out every other character from variable sentence
    that is not listed under that index number*/

    public static String deleteChar(String input) {// set value to string to give an option for a return value
       
       StringBuilder result = new StringBuilder();
       int index = Integer.parseInt(charPosition);
        for (int i = 0; i < input.length(); i++) {
        if (i != index) {
        result = result.append(input.charAt(i));
        
        }
        }
        
        return result.toString();
    }//end of deleteChar
    

    public static void main(String[] args) {
        
        String sentence = null; //declares variable sentence to be used within entire main method 
        
        do {
        sentence = JOptionPane.showInputDialog("Enter a String:"); //asks for user input
        
        if (sentence.equals("")) {
             JOptionPane.showMessageDialog(null, "You didn't put in a sentence! How do you expect the program to work!");
        }
        }
        while(sentence.equals(""));

        // allows user to continue to delete characters until they enter -1 
        do {
        
        charPosition = JOptionPane.showInputDialog("Enter a position to delete (-1 to end)");//asks for user input

        // updates sentence with ONLY the characters they have chosen to keep
        sentence= deleteChar(sentence); 

        JOptionPane.showMessageDialog(null, "Current String : " 
                                        + "\n" + sentence);
        
        }while(!charPosition.equals("-1") );
     
        // when user inputs -1 optionPane will show and then program will quit 
        JOptionPane.showMessageDialog(null, "Goodbye!");

    }// end of main 

}// end of class