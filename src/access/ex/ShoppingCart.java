package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    // 코드 완성
    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    // 외부에서 계산해도 되지만 메서드로 제공하면 외부에서는 단순히 이 메서드를 호출하면 된다.
    // 이 메서드의 핵심은 자신이 가진 데이터를 사용한다는 점이다.
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
