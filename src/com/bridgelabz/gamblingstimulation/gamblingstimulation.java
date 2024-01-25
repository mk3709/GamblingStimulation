package com.bridgelabz.gamblingstimulation;


class Win_or_Loose{

public int getEverydayStake() {
    Scanner scanner = new Scanner(Systm.in);
    String n = new.nexLine();

    if (n == 'won' || n == 'loose') {
        every_day_stake = every_day_stake * 50 / 100;
    }

retrun every_day_stake;
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






        System.out.println(total_amount);
    }
}
