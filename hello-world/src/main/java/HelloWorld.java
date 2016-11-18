public class HelloWorld {
  public static String hello(String name) {
    String output;
    if (name == (null)) {
      return "Hello, World!";
    }
    if (name.equals("")) {
      output = "Hello, World!";
    } else {
      output = "Hello, " + name+"!";
    }
    return output;
  }
}
