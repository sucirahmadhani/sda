package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kyu {
    public static void main(String[] args) {
        int i=0;
        boolean bool = true;
        String nama;

        try (Scanner pilih = new Scanner(System.in)) {
            try (Scanner nama1 = new Scanner(System.in)) {
                Queue<String> antrian = new LinkedList<>();
   
                System.out.println("\n================================");
                System.out.println(" \tANTRIAN STASIUN ");
                System.out.println("================================");
                
                do{
                    System.out.println("1. Jumlah Tiket");
                    System.out.println("2. Tampilkan Penumpang");
                    System.out.println("3. Penumpang Pertama ");
                    System.out.println("4. Pemanggilan Penumpang");
                    System.out.println("5. Apakah Penumpang Telah Habis?");
                    System.out.println("6. Selesai");
                    System.out.println("MASUKKAN PILIHAN [1-6]: ");
                    int input= pilih.nextInt();
                    switch(input){
                        case 1:
                        System.out.println("Masukkan Jumlah Tiket Yang Akan Dipesan");
                        i=0;
                        int h=pilih.nextInt();
                        do{
                            System.out.println("Masukkan Nama Penumpang: ");
                            nama= nama1.nextLine();
                            antrian.add(nama);
                            i++;
                        }
                        while(i<h);
                        System.out.println("Queue: "+antrian);
                        System.out.println("");
                        break;

                        case 2:
                        System.out.println("Nama Penumpang : "+antrian);
                        System.out.println("");
                        break;

                        case 3:
                        System.out.println("Penumpang Pertama : "+antrian.peek());
                        System.out.println("");
                        break;

                        case 4:
                        System.out.println("Penumpang "+antrian.peek()+" Silakan Memasuki Gerbong");
                        antrian.poll();
                        System.out.println("");
                        break;

                        case 5:
                        System.out.println("Apakah Penumpang Telah Habis? "+antrian.isEmpty());
                        System.out.println("");
                        break;

                        case 6:
                        System.exit(0);
                        break;

                        default:
                        System.err.println("Pilihan Tidak Tersedia!");
                        System.out.println("");
                        

                    }

                    


                }
                while(bool);
            }
        }
    }
}
