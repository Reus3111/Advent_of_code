package Day_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class advent_of_code_3 {

    public int convert_to_int(char[] stringa) {
        int sum = 0;
        sum += stringa[0] * 10;
        sum += stringa[1];
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        char[] data;
        char[] ris = new char[100];
        int n = 0;
        int c = 0;
        int tot = 0;
        boolean flag = true;
        advent_of_code_3 user = new advent_of_code_3();
        int day=0;
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String lol = myReader.nextLine();
            data = lol.toCharArray();
            day++;
            for (int i = 8; i < data.length && flag; i++) {
                c = 0;
                ris[2] = 0;
                while (data[i] <= '9' && data[i] >= '0') {
                    ris[c] = data[i];
                    i++;
                    c++;
                }
                i++;
                if (data[i] == 'r') {
                    n = user.convert_to_int(ris);
                    if (n > 12 || ris[2] != '0') {
                        flag = false;
                    }
                } else if (data[i] == 'g' && flag) {
                    n = user.convert_to_int(ris);
                    if (n > 13 || ris[2] != '0') {
                        flag = false;
                    }
                } else if (data[i] == 'b' && flag) {
                    n = user.convert_to_int(ris);
                    if (n > 14 || ris[2] != '0') {
                        flag = false;
                    }
                }

            }
            if (flag) {
                tot += day;
            }
        }
        System.out.println(tot);
    }
}
