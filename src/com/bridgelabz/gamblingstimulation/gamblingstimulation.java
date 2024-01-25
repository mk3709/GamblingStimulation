package com.bridgelabz.gamblingstimulation;


public class gamblingstimulation {

    public static  void main(String[] args) {
        int stake = 100;
        int bet = 1;
        int every_day_stake = stake-bet;
        System.out.println("enter the Bet is won or not");
        Scanner scanner = new Scanner(Systm.in);
        String n=new.nexLine();

        if(n=='won'||n=='loose')
        {
            every_day_stake=every_day_stake*50/100;
        }

        System.out.println(every_day_stake);
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
