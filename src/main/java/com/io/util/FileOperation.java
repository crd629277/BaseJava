package com.io.util;

import java.io.*;

/**
 * Created by Chen on 2015/3/28.
 */
public class FileOperation {

    public static void main(String args[]) throws IOException {
        String source = "D:\\project\\temp\\text.txt";
        String destination  = "D:\\project\\temp\\destination.txt";

        copyFile(source, destination);
    }


    public static void copyFile(String source, String destination) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(source)), "GBK");

//        int ch = 0;
//        while ((ch = inputStreamReader.read()) != -1) {
//            System.out.print((char) ch);
//        }
//
//
//        FileReader fileReader = new FileReader(source);
//        while ((ch = fileReader.read()) != -1 ) {
//            System.out.print((char) ch);
//        }


        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination));

        String data = null;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
