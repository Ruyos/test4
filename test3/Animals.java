package test3;

abstract class Animals {
    public abstract void cry();
    public abstract void getAnimals();
}
class Simulator{
    void playSound(Animals animals){
        animals.cry();
        animals.getAnimals();
    }
}
class Dogs extends Animals{
    public void cry(){
        System.out.println("汪汪汪");
    }
    public void getAnimals(){
        System.out.println("这是一只狗");
    }
}
class  Cats extends Animals{
    public void cry(){
        System.out.println("喵喵喵");
    }
    public void getAnimals(){
        System.out.println("这是一只猫");
    }
}

