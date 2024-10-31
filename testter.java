
import java.util.Scanner;


 //DRIVER CLASS
public class testter {
    public static void main(String[] args) {

        int [] angka = {1, 2, 3};
        int [] angka2 = new int[5];
        angka[0] = 10;
        angka2[3] = 100;

        String [] nama = {"dicky", "risky", "wildan"};
        String [] nama2 = new String[10];


        //ARRAY OBJECT

        
        Scanner i = new Scanner(System.in);
        System.out.println("masukan length: ");
        int length = i.nextInt();
        product[] p = new product[length];
        //loop
        
        for (int j = 0; j < p.length; j++) {
            System.out.println(angka [j]);
            System.out.println("masukan number id: ");
            int number = i.nextInt();
            System.out.println("masukan name : ");
            i.nextLine();
            String name = i.nextLine();
            System.out.println("masukan quantity : ");
            int quantity = i.nextInt();
            System.out.println("masukan price : ");
            double price = i.nextDouble();
            p[j] = new product(number, name, quantity, price);
            p[j].print();
            cd[] c = new cd[5];
            c[4] = new cd(number,name, quantity,price, "",0,"");
        }






    }
}