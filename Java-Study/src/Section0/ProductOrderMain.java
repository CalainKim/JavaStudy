package Section0;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder P1 = new ProductOrder();
        P1.price = 2000;
        P1.quantity = 2;
        P1.productName = "두부";
        ProductOrder P2 = new ProductOrder();
        P2.price = 5000;
        P2.quantity = 1;
        P2.productName = "김치";
        ProductOrder P3 = new ProductOrder();
        P3.price = 1500;
        P3.quantity = 2;
        P3.productName = "콜라";

        ProductOrder[] P = new ProductOrder[3];
        P[0] = P1;
        P[1] = P2;
        P[2] = P3;
        int sum = 0;
        // ProductOrder[] P = {P1,P2,P3}; 이렇게 해도 됨
        for (ProductOrder productOrder : P) {
            if(productOrder.quantity > 1){
                sum += productOrder.quantity * productOrder.price;
            }
            else{
                sum += productOrder.price;
            }
            System.out.println("상품명: "+productOrder.productName+", 가격: "+productOrder.price+", 수량: "+productOrder.quantity);
        }
        System.out.print("총 결제 금액: "+sum);
    }
}
