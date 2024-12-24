package StrategyPattern;


class Main{
    public static void main(String[] args) {

        jetFlying jet = new jetFlying();
        duck objDuck = new duck(jet);
        objDuck.fly();
    }
}