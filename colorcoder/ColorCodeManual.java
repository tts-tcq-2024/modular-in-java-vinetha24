
package colorcoder;



public class ColorCodeManual {

  public static void printColorCodeManual() {
    System.out.println("-------------------------------------------------------------------------");
    int count = 1;
    System.out.println("|\t" + "MajorColor\t" + "|\tMinorColor\t|" + "\tColorCode\t|");
    for (String majorColor : Main.MAJOR_COLORS) {
      for (String minorColor : Main.MINOR_COLORS) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t" + MajorColor.valueOf(majorColor.toUpperCase()) + "\t\t|\t"
            + MinorColor.valueOf(minorColor.toUpperCase()) + "\t\t|" + "\t\t" + count + "\t|");
        count++;
      }
    }
    System.out.println("-------------------------------------------------------------------------");

  }
}
