/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6dynamicprogramming;

import java.util.Scanner;


/**
 *
 * @author PC
 */
public class Tugas2 {
     private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);
    }
public static void main(String[] args){
           // TODO code application logic here
    String identitas = "Chatlea Cinta Putri Widyanto / XRPL5 / 08";
    tampilJudul(identitas);
    
    Scanner baca = new Scanner(System.in);
        String jenisbarang[] = new String[]{"A", "B", "C", "D", "E"}; 
        int berat[] = new int[]{4, 5, 2, 3, 7};
        int bayaran[] = new int[]{5000, 7000, 2000, 3000, 10000};
        int harga;
        int total = 0;
        int jumlah;
        System.out.print("Masukkan berat : ");
        int beratmuatan = baca.nextInt();
        
               
             for(int i = 0; i < jenisbarang.length; i++){
        if( beratmuatan >= berat [i]){
            jumlah = beratmuatan / berat[i];
            beratmuatan = beratmuatan % berat[i];
            harga = jumlah * bayaran[i];
            total += harga;
            System.out.println("Barang " + jenisbarang[i] + " sebanyak " + jumlah);
            System.out.println("Bayaran : Rp " + harga);           
}
}
             System.out.println("Total bayaran : Rp " + total);
}
}