package com.company;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "shark eats lots of people";
    }
}
class IndependeceDay extends Movie{

    public IndependeceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "imperials try to take over the galaxy";
    }
}
class Forgetable extends Movie{

    public Forgetable() {
        super("Some movie name");
    }
    // no plot method
}
public class Main {

    public static void main(String[] args) {
	for(int i = 1; i < 11; i++){
        Movie movie = randomMovie();
        System.out.println("Movie #"+ i + " : " + movie.getName() + "\n" + "plot: " + movie.plot() + "\n");
    }
    }

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 5) +1;
        System.out.println("random number was "+ randomNum);
        switch (randomNum){
            case 1 :
                return new Jaws();
            case 2 :
                return new IndependeceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        } return null;
    }
}
