/* 
Name: Rachel Shindelus
Date: 10/02/2022
Description: This program is intended to convert from a given number of gallons, begining at 1, being incremented by 4, all the way through 100
             into the equivalent number of liters using the approximation that there are 3.78 liters in a single gallon. This program provides a 
             brief description of it's purpose at the begining and follows with a conversion table. 
Self Grade:  I believe I should receive 100% on this assignment as this program satisifies every requirement of the rubric. It is slightly off from
             the example output because I used the conversion of 3.78 liters = 1 gallon, whereas the example output appears to have used 3.7 liters = 1 gallon.
*/
public class GallonLiterConverterShindelus
{
  private static double NUM_LITERS_IN_GALLON = 3.78;      // (CLASS CONSTANT) There are 3.78 liters in 1 gallon
   
   /* ______MAIN METHOD_______
         Calls to the two methods in order to display the description of the program at the top, followed by the actual conversion table.
   */
   public static void main (String[] args)
   {
    description();    
    gallonToLiterConversionTable();    
   }
   
   /* ________METHOD #1___________
         Displays a description of what the program does (converts gallons to liters) within a box. Uses for loops to display the top and bottom boarders of the box, 
      as per assignment instruction. Print functions are used to display the characters and writing.
   */
   public static void description() {
    for(int width = 0; width < 61; width++) {   // Prints a row of #'s with a width of 61
     System.out.print("#");
     }
      System.out.println(" ");     // Blank Line
      System.out.println("# This program can convert the number of gallons to liters. #");
      System.out.println("#        (One gallon is approximately 3.78 liters)          #");
      for(int width = 0; width < 61; width++) {   // Prints a row of #'s with a width of 61
       System.out.print("#");
      }
      System.out.println("\n");     // Two Blank Lines
   } 
   
   /* ________METHOD #2__________
         This prints a display table of the conversion from gallons to liters. Calls to the class constant (NUM_LITERS_IN_GALLON = 3.78) to complete conversions. 
      The number of gallons are being incremented by 4 starting at 1 through 100 as per assignment instructions. 
      ****NOTE*****
         I seperated the intitial for loop that had processed the conversions for the gallons being incremented by 4 in the 1-100 range into two seperate loops. 
      I did this to line up the liter values better because once the gallons showed double digits, the liters were being pushed a single space over and no longer
      lined up with the previous conversion results from the single digit ones. I wasn't sure if there was a set width function as in C++ to find a better solution
      to have the conversions displayed in a straight vertical line. 
   */
   public static void gallonToLiterConversionTable() {
     // Top of table display
     System.out.println("  Gallons  |  Liters");
     for(int width = 0; width < 22; width++) {
      System.out.print("_");
     }
     System.out.println(" ");    // Blank line
     // Conversions converting from gallons to liters.
     for(int gallons = 1; gallons <= 10; gallons = gallons + 4) {    // 1-10 range
      double liters = gallons * NUM_LITERS_IN_GALLON;
      System.out.println("\t " + gallons + "\t\t\t\t" + liters);
     }
     for(int gallons = 10; gallons <= 100; gallons = gallons + 4) {  // 10-100 range
      double liters = gallons * NUM_LITERS_IN_GALLON;
      System.out.println("\t " + gallons + "\t\t\t" + liters);
     }
   } 
  }   