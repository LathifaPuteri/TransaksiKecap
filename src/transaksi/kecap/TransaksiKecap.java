/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi.kecap;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class TransaksiKecap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]kecap = {"kecap abc","kecap asin","kecap asem"};
        int[] harga = {5000,6000,7000};
        
        System.out.println("Selamat Datang Di Toko Kecap Kasih Ibu");
        System.out.println("List Kecap");
        
        //perulangan
        for (int i = 0; i <kecap.length; i++)
            System.out.println(i+". "+kecap[i]+" -> "+harga[i]);
       
        //scanner
        System.out.println("Silahkan masukkan nomor pilihan kecap");
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        
        System.out.println("Input Pilihan : "+kecap[pilihan]);
        
        //percabangan
        System.out.println("Silahkan masukkan uang anda");
        
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
            System.out.println("Kembalian "+(uang - harga[pilihan]));
    
        }else if (uang == harga[pilihan]){
            System.out.println("Uang anda pas, Silahkan menikmati makanan");
        }else{
            System.out.println("Uang anda kurang "+(harga[pilihan]-uang));
              
            }
    }
    
}
