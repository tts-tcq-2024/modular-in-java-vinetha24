
package colorcoder;


public interface IColor {

  int getIndex();

  public static <T extends Enum<T> & IColor> T fromIndex(Class<T> enumType, int index) {
    for (T color : enumType.getEnumConstants()) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }
}
