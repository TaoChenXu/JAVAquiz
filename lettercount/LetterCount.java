package lettercount;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 * @author  陶晨旭
 * @version 创建时间：2018年11月30日 下午23:58:00
 * 3、统计一个文件Hamlet.txt中各个字母出现次数：
 * 	   例如A or a(1),B or b(2),C or c(3)......，括号内代表字符出现次数;

 */
public class LetterCount {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Hamlet.txt")));
        int[] count  = new int[26];
        int[] COUNT  = new int[26];

        char[] c = new char[1];
        int len = br.read(c);
        while(len!= -1) {

            if(c[0] <= 'Z' && c[0] >= 'A') {
                int number = c[0];
                COUNT[number - 65]++;
            }
            if(c[0] <= 'z' && c[0] >= 'a') {
                int number = c[0];
                count[number - 97]++;
            }
            len = br.read(c);
        }
        Print(count, COUNT);
        System.out.print("\n Hamlet.txt文件读取完毕！");
        br.close();

    }
    public static void Print(int[] count,int[] COUNT) {
        for(int i = 0;i < 26;i++) {
            if(count[i] > 0) {
                char lowerCase = (char)(i + 97);
                System.out.println(lowerCase+"("+ count[i] +")");
            }
            if(COUNT[i] > 0) {
                char upperCase = (char)(i + 65);
                System.out.println(upperCase+"("+ COUNT[i] +")");
            }
        }

    }


}
