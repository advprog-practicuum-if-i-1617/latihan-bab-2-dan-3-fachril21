/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Fachril Zulfidar
 */
public class convert{
    public int[]angka = {0,1,2,3,4,5,6,7,8,9};
    public String[]huruf = {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public String[]satuan = {"belas","puluh","ratus"};
    boolean validasi = true;
    int result = 0;
    int finalResult = 0;
    List<String> allowedWord = Arrays.asList
    (
    "nol","satu","dua","tiga","empat","lima","enam","tujuh",
    "delapan","sembilan","sepuluh","sebelas",
    "seratus","ratus","seribu","puluh","belas"
    );
    
    public String convertAngka(int a){
        if (a==0){
            return "Nol";
        }
        if (a<=11){
            return huruf[a];
        }
        if (a>=12&&a<=19){
            return huruf[a%10]+" belas";
        }
        if (a>=20&&a<=99){
            return convertAngka(a/10)+" puluh "+huruf[a%10];
        }
        if (a==100){
            return "seratus";
        }
        if (a>=101&&a<=199){
            return "seratus "+convertAngka(a%100);
        }
        if (a>=200&&a<=999){
            return convertAngka(a/100)+" ratus "+convertAngka(a%100);
        }
        if(a==1000){
            return "seribu";
        }
        return "Inputan diluar range(Range hanya sampai 1000";
    }
    public int convertHuruf(String a){
    if(a != null && a.length()> 0){
        String[] pisah = a.split(" ");

        for(String word : pisah)
        {
            if(!allowedWord.contains(word))
            {
                validasi = false;
                System.out.println("Inputan diluar range(Range hanya sampai Seribu)");
                break;
            }
        }
        if(validasi)
        {
            for(String word : pisah)
            {
                if(word.equals("nol")) {
                     result += 0;
                }
                else if(word.equals("satu")) {
                     result += 1;
                }
                else if(word.equals("dua")) {
                     result += 2;
                }
                else if(word.equals("tiga")) {
                     result += 3;
                }
                else if(word.equals("empat")) {
                     result += 4;
                }
                else if(word.equals("lima")) {
                     result += 5;
                }
                else if(word.equals("enam")) {
                     result += 6;
                }
                else if(word.equals("tujuh")) {
                     result += 7;
                }
                else if(word.equals("delapan")) {
                     result += 8;
                }
                else if(word.equals("sembilan")) {
                    result += 9;
                }
                else if(word.equals("sepuluh")) {
                     result += 10;
                }
                else if(word.equals("sebelas")) {
                     result += 11;
                }
                else if(word.equals("belas")) {
                     result += 10;
                     finalResult += result;
                     result = 0;
                }
                else if(word.equals("puluh")){
                     result*=10;
                     finalResult+=result;
                     result = 0;
                }
                else if(word.equals("seratus")) {
                     finalResult = 100;
                }
                else if(word.equals("ratus")) {
                     result*=100;
                     finalResult+=result;
                     result = 0;
                }
                else if(word.equals("seribu")){
                    finalResult =1000;
                }
            }
            }
        }
        finalResult += result;
        result =0;
        return finalResult;    
    }
}
