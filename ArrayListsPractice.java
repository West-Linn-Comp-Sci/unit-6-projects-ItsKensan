package com.company;
import java.util.ArrayList;

public class ArrayListsPractice {

    private int myAge;
    private String myName;


    public ArrayListsPractice(int age, String name){
        myAge = age;
        myName = name;

    }



    public static void main(String[] args) {

   // #1 Test

    ArrayList<Integer> numbers= new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(0);
    numbers.add(2);
    numbers.add(4);
    numbers.add(0);
    numbers.add(3);


        removeZeros(numbers);

    // #2 Test

    ArrayList<String> forCount = new ArrayList<String>();
        forCount.add("Kensan");
        forCount.add("Aditiya");
        forCount.add("Putra");

    countLetters(forCount);

    // #3 Test

        System.out.println(findPosition(3, numbers));

    // #4 Test

        System.out.println(parseIntoArrayList("West Linn"));


    }

    public static void removeZeros(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }

    public static void countLetters(ArrayList<String> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++){

            sum = sum + list.get(i).length();

        }

        System.out.println(sum);

    }

    public static int findPosition(int keyValue, ArrayList<Integer> list){
        int result = -1;

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) == keyValue){
                result = keyValue;
            }
        }

        return result;


    }


    public static ArrayList<String> parseIntoArrayList(String input){

        ArrayList<String> letters = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++){

            letters.add(input.substring(i, i + 1));
        }

        return letters;

    }

    public static int findMin(ArrayList<ArrayListsPractice> list){

        int min = 0;
        for (int i = 0; i < list.size(); i++){

            min += i;

        }
        return min;

    }


    /* returns true if this coin is equal to aCoin,
// which means the name and the value are both equal

    public boolean equals(Coin aCoin) {

    if (aCoin.getValue() == coin.getValue() && aCoin.getName().equals(coin.getName()){
    return true;
    }

    return false;

    }

    // returns total value of all coins in purse
    public double getTotal() {

    int sum = 0;
    for (int i = 0; i < coins.size(); i++){
    sum += coins.get(i);
    }

    return sum;
    }

    // returns the number of coins in the Purse that matches aCoin
    // (both myName & myValue)


}
}



*/

}
