public class Zoo {
    public static void main(String[] args) {
//        Define variable
        Raccoon myFavoriteRaccoon;
//        Init the variable with new object of raccoon class
        myFavoriteRaccoon = new Raccoon();
//        set age field value
        myFavoriteRaccoon.setAge(15);
//        set name field value
        myFavoriteRaccoon.setName("Bilbo");
//        set weight field value
        myFavoriteRaccoon.setWeight(257.6);
        System.out.println("Age:\t" + myFavoriteRaccoon.getAge());
        System.out.println("Name:\t" + myFavoriteRaccoon.getName());
        System.out.println("Weight:\t" + myFavoriteRaccoon.getWeight());
    }
}
