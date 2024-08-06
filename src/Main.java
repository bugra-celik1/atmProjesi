import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     String userName,password;
     int balance = 1500;
     int right = 3;
     int select;
     Scanner inp = new Scanner(System.in);

     while(right > 0) {
         System.out.print("Kullanıcı adı:");
         userName = inp.nextLine();
         System.out.print("Şifre:");
         password = inp.nextLine();

         if (userName.equals("patika") && password.equals("dev123")) {
             System.out.println("Merhaba bankaya hoşgeldiniz..");


             do {
                 System.out.println("1-)Para yatırma\n" +
                         "2-)Para çekme\n" +
                         "3-)Bakiye sorgula\n" +
                         "4-)Çıkış yap");
                 System.out.print("Lütfen yapmak istediğiniz işlemi giriniz:");
                 select = inp.nextInt();

                 switch(select) {
                     case 1:
                         System.out.print("Para miktarını giriniz:");
                         int price = inp.nextInt();
                         balance += price;
                         break;
                     case 2:
                         System.out.print("Para miktarını giriniz:");
                         int price2 = inp.nextInt();
                         if (price2 > balance) {
                             System.out.println("Bakiyeniz yetersiz");
                         } else {
                             balance -= price2;
                         }
                         break;
                     case 3:
                         System.out.println("Bakiyeniz:" + balance);
                      break;
                 }
             } while (select != 4);
             System.out.println("Tekrar görüşmek üzere..");
             break;
         }else{
             right--;
             System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz.");
             if(right == 0){
                 System.out.println("Hesabınız bloke olmuştur .Lütfen bankayla iletişime geçiniz..");
             }else{
                 System.out.println("Kalan hakkınız:" +right);
             }
         }
     }
    }
}