package Rush.RushFromOneToTen;

public class JRushTwo {
    public static void JRush() {

    }

    public class Cat {
        String name;
        int age;
        int weight;
        int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age?1:0;
            int weightPlus = this.weight>anotherCat.weight?1:0;
            int strengthPlus= this.strength>anotherCat.strength?1:0;
            return true;
        }
    }
}


