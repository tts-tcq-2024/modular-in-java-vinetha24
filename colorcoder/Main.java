
package colorcoder;

import java.util.Scanner;
public class Main {
      final static String MajorColorNames[] = {
          "White", "Red", "Black", "Yellow", "Violet"
      };      
      final static int numberOfMajorColors = MajorColorNames.length;    
      final static String MinorColorNames[] = {
          "Blue", "Orange", "Green", "Brown", "Slate"
      };     
      final static int numberOfMinorColors = MinorColorNames.length;
      
      public static ColorPair getColorFromPairNumber(int pairNumber) {
          int zeroBasedPairNumber = pairNumber - 1;
          MajorColor majorColor = 
              IColor.fromIndex(MajorColor.class,zeroBasedPairNumber / numberOfMinorColors);
          MinorColor minorColor =
              IColor.fromIndex(MinorColor.class,zeroBasedPairNumber % numberOfMinorColors);
          return new ColorPair(majorColor, minorColor);
      }
      
      public static int getPairNumberFromColor(MajorColor majorColor, MinorColor minorColor) {
          return majorColor.getIndex() * numberOfMinorColors + minorColor.getIndex() + 1;
      }  

      public static void main(String[] args) {
        ColorCodeManual.printColorCodeManual();
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter the Major color : ");
        String majorColor = inputFromUser.nextLine().trim().toUpperCase();
        System.out.println("Enter the Minor color : ");
        String minorColor = inputFromUser.nextLine().trim().toUpperCase();       
        int pairNumber = (getPairNumberFromColor(MajorColor.valueOf(majorColor), MinorColor.valueOf(minorColor)));
        System.out.println("ColorCode is : " + pairNumber);
      }
  }


