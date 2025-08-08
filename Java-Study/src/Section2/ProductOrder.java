package Section2;

public class ProductOrder {
    public static void main(String[] args) {
        Product p1 = createOrder("두부", 2000, 2);
        Product p2 = createOrder("김치", 5000, 1);
        Product p3 = createOrder("콜라", 1500, 2);
        Product[] arrayP = {p1, p2, p3};

        printOrders(arrayP);
        System.out.println(genTotalAmount(arrayP));
    }
    static Product createOrder(String productName, int price, int quantity){ // ProductOrder 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 ProductOrder 반환
        Product ex = new Product();
        ex.productName = productName;
        ex.price = price;
        ex.quantity = quantity;
        return ex;
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
