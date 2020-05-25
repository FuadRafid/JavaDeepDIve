package com.fuadrafid.exceptions.trystatements;

public class TryStatement {
    public static void main(String[] args) {

    }

    private void explore() {
        try {
            this.fall(); // throws RuntimeException, so goes to catch block/clause
            System.out.println("never get here");
        } catch (RuntimeException e) {
            this.getUp();
        }
        this.seeAnimals();
    }

    private void exploreWrong() {
        /**
         * try catch blocks must have braces, ot else will not compile
         *! try
         *!    fall();
         *! catch(Exception e)
         *!   System.out.println("get up");
         */

        //this works fine
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }
    }

    private void exploreAndGoHome() {
        try {
            seeAnimals();
            fall(); // goes to catch block
        } catch (Exception e) {
            getHugFromDaddy(); // executes, then goes to finally
        } finally {
            seeMoreAnimals();
        }
        goHome();


        /**
         * try catch and final blocks must be in order. try -> catch -> finally
         *!  try {
         *!     fall();
         *!  } finally {
         *!     System.out.println("all better");
         *!  } catch (Exception e) {
         *!       System.out.println("get up");
         *!  }
         */

    }

    private void getHugFromDaddy() {
        System.out.println("Hugging daddy");
    }

    private void seeMoreAnimals() {
        System.out.println("Seeing more animals");
    }

    private void goHome() {
        System.out.println("Going home");
    }

    private void fall() {
        throw new RuntimeException();
    }

    private void getUp() {
        System.out.println("Getting up");
    }

    private void seeAnimals() {
        System.out.println("Seeing animals");
    }


}
