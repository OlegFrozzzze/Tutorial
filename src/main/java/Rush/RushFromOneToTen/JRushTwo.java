package Rush.RushFromOneToTen;

public class JRushTwo {
    public static void JRush() {
        Cat cat1 = new Cat("Simon",3,10,10);
        Cat cat2 = new Cat("Simon2",2,3,5);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

    public static class Cat {
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
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;

            return score > 2;
        }
    }
}


