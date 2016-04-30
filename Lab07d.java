import javax.swing.JOptionPane; // Imports JOptionPane class
 
public class Lab07d {

    /**
    * Takes a String given by user input 
    * Deletes substring of first String based on user input
    * Natalya Habib
     */

    // declared Instance variable in order for it to be used within both methods
    static String subString; 
    
    /* method deleteString takes variable subString
    and removes it from the variable sentence */

    public static String deleteString(String input, String index) {// set value to string to give an option for a return value
       
       StringBuilder result = new StringBuilder();

       //add first string to stringbuilder.
       //delete substring by finding index of first character and last character 

       result= result.append(input).delete(input.indexOf(index), input.indexOf(index) + index.length());

       
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
        
        subString = JOptionPane.showInputDialog("Enter a substring to delete (empty to end)");//asks for user input

        // updates sentence with ONLY the characters they have chosen to keep
     
        sentence= deleteString(sentence, subString); 
        
        JOptionPane.showMessageDialog(null, "Current String : " 
                                        + "\n" + sentence);
        
        }while(!subString.equals("") );
     
        // when user inputs -1 optionPane will show and then program will quit 
        JOptionPane.showMessageDialog(null, "Goodbye!");

    }// end of main 

}// end of class