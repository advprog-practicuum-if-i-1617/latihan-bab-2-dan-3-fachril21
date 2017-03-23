/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ridho
 */
import java.util.Scanner;
public class MainConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b;
        System.out.print("Masukkan Angka (0-1000) : ");
        int a = in.nextInt();
        System.out.println(new convert().convertAngka(a));
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
        System.out.print("Masukkan Bilangan (tulisan kecil semua) : ");
        in.nextLine();
        b = in.nextLine();
        System.out.println(new convert().convertHuruf(b));
    }
}
