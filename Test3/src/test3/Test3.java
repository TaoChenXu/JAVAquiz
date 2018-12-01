package test3;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException{
        String source = null;
        String key = "";

//输入一段话
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        source = reader.readLine();
        key = "a"; //待统计出现频度的词语

        int num = GetFrequency(source, key);

        System.out.println(key + " 在这段话中出现的频数为 " + num);
    }

    public static int GetFrequency(String source,String key){
        int i, j, count = 0;
        int len1 = source.length(); //这段话的长度
        int len2 = key.length(); //待统计词语的长度

        for(i = 0; i < len1 - len2; i++){
            for(j = 0; j < len2; j++){
                if(key.charAt(j) != source.charAt(j + i)){
                    break;
                }
            }
            if(j >= key.length()){
                count++;
            }
        }

        return count;
    }
}
