package colorcoder;

import org.junit.jupiter.api.Test;

class TestColorPair {

  @Test
  public void testColorFromPairNumber() {
    
  ColorPair colorPair = Main.getColorFromPairNumber(4);
  System.out.println("Got pair " + colorPair.ToString());
  assert(colorPair.getMajor() == MajorColor.WHITE );
  assert(colorPair.getMinor() == MinorColor.BROWN);
  }
  
  @Test
  public void testPairNumberFromColors() {
    
      int pairNumber = Main.getPairNumberFromColor(MajorColor.WHITE , MinorColor.BLUE);
      System.out.println("Got pair number " + pairNumber);
      assert(pairNumber == 1);
  
  }

}
