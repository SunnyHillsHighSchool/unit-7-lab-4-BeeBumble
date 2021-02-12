//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Quinn Cassady

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class

public class Number
{

  //private instance variable (must be an Integer)

  private Integer num;

  //constructor

  public Number(){
    num = 0;
  }
  public Number(Integer n){
    num = n;
  }

  //getter method

  public Integer getNum(){
    return num;
  }

  //setter method

  public void setNum(Integer newNum){
    num = newNum;
  }

  //isOdd method

  public boolean isOdd(){
    //return the result of whether the remainder or num/2 is 1 or not
    return (num % 2 == 1);
  }

  //isPerfect method

  public boolean isPerfect(){
    //create an int 
    int sum = 0;
    //make a for loop with i=1, i<num, and i increase by 1 each time
    for(int i = 1; i < num; i++){
      //if i is a factor of num,
      if(num % i == 0){
        //then add i to the sum
        sum += i;
      //end the if
      }
    //end the for
    }
    //return if the sum is equal to num
    return (sum == num);
  }

  //toString

  public String toString(){
    return "Number: " + num;
  }
}