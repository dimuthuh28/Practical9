object one extends App{

  val calculateInterest: Double => Double = (deposit: Double)=>{
    if(deposit <= 20000){
      deposit *0.02;
    }else if(deposit <= 200000){
      deposit * 0.04;
    }else if(deposit <= 2000000){
      deposit * 0.035;
    }else{
      deposit * 0.065;
    }
  }

  //use
  val depositOne = 15000;
  val depositTwo = 150000;
  val depositThree = 1500000;
  val depositFour = 15000000;

  val interestOne = calculateInterest(depositOne);
  println(s"Interest for Rs. $depositOne is Rs. $interestOne");

  val interestTwo = calculateInterest(depositTwo);
  println(s"Interest for Rs. $depositTwo is Rs. $interestTwo");

  val interestThree = calculateInterest(depositThree);
  println(s"Interest for Rs. $depositThree is Rs. $interestThree");

  val interestFour = calculateInterest(depositFour);
  println(s"Interest for Rs. $depositFour is Rs. $interestFour");
  
}