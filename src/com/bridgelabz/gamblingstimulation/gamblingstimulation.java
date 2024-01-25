package com.bridgelabz.gamblingstimulation;
import java.util.Scanner;

class Win_or_Loose{

public int getEverydayStake() {
    Scanner scanner = new Scanner(Systm.in);
    String n = new.nexLine();
    System.out.println("Bet/loose");
    if (n == 'won' || n == 'loose') {
        every_day_stake = every_day_stake * 50 / 100;
    }

retrun every_day_stake;
}
}

class Monthly{

    public int getmonthly()
    {
        int day_won;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int day_lost;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int count=0;
        int count1=0;
        for(int i=0;i<31;i++)
        {

            if(i=day_won)
            {
            count++;
             return count;
            }
            else
            {
                count1++;
                return count1;
            }
        }

    }

}

public class gamblingstimulation {

    public static  void main(String[] args) {
        int stake = 100;
        int bet = 1;
         int every_day_stake = stake-bet;
        System.out.println("enter the Bet is won or not");

       gamblingstimulation obj= new gamblingstimulation();
           obj.getEverydayStake();

      int total_amount;


        for(int i=0;i<100;i++)
        {
            if(i>20) {
                total_amount -= every_day_stake;
            }

            if(n==win)
            {
                total_amount++;
            }
            else
            {
                total_amount---;
            }
        }

        gamblingstimulation obj2= new gamblingstimulation();
        obj2.getMonthly();
        System.out.println(obj2);




        System.out.println(total_amount);
    }
}
