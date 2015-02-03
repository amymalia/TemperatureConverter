/**
 * Created by amytakayesu on 2/2/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    System.out.println("args[0]: " + args[0]);
    System.out.println("args[1]: " + args[1]);
    if(args.length != 2){
      throw new IllegalArgumentException("Error: Illegal Argument Exception");
    }
    if(!(args[0].equals("-F") || args[0].equals("-C"))){
      throw new IllegalArgumentException("Error: IllegalArgumentException");
    }
    int temp = Integer.parseInt(args[1]);

    if(args[0].equals("-F")){
      System.out.printf("Convert %dF to Celsius: %dC%n", temp, (temp -32)*(5/9));
    }
    else{
      System.out.printf("Convert %dC to Fahrenheit: %dF%n", temp, (temp * 9/5) + 32);
    }

  }
}
