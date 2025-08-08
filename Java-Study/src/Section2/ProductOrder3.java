package Section2;

import  java.util.Scanner;

public class ProductOrder3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("상품 몇개를 입력하실 건가요?: ");
        int n = scanner.nextInt();
        Product[] arrayP = new Product[n];


        for(int i = 0; i<n; i++){
            scanner.nextLine();
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명을 입력하세요: ");
            String productName = scanner.nextLine();

            System.out.print("가격을 입력하세요: ");
            int price = scanner.nextInt();

            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            arrayP[i] = createOrder(productName,price,quantity);
        }

        printOrders(arrayP);
        System.out.println("총 가격은 "+genTotalAmount(arrayP)+"입니다.");
    }

    static Product createOrder(String productName, int price, int quantity){// ProductOrder 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 ProductOrder 반환
        Product p = new Product();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(Product[] orders){ //배열을 받아서 배열에 들어있는 전체 ProductOrder 의 상품명, 가격, 수량을 출력합니다.
        for (Product order : orders) {
            System.out.println("상품명: "+ order.productName + " 가격: " + order.price + " 수량: "+order.quantity);
        }
    }

    static int genTotalAmount(Product[] orders){
        int sum = 0;//배열을 받아서 배열에 들어있는 전체 ProductOrder 의 총 결제 금액을 계산하고, 계산 결과를 반환
        for (Product order : orders) {
            sum += (order.quantity * order.price);
        }
        return sum;
    }

}
