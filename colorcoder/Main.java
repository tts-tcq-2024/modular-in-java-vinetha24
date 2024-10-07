
package colorcoder;

import java.util.Scanner;
public class Main {
      final static String MAJOR_COLORS[] = {
          "White", "Red", "Black", "Yellow", "Violet"
      };      
      final static int NUMBER_OF_MAJORCOLOR = MAJOR_COLORS.length;    
      final static String MINOR_COLORS[] = {
          "Blue", "Orange", "Green", "Brown", "Slate"
      };     
      final static int NUMBER_OF_MINORCOLOR = MINOR_COLORS.length;
      
      public static ColorPair getColorFromPairNumber(int pairNumber) {
          int zeroBasedPairNumber = pairNumber - 1;
          MajorColor majorColor = 
              IColor.fromIndex(MajorColor.class,zeroBasedPairNumber / NUMBER_OF_MINORCOLOR);
          MinorColor minorColor =
              IColor.fromIndex(MinorColor.class,zeroBasedPairNumber % NUMBER_OF_MINORCOLOR);
          return new ColorPair(majorColor, minorColor);
      }
      
      public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
          return major.getIndex() * NUMBER_OF_MINORCOLOR + minor.getIndex() + 1;
      }  

      public static void main(String[] args) {
        ColorCodeManual.printColorCodeManual();
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter the Major color : ");
        String majorColor = inputFromUser.nextLine().trim().toUpperCase();
        System.out.println("Enter the Minor color : ");
        String minorColor = inputFromUser.nextLine().trim().toUpperCase(); 
        if(MAJOR_COLORS.toString().contains(majorColor)){
        int pairNumber = (getPairNumberFromColor(MajorColor.valueOf(majorColor), MinorColor.valueOf(minorColor)));
        System.out.println("ColorCode is : " + pairNumber);
        }
      }
  }


