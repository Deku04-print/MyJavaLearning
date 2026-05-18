package Methods;

public class PreyPredator {
    public static void main(String[] args){

        Rabit rabit=new Rabit();
        Wolf wolf=new Wolf();
        Fish fish=new Fish();

        rabit.flee();
        wolf.hunt();
        fish.flee();
        fish.hunt();
    }
}

 interface Prey{
    void flee();
}

interface Predator{
     void hunt();
}

class Rabit implements Prey{

    @Override
    public void flee(){
        System.out.println("*The Rabbit is Running..*");
    }
}

class Wolf implements Predator{

    @Override
    public void hunt(){
        System.out.println("*The Wolf is Hunting..*");
    }
}

class Fish implements Prey,Predator{

    @Override
    public void hunt(){
        System.out.println("*The Fish is Hunting..*");
    }
    @Override
    public void flee(){
        System.out.println("*The Fish is Swimming awayy..*");
    }
}
