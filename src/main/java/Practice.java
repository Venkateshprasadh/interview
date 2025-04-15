import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static String numToWords(int n)
    {
        String number="";
        String[] ones = {
                "zero","one","Two","Three","four","Five","six","Seven",
                "eight","nine","ten","eleven","twelve","thirteen",
                "fourteen","fifteen","sixteen","seventeen","eighteen"
                ,"nineteen","twenty"
        };
        String[] tees= {
                "","","","thirty","forty","fifty","sixty","seventy"
                ,"eighty","ninenty"
        };
        if(n<=20)
        {
            return ones[n];
        }
        int tensCount=0;
        while(n>0)
        {
            int temp = n;
            temp = n%10;
            if(tensCount==0)
            {
                number = " "+ ones[temp]+number.trim();
            }
            if(tensCount==1)
            {
                number = " "+ tees[temp]+number.trim();
            }
            if(tensCount==2)
            {
                number = ones[temp]+ " hundred and " +number.trim();
            }
            if(tensCount==3)
            {
                number =  ones[temp]+" thousand " + number.trim();
            }
            if(tensCount==4)
            {
                number = tees[temp]+ " " +  number.trim();
            }
            if(tensCount==5)
            {
                number = ones[temp]+" lakh "+ number.trim();
            }
            tensCount++;
            n=n/10;

        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(numToWords(66689));

    }
}
