import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            QueueLL<String> queue = new QueueLL<>();

            boolean kondisi = true;
            while (kondisi){
                menu();
                int check = scan.nextInt();
                scan.nextLine();
                switch (check){
                    case 1:
                        queue.enqueue(scan.nextLine());
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.printQueue();
                        break;
                    default:
                        kondisi = false;
                        break;
                }
            }

            queue.printQueue();
        }

        public static void menu() {
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Pekerjaan sudah selesai");
            System.out.println("3. Tampilkan pekerjaan");
            System.out.println("4. Keluar");
        }
}
