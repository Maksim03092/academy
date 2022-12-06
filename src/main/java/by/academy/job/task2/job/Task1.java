package by.academy.job.task2.job;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(checkLotteryTicket(90001233));

    }

    public static boolean checkLotteryTicket(int numberLotteryTicket){

        int numberOfDigits = 0;
        int verificationVariable = 0;

        if (numberLotteryTicket / 10_000_000 > 0){
            numberOfDigits = 8;
        }
        else if(numberLotteryTicket / 100_000 > 0){
            numberOfDigits = 6;
        }
        else if(numberLotteryTicket / 1_000 > 0){
            numberOfDigits = 4;
        }
        else if (numberLotteryTicket / 10 > 0){
            numberOfDigits = 2;
        }


        for (int i = 0; i < numberOfDigits; i++){

            if(i < numberOfDigits / 2){
                verificationVariable += numberLotteryTicket % 10;
            }
            else {
                verificationVariable -= numberLotteryTicket % 10;
            }
            numberLotteryTicket /= 10;
        }

        return verificationVariable == 0;
    }
}
