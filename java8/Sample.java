

public class Sample {
  public static void main (String[] args) {
    Runnable runner = () -> {
        System.out.println("Hello World !!");
    };
    runner.run();
  }
} 