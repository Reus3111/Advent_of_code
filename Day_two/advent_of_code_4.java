package Day_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class advent_of_code_4 {

    public int convert_to_int(char[] stringa) {
        int sum = 0;
        if(stringa[1]==' '){
            sum+=stringa[0]-'0';
            return sum;
        }
        sum += (stringa[0]-'0') * 10;
        sum += stringa[1]-'0';
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        char[] data;
        char[] ris = new char[100];
        int n = 0;
        int c = 0;
        int tot = 0;
        int maxr=0;
        int maxg=0;
        int maxb=0;
        boolean flag = true;
        boolean entrato = false;
        advent_of_code_3 user = new advent_of_code_3();
        int day=0;
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String lol = myReader.nextLine();
            data = lol.toCharArray();
            day++;
            flag = true;
            maxr=0;
            maxg=0;
            maxb=0;
            for (int i = 8; i < data.length && flag; i++) {
                entrato = false;
                c = 0;
                ris[2] = ' ';
                ris[1] = ' ';
                ris[0] = ' ';
                //System.out.println(data[i]);
                while (data[i] <= '9' && data[i] >= '0') {
                    ris[c] = data[i];
                    i++;
                    c++;
                    entrato = true;
                }
                if(entrato){
                    i++;
                    if (data[i] == 'r') {
                        n = user.convert_to_int(ris);
                        if(n>maxr)
                        {
                            maxr=n;
                        }
                        //System.out.println(n + " red");
                    } else if (data[i] == 'g') {
                        n = user.convert_to_int(ris);
                        if(n>maxg)
                        {
                            maxg=n;
                        }
                        //System.out.println(n + " green");

                    } else if (data[i] == 'b' ) {
                        n = user.convert_to_int(ris);
                        if(n>maxb)
                        {
                            maxb=n;
                        }

                    }
                }


            }
            if (flag) {
                //System.out.println("day: " + day);
                tot += maxb*maxr*maxg;
            }
        }
        System.out.println(tot);
        myReader.close();
    }
}
