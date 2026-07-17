package Classworks;

public class Classwork_2 {
    
    public static class Mutant {
        private String name;
        private int power;
        
        public Mutant(String name, int power) {
            this.name = name;
            this.power = power;
        }
        
        public String getName() { return name; }
        public int getPower() { return power; }
    }
    
    public static class Wolverine extends Mutant {
        public Wolverine() { super("Wolverine", 95); }
    }
    
    public static class Storm extends Mutant {
        public Storm() { super("Storm", 90); }
    }
    
    public static class Cyclops extends Mutant {
        public Cyclops() { super("Cyclops", 85); }
    }
    
    public static class Phoenix extends Mutant {
        public Phoenix() { super("Phoenix", 100); }
    }
    
    public static class Magneto extends Mutant {
        public Magneto() { super("Magneto", 98); }
    }
    
    public static class Professor extends Mutant {
        public Professor() { super("Professor X", 92); }
    }
    
    public static class Beast extends Mutant {
        public Beast() { super("Beast", 88); }
    }
    
    public static class Rogue extends Mutant {
        public Rogue() { super("Rogue", 87); }
    }
    
    public static class Iceman extends Mutant {
        public Iceman() { super("Iceman", 86); }
    }
    
    public static class Gambit extends Mutant {
        public Gambit() { super("Gambit", 84); }
    }
}