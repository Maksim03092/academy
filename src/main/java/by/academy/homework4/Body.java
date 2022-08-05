package by.academy.homework4;

public class Body {

    private Heart heart;
    private Lungs lungs;

    public Body(){
        Heart heart = new Heart();
        this.heart = heart;
        Lungs lungs = new Lungs();
        this.lungs = lungs;
    }

    public void live(){
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea." +
                "And I believe that you are free, and life has only begun.");
    }

    public class Heart{

        public void live(){
            for (int i = 0; i < Integer.MAX_VALUE; i++){
                if (i % 100 == 0){
                    System.out.println("Knock-knock-knockin' on heaven's door");
                }
            }
        }
    }

    public class Lungs{

        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++){
                if (i % 50 == 0){
                    System.out.println("breathe in");
                }
                if (i % 100 == 0){
                    System.out.println("breathe out");
                }
            }
        }
    }
}
