package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

   private String[] field;
   private int randomNumber;
   private int index;
   private int score;

   public Main (){
      field = new String[7];

      for (int i = 0; i < 7; i ++){
         field [i] = "[ ]";
      }

   }

   public String place (int idx) {
      index = idx;

      return field[index] = "[O]";
   }

   public String hit (int idx){
      index = idx;

      if (field[idx].contains("[O]")){

         return field[index] = "[@]";
      }

      else {
         return field[index] = "[X]";
      }

   }

   public int Score (int idx){
      index = idx;

      if (field[idx].contains("[@]")){
         return 1;
      }
      return 0;

   }

   public void getMain(){

      System.out.println(Arrays.toString(field));
   }




   public static void main(String[] args){

      boolean running = true;
      int indexForPlacement;
      int indexToFire;

      Scanner input = new Scanner(System.in);
      Main field1 = new Main();


      field1.getMain();



      for (int i = 0; i < 3 ; i++){

         System.out.println("Where would you like to place your ships?");
         indexForPlacement = input.nextInt();

         field1.place(indexForPlacement);
         
      }


      field1.getMain();

      // Guessing game starts

      for (int i = 1; i <= 5; i++){

         System.out.println("Where would you like to fire? \nYou have " + i + "/5 tries");
         indexToFire = input.nextInt();

         field1.hit(indexToFire);

         field1.getMain();

      }

      int numScore = 0;

      for (int i = 0; i <= 6; i++){

         numScore = numScore + field1.Score(i);
      }

      if (numScore == 3){
         System.out.println("Congratulations! You destroyed the ship!");
      }
      else{
         System.out.println("You hit " + numScore + "/3 of the spots, try again next time!");
      }



   }

}
