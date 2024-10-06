package colorcoder;



public class ColorPair {
  private MajorColor majorColor;
  private MinorColor minorColor;
  
  public ColorPair(MajorColor major, MinorColor minor)
  {
      majorColor = major;
      minorColor = minor;
  }
  public MajorColor getMajor() {
      return majorColor;
  }
  public MinorColor getMinor() {
      return minorColor;
  }
  
  public String ToString() {
      String majorColor = Main.MajorColorNames[this.majorColor.getIndex()];     
      String minorColor = Main.MinorColorNames[this.minorColor.getIndex()];
      return majorColor + " " + minorColor;
  }
}
