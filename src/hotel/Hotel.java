/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author pd-39
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int type, hari;
        int harga;
        
        Scanner scan = new Scanner(System.in);
        Scanner jawab = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Selamat Datang Di Hotel RedDoors");
        System.out.println("Kami Mempunyai 3 Tipe Kamar :");
        System.out.println("--------------------------------------");
        System.out.println("1. Superior Rp.250.000/hari");
        System.out.println("2. Deluxe Rp.500.000/hari");
        System.out.println("3. Premium Rp.750.000/hari");
        System.out.println("--------------------------------------");
        System.out.print("Type Kamar Pilihan Anda :");
        type = scan.nextInt();
        System.out.print("Untuk Berapa Hari : ");
        hari = jawab.nextInt();
        if(type == 1){
            System.out.println("Anda Memlih Type Kamar Superior");
            System.out.println("Harga : Rp.250.000/hari Selama : " + hari + " hari");
            harga = 250000;
            System.out.println("Total Biaya Yang Harus Anda Bayar : Rp." + harga*hari);
        } else if(type == 2){
            System.out.println("Anda Memlih Type Kamar Deluxe");
            System.out.println("Harga : Rp.500.000/hari Selama : " + hari + " hari");
            harga = 500000;
            System.out.println("Total Biaya Yang Harus Anda Bayar : Rp." + harga*hari);
        } else{
            System.out.println("Anda Memlih Type Kamar Premium");
            System.out.println("Harga : Rp.750.000/hari Selama : " + hari + " hari");
            harga = 750000;
            System.out.println("Total Biaya Yang Harus Anda Bayar : Rp." + harga*hari);
        }
    }
}
