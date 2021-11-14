class Animal {
    private int nAnimal;
    private String sound;
    public Animal(int n, String s) { 
        nAnimal=n; 
        sound=s;
    }
    public void setNAnimal(int n) { nAnimal = n; }
    public int getNAnimal() { return nAnimal; }

    public void setSound(String s) { sound = s; }
    public String getSound() { return sound; }
}

class Cow extends Animal {
    static int num = 1;
    public Cow() { 
        super(num, "Moooooo");
        num++;
    }
}

class Sheep extends Animal {
    static int num = 1;
    public Sheep() { 
        super(num, "Mbeek mbeeeek"); 
        num++;
    }
}

class Chicken extends Animal {
    static int num = 1;
    public Chicken() { 
        super(num, "Pet petok petook");
        num++;
    }
}

class Duck extends Animal {
    static int num = 1;
    public Duck() { 
        super(num, "Kweek kweekk"); 
        num++;
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] farm = {new Cow(), new Cow(), new Cow(),
                         new Sheep(), new Sheep(),
                         new Chicken(), new Chicken(), new Chicken(), new Chicken(),
                         new Duck(), new Duck() };
        for (int i=0; i < farm.length; i++){
            System.out.println(farm[i].getSound()+ " sound of " + farm[i].getClass().getSimpleName() + " " + farm[i].getNAnimal());
        } 
            
        
    }
}
