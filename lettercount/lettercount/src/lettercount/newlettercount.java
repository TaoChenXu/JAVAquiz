package lettercount;
/*
    2018.12.5.23：58
    陶晨旭 统计文件中各个字母的个数
 */


import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class newLetterCount {
    public static void main(String args[])throws Exception{
        File fileSrc=new File("hamlet.txt.");
        BufferedReader fin=new BufferedReader( new FileReader(fileSrc) );
        String line;
        Map<Character, Integer> counter= new HashMap<Character, Integer>();
        while( (line=fin.readLine())!=null){
            int len = line.length();
            for(int i=0; i<len; i++){
                char c=line.charAt(i);
                if(!( ((c>='A' && c<='Z') || (c>='a' && c<='z') ) ){
                    continue;
                }
                if(counter.containsKey(c)){
                    counter.put(c, counter.get(c)+1);
                }else{
                    counter.put(c, 1);
                }
            }
        }
        fin.close();

        for(Iterator<Character> it=counter.keySet().iterator(); it.hasNext(); ){
            char key=it.next();
            int count=counter.get(key);
            System.out.println(key+" "+count);
        }
    }
}
