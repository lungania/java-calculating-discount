import java.util.Scanner;

public class PriceDiscounts extends Users {
    public PriceDiscounts(String username, String password) {
        super(username, password);
    }

    public static void main(String[] args) {
        String[] names, prices;
        Scanner chukua;
        String  name;
        double price,amount = 0, discountamount = 0;
        int discount=0;
        names = new String[5];
        prices = new String[5];
        chukua = new Scanner(System.in);

        PriceDiscounts user1 = new PriceDiscounts("","");
        boolean valid;

        System.out.println("Enter username and password");
        if (chukua.hasNextLine()){
            user1.username=chukua.nextLine();
            user1.password=chukua.nextLine();
            valid=true;
        }else {
            System.out.println("Please input correct data ");
            valid=false;
        }


            for (int i = 0; i < 5; i++) {
                System.out.println("Enter item's name");
                names[i] = chukua.next();
                System.out.println("Enter item's price");
                price = chukua.nextDouble();
                prices[i] = String.valueOf(price);


                if (price > 4000 && price < 5001) {
                    discount = 500;

                } else if (price > 3000 && price < 4001) {
                    discount = 400;

                } else if (price > 2000 && price < 3001) {
                    discount = 300;

                } else if (price > 1000 && price < 2001) {
                    discount = 200;

                } else if (price > 0 && price < 1001) {
                    discount = 100;

                } else {
                    System.out.println("price does not exist");
                }
                price=price-discount;
                amount = amount + price;
              discountamount=discountamount + discount;
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(names[i] + ": " + prices[i]);
            }
            System.out.println("Total amount: " + amount);
            System.out.println("Discounted amount: " + discountamount);
        }
    }


