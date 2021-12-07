public class PrintPatterns {

    public static void main(String[] args) {
        patternNine();
    }


    public static void patternOne(){
//        ****
//
//        ***
//
//        **
//
//        *


        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void patternTwo(){

    //*
    //**
    //***
    //****

        for(int i=0;i<5;i++){
            String pattern = new String();
            for(int j=0;j<i;j++){
                pattern += "*";
            }
            System.out.println(pattern);
        }
    }

    public static void patternThree(){
    //  *
    // ***
    //*****
    // ***
    //  *

    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
        int max = 5; // longest line
        int maxStars = 2*max - 1;
        int currentLineSpaces = maxStars - max; // spaces for 1st line
        int currentLineStars = 1;
        for(int i=1;i<=max;i++){

            String line = new String();

            //increasing section
                //for loop for spaces before *
                for(int j=0;j<currentLineSpaces;j++){
                    line += " ";
                }
                    //for loop for *
                    for(int j=0;j<currentLineStars;j++){
                        line += "*";
                    }
            currentLineStars += 2;
                //for loop for spaces after *
                for(int j=0;j<currentLineSpaces;j++){
                    line += " ";
                }
                System.out.println(line);
            currentLineSpaces -= 1;
        }
        currentLineSpaces = 1;
        currentLineStars -= 4;
        for(int i=max-1;i>0;i--){


            String line = new String();
            //decreasing section

                //for loop for spaces before *
                for(int j=0;j<currentLineSpaces;j++){
                    line += " ";
                }

                    //for loop for *
                    for(int j=0;j<currentLineStars;j++){
                        line += "*";
                    }
                    currentLineStars -= 2;

                //for loop for spaces after *
                for(int j=0;j<currentLineSpaces;j++){
                    line += " ";
                }
                System.out.println(line);
                currentLineSpaces += 1;
        }

    }

    public static void patternFour(){
        //1010101
        //10101
        //101
        //1

        String longest = "1010101";
        for(int i=0;i<8;i+=2){
            System.out.println(longest.substring(0, longest.length()-i));
        }

    }

    public static void patternFive(){
    //**********
    //**********
    //**********
    //**********

        String patt = "**********";

        for(int i=0;i<4;i++){
            System.out.println(patt);
        }
    }

    public static void patternSix(){
    //        *
    //       **
    //      ***
    //     ****
    //    *****

        int max = 5;
        int spaceOnLine = max-1;
        int starOnLine = 1;
        for(int i=1;i<=max;i++) {
            String line = new String();

            for (int j = 0; j < spaceOnLine; j++) {
                line += " ";
            }
            for (int j = 0; j < starOnLine; j++) {
                line += "*";
            }
            starOnLine++;
            spaceOnLine--;
            System.out.println(line);
        }
    }

    public static void patternSeven(){
    //        *
    //       ***
    //      *****
    //     *******
    //    *********

        int maxLine = 5; // Line number with maximum stars
        int maxStars = 2*maxLine - 1;

        int stars = 1; // Stars on first line
        int spaces = maxStars-maxLine;
        for(int i=0;i<maxLine;i++){
            String line = new String();
        //for loop for spaces before stars
            for(int j=0;j<spaces;j++){
                line += " ";
            }
            //for loop for stars
            for(int j=0;j<stars;j++){
                line += "*";
            }
            stars+= 2;
        //for loop for spaces after stars
            for(int j=0;j<spaces;j++){
                line += " ";
            }
            spaces--;
            System.out.println(line);
        }
    }

    public static void patternEight(){
    //         1
    //        222
    //       33333
    //      4444444
    //     555555555
        int maxLine = 5;
        int maxDigits = 2*maxLine - 1;
        int space = maxDigits - maxLine;
        int digit = 1;
        int actualDigit = 1;

        for(int i=0;i<maxLine;i++){
            String line = new String();
            for(int j=0;j<space;j++){
                line += " ";
            }

            for(int j=0;j<digit;j++){
                line += actualDigit;
            }
            actualDigit++;
            digit+=2;
            for(int j=0;j<space;j++){
                line += " ";
            }
            space--;

            System.out.println(line);
        }
    }

    public static void patternNine(){
    //         1
    //        212
    //       32123
    //      4321234
    //     543212345

        int maxLine = 5;
        int maxDigits = 2*maxLine - 1;
        int space = maxDigits - maxLine;
        int noOfDigits = 1;

        for(int i=1;i<=maxLine;i++){
            String line = new String();
            for(int j=0;j<space;j++){
                line += " ";
            }
            int count=0;
            for(int j=i;j>0;j--){
                line += j;
                count++;
            }

            int num = 1;
            for(int j=0;j<noOfDigits-count;j++){

                line += ++num;
            }
            noOfDigits += 2;
            for(int j=0;j<space;j++){
                line += " ";
            }
            space--;

            System.out.println(line);
        }
    }
}
