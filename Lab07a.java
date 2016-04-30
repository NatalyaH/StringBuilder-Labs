import javax.swing.JOptionPane;  // Imports JOptionPane class
public class Lab07a {

    /**
     * Removes all space characters from a String
     *
     * @param input
     *            String to have spaces removed from
     * @return the input String with spaces removed
     * Natalya Habib
     */

    /* Method removeSpaces will go through sentence user inputted and remove all spaces*/
    public static String removeSpaces(String input) {
       
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) != ' ') {
        result = result.append(input.charAt(i));
        
        }
        }
        
        return result.toString();//returns result as String
    }

    public static void main(String[] args) {
        
        String reTry = null; //declared variables to use within entire main 
        String sentence = null;
       
        // repeat entire process until user inputs "N"
        do {

        sentence = JOptionPane.showInputDialog("Please Enter a Sentence to De-Space :");

        // if user leaves field empty program will print first sentence - else it will print result 
        if (sentence.equals("")) {
            JOptionPane.showMessageDialog(null, "You didn't put in a sentence! How do you expect the program to work!");
        }

        else{ 
            JOptionPane.showMessageDialog(null, "Your Sentence when De-Spaced is: " 
                                        + "\n" + removeSpaces(sentence));
        }

        //window will continue to pop up until user inputs "Y" or "N"  
        do { 
        // asks user to input "Y" or "N" to repeat program - if user inputs N program will quit 
            reTry = JOptionPane.showInputDialog("Would You Like to Try Again? (Y/N) ");
        
        }
        while (!reTry.equals("Y") && !reTry.equals("N"));
        
        }
        while (reTry.equals("Y"));

        JOptionPane.showMessageDialog(null, "Goodbye!"); 

    }//end main

}//end class 
