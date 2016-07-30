package com.wjliuh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MyMain{

    public static int get(int year)
    {
        int num=1;    //The initial sheep number

        for(int i=1; i<=year; i++){
            if(i==2){
                num+=get(year-2);
            }else if(i==4){
                num+=get(year-4);
            }else if(i==5){
                num--;    
            }
        }
        
        return num;
    }
    
    public static void main(String[] args) throws Exception {
        String line1="";
        String line2="";
        for(int i=1;i<=50;i++){
            line1+="第"+i+"年"+"    ";
            line2+=get(i)+"    ";
        }
        System.out.println(line1);
        System.out.println(line2);
        String javahome = System.getProperty("java.home");
        InputStream is = new FileInputStream(javahome+File.separator+"lib\\security\\cacerts");
        System.getProperties().list(System.out);
    }
}