package tugaspertemuan1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner B = new Scanner(System.in);
       int Pilihan;
        
       Scanner inputUser = new Scanner(System.in);
       System.out.println("Input Data=======");
       System.out.print("Nama   :");
       String nama = inputUser.nextLine();
       
       System.out.print("Nim    :");
       int nim = inputUser.nextInt();
       
       System.out.print("Usia   :");
       int usia = inputUser.nextInt();
     
       System.out.print("Nilai UTS  : ");
       int NilaiUTS = inputUser.nextInt();
       
       System.out.print("Nilai UAS  :");
       int NilaiUAS = inputUser.nextInt();
       
       Mahasiswa mahasiswa = new Mahasiswa(nama, nim, usia, NilaiUTS, NilaiUAS);
        System.out.println("");
        System.out.println("");
       
    do  
    {  
        System.out.println("Opsi=======");
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Edit data");
        System.out.println("3. Exit");
        System.out.println("Masukkan Pilihan : "); Pilihan = B.nextInt();
            switch(Pilihan)
            {
                case 1:
                    System.out.println("Perkenalkan nama saya " + mahasiswa.nama + " NIM " + mahasiswa.nim);
                    System.out.println("Usia : " + mahasiswa.usia);
                    System.out.println("Nilai Akhir  : " + mahasiswa.NilaiAkhir());
                    break;

                case 2:
                    System.out.println("=======Input Data=======");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Nama   :");
                    mahasiswa.nama = input.nextLine();

                    System.out.print("Nim    :");
                    mahasiswa.nim = input.nextInt();

                    System.out.print("Usia   :");
                    mahasiswa.usia = input.nextInt();

                    System.out.print("Nilai UTS  : ");
                    mahasiswa.NilaiUTS = input.nextInt();

                    System.out.print("Nilai UAS  :");
                    mahasiswa.NilaiUAS = input.nextInt();
                    break;
                    
                case 3:
                    break;
            }
    }while(Pilihan != 3);
    }
}
