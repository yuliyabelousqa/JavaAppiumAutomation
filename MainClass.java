import org.junit.Test;


public class MainClass {
    int a=2;
    int b=7;
    int number=a*b;

    {
        int number=this.getLocalNumber();
        if (a*b==14)
        {System.out.println ("True");
        } else{
            System.out.println ("False");
        }
    }

    public int getLocalNumber()

    {
       return number;
    }

}
