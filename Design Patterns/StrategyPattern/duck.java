package StrategyPattern;

public class duck{
    public flyingBehaviour fb;

    public duck(flyingBehaviour fb){
        this.fb = fb;
    }

    public void fly(){
        this.fb.fly();
    }
}