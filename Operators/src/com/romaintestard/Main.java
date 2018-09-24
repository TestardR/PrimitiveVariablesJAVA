package com.romaintestard;

public class Main {

    public static void main(String[] args) {
	int result = 1 + 2;
	int previousResult = result;
	result = result - 1;
	System.out.println(result);

	result = result * 10;
    System.out.println(result);

    result = result / 5;
    System.out.println(result);

    result = result % 2;
    System.out.println(result);

    result++;
    System.out.println(result);

    result += 2;
    System.out.println(result);

    result *= 10;
    System.out.println(result);

    boolean isAlien = false;
    if (isAlien == false)
        System.out.println("it is not an alien!");

    boolean isCar = false;
    if(isCar == true)
    System.out.println("this is not supposed to happen");

    isCar = true;
    boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is true");


    double firstNum = 20;
    double secondNum = 80;
    double total = firstNum + secondNum;
        System.out.println(total);
    double remainder = total % 40;
        System.out.println(remainder);
    if(remainder <= 5){
        System.out.println("Total was over the limit");
    } else {
        System.out.println("You won!");
    }
}
