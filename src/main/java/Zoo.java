import org.junit.Assert;
import org.junit.Test;

public class Zoo {

    @Test
    public void verifyConstructorOfRaccoon(){
        Raccoon myRaccoon= new Raccoon(25);
        System.out.println(myRaccoon.getAge());
        Assert.assertEquals(25, myRaccoon.getAge());



    }

}
