/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belanja;

import java.util.Scanner;
public class Belanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBarang ;
        int hargaBarang,jumlahBarang,total = 0,bayar,kembalian;
        double hargaAkhir;
        
        System.out.print("Masukan Nama Barang : ");
        namaBarang = input.next();
        System.out.print("Masukan Harga Barang : ");
        hargaBarang = input.nextInt();
        System.out.print("Masukan Jumlah Barang : ");
        jumlahBarang = input.nextInt();
        
        total = jumlahBarang*hargaBarang;
        System.out.println("Total Belanjaan Anda Sebesar = " + total);
        System.out.print("Masukan Jumlah Pembayaran =  ");
        bayar = input.nextInt();
        if(bayar < total){
            System.out.println("Maaf Uang Anda Kurang");
        System.out.print("Silahkan Masukan Ulang Pembayaran = ");
            bayar = input.nextInt();
        }else{
            System.out.println("Terima Kasih Sudah Berbelanja");
        }
        
        kembalian = bayar - total;
        System.out.println("Kembalian Anda  = " + kembalian);
        
        if(kembalian <= 0){
            System.out.println("Terima Kasih Sudah Berbelanja");
        }
        
    }
    
}
