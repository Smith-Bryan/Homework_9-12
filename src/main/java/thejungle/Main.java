package thejungle;

public class Main {
    public static void main(String[] args) {
        int[] bearNumbers = {5,10,15,20};
        Animal bear = new Animal("Grizzly",'G',"Roar",bearNumbers);

        int[] cheetahNumbers = {2,4,6,8,10};
        Animal cheetah = new Animal("Cheetah",'C',"Growl",cheetahNumbers);

        int[] pantherNumbers = {3,6,9,12};
        Animal panther = new Animal("Panther",'P',"Purr",pantherNumbers);
       ;
        cheetah.printAnimalNumbers();
        panther.printAnimalNumbers();
        bear.printAnimalNumbers();


        cheetah.printAnimalSound();
        panther.printAnimalSound();
        bear.printAnimalSound();




        System.out.println();
    }
}













 /* bear.animalName = "Grizzly";
        bear.identifier = 'G';
        bear.numbers = bearNumbers;
        bear.sound = "Roar";


        cheetah.animalName = "Roger";
        cheetah.identifier = 'C';
        cheetah.numbers = cheetahNumbers;
        cheetah.sound = "Growl";


        panther.animalName = "Demitri";
        panther.identifier = 'D';
        panther.numbers = pantherNumbers;
        panther.sound = "Purr"; */