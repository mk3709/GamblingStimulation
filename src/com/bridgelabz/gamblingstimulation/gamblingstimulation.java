package com.bridgelabz.gamblingstimulation;


public class gamblingstimulation {

    public static  void main(String[] args) {

        int stake = 100;

        int bet = 1;

        int every_day_stake = stake-bet;



        if(bet > 1)
        {
          bet++;
        }
        else
        {
            bet--;

        }




        System.out.println(every_day_stake);
    }
}
