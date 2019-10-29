public class Zoo {
    public static void main(String[] args) {
//        Define variable
        Raccoon myFavoriteRaccoon;
//        Init the variable with new object of raccoon class
        myFavoriteRaccoon = new Raccoon();
        new Raccoon(51);
        myFavoriteRaccoon.heirColor="sdmfnsdjf";
//        set age field value
        myFavoriteRaccoon.setAge(15);
//        set name field value
        myFavoriteRaccoon.setName("Bilbo");
//        set weight field value
        myFavoriteRaccoon.setWeight(257.6);
        System.out.println("Age:\t" + myFavoriteRaccoon.getAge());
        System.out.println("Name:\t" + myFavoriteRaccoon.getName());
        System.out.println("Weight:\t" + myFavoriteRaccoon.getWeight());

        new Raccoon("name", -1,2123.1);

        Raccoon newRaccoon = new Raccoon("azazaz");
        System.out.println(newRaccoon.getName());
    }
}
