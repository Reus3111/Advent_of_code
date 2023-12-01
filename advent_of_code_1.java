import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class advent_of_code_1 {


    public static void main(String[] args) throws FileNotFoundException {
        int[] buf = new int[20];
        char[] data;
        int c=0;
        int sum=0;
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String lol = myReader.nextLine();
            data = lol.toCharArray();
            c=0;
            for (char datum : data) {
                if (datum <= '9' && datum >= '0') {
                    buf[c] = datum - '0';
                    c++;
                }
            }
            for(int i=0;i<c;i++)
            {
                if(i==0)
                {
                    sum+=buf[i]*10;
                    //System.out.println(sum);
                    //System.out.println(buf[i]);
                }
                if(i==c-1)
                {
                    sum+=buf[i];
                    //System.out.println(sum);
                    //System.out.println(buf[i]);
                }

            }

        }
        System.out.println(sum);
        myReader.close();
    }
}
