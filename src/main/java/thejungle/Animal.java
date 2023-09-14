package thejungle;


public class Animal {
   public String animalName;
   public char identifier;
   public int[] numbers;

   public String sound;

   public Animal(String animalName, char identifier, String sound, int[] numbers) {
      this.animalName = animalName;
      this.identifier = identifier;
      this.sound = sound;
      this.numbers = numbers;
   }


   public void printAnimalSound() {
      System.out.println(sound);

   }
   public void printAnimalNumbers(){
      for(int x = 0; x <numbers.length;x++){
         System.out.println(numbers[x]);
      }
   }
}









/*System.out.println("The " + animalName + "identified as " + identifier "is the fastest known bear ");
boolean trueOFalse;*/
//        trueOFalse = true;
//        String
//        animalName = "Grizzly Bear";
//
//        identifier = 'b';
//        int[] animalSpeed = {25,30,35};