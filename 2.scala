import scala.io.StdIn

object two extends App{

  print("Enter a int input: ");
  val intInput = StdIn.readInt();
  println(intInput);

  val checkNumber: Int => String = {
    case n if n <= 0 => "Negetive/Zero is input";
    case n if n % 2 == 0 => "Even number is given";
    case n => "Odd number is given";
  }

  println(checkNumber(intInput));
}