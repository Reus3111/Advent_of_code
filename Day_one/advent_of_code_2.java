package Day_one;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class advent_of_code_2 {


    public static void main(String[] args) throws FileNotFoundException {
        int[] buf = new int[20];
        char[] data;
        boolean flag=true;
        int c=0;
        int sum=0;
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            flag=true;
            String lol = myReader.nextLine();
            data = lol.toCharArray();
            for (int i=0;i<data.length&&flag;i++) {
                if(data[i]>='0'&&data[i]<='9')
                {
                    //ho trovato la prima cifra
                    buf[0]=data[i]-'0';
                    flag=false;
                }
                if(data.length-i>2&&data[i]=='o'&&data[i+1]=='n'&&data[i+2]=='e')
                {
                    buf[0]=1;
                    flag=false;
                }
                if(data.length-i>2&&data[i]=='t'&&data[i+1]=='w'&&data[i+2]=='o')
                {
                    buf[0]=2;
                    flag=false;
                }
                if(data.length-i>4&&data[i]=='t'&&data[i+1]=='h'&&data[i+2]=='r'&&data[i+3]=='e'&&data[i+4]=='e')
                {
                    buf[0]=3;
                    flag=false;
                }
                if(data.length-i>3&&data[i]=='f'&&data[i+1]=='o'&&data[i+2]=='u'&&data[i+3]=='r')
                {
                    buf[0]=4;
                    flag=false;
                }
                if(data.length-i>3&&data[i]=='f'&&data[i+1]=='i'&&data[i+2]=='v'&&data[i+3]=='e')
                {
                    buf[0]=5;
                    flag=false;
                }
                if(data.length-i>2&&data[i]=='s'&&data[i+1]=='i'&&data[i+2]=='x')
                {
                    buf[0]=6;
                    flag=false;
                }
                if(data.length-i>4&&data[i]=='s'&&data[i+1]=='e'&&data[i+2]=='v'&&data[i+3]=='e'&&data[i+4]=='n')
                {
                    buf[0]=7;
                    flag=false;
                }
                if(data.length-i>4&&data[i]=='e'&&data[i+1]=='i'&&data[i+2]=='g'&&data[i+3]=='h'&&data[i+4]=='t')
                {
                    buf[0]=8;
                    flag=false;
                }
                if(data.length-i>3&&data[i]=='n'&&data[i+1]=='i'&&data[i+2]=='n'&&data[i+3]=='e')
                {
                    buf[0]=9;
                    flag=false;
                }
            }
            flag=true;
            for (int i= data.length-1;i>=0&&flag;i--) {
                if(data[i]>='0'&&data[i]<='9')
                {
                    //ho trovato la seconda cifra
                    buf[1]=data[i]-'0';
                    flag=false;
                }
                if(i>=2&&data[i-2]=='o'&&data[i-1]=='n'&&data[i]=='e')
                {
                    buf[1]=1;
                    flag=false;
                }
                if(i>=2&&data[i-2]=='t'&&data[i-1]=='w'&&data[i]=='o')
                {
                    buf[1]=2;
                    flag=false;
                }
                if(i>=4&&data[i-4]=='t'&&data[i-3]=='h'&&data[i-2]=='r'&&data[i-1]=='e'&&data[i]=='e')
                {
                    buf[1]=3;
                    flag=false;
                }
                if(i>=3&&data[i-3]=='f'&&data[i-2]=='o'&&data[i-1]=='u'&&data[i]=='r')
                {
                    buf[1]=4;
                    flag=false;
                }
                if(i>=3&&data[i-3]=='f'&&data[i-2]=='i'&&data[i-1]=='v'&&data[i]=='e')
                {
                    buf[1]=5;
                    flag=false;
                }
                if(i>=2&&data[i-2]=='s'&&data[i-1]=='i'&&data[i]=='x')
                {
                    buf[1]=6;
                    flag=false;
                }
                if(i>=4&&data[i-4]=='s'&&data[i-3]=='e'&&data[i-2]=='v'&&data[i-1]=='e'&&data[i]=='n')
                {
                    buf[1]=7;
                    flag=false;
                }
                if(i>=4&&data[i-4]=='e'&&data[i-3]=='i'&&data[i-2]=='g'&&data[i-1]=='h'&&data[i]=='t')
                {
                    buf[1]=8;
                    flag=false;
                }
                if(i>=3&&data[i-3]=='n'&&data[i-2]=='i'&&data[i-1]=='n'&&data[i]=='e')
                {
                    buf[1]=9;
                    flag=false;
                }
            }
            for(int i=0;i<=1;i++)
            {
                if(i==0)
                {
                    sum+=buf[i]*10;
                    //System.out.println(buf[i]);
                    //System.out.println(sum);
                }
                if(i==1)
                {
                    sum+=buf[1];
                    //System.out.println(buf[i]);
                    //System.out.println(sum);
                }

            }

        }
        System.out.println(sum);
        myReader.close();
    }
}
