package colorcoder;



public class ColorPair {
  private MajorColor majorColor;
  private MinorColor minorColor;
  
  public ColorPair(MajorColor majorColor, MinorColor minorColor)
  {
      this.majorColor = majorColor;
      this.minorColor = minorColor;
  }
  public MajorColor getMajor() {
      return majorColor;
  }
  public MinorColor getMinor() {
      return minorColor;
  }
  
  public String ToString() {
     String majorColor = Main.MAJOR_COLORS[this.majorColor.getIndex()];     
      String minorColor = Main.MINOR_COLORS[this.minorColor.getIndex()];
      return majorColor + " " + minorColor;
  }
}
