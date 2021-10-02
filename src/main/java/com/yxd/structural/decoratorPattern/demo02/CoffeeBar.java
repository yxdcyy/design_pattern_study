package com.yxd.structural.decoratorPattern.demo02;

public class CoffeeBar {
    public static void main(String[] args) {
        // 1. 点一份 LongBlack
        Drink order1 = new LongBlack();
        System.out.println("【LongBlack】 费用=" + order1.cost());
        System.out.println("【LongBlack】 描述=" + order1.getDes());
        System.out.println("============================================");

        // 2. 点一份 LongBlack + 牛奶
        Drink order2 = new Milk(order1);
        System.out.println("【LongBlack + 牛奶】 费用=" + order2.cost());
        System.out.println("【LongBlack + 牛奶】 描述=" + order2.getDes());
        System.out.println("============================================");

        // 3. 点一份 LongBlack + 牛奶 + 巧克力
        Drink order3 = new Chocolate(order2);
        System.out.println("【LongBlack + 牛奶 + 巧克力】 费用=" + order3.cost());
        System.out.println("【LongBlack + 牛奶 + 巧克力】 描述=" + order3.getDes());
        System.out.println("============================================");

        // 4. 点一份 LongBlack + 牛奶 + 巧克力 * 2
        Drink order4 = new Chocolate(order3);
        System.out.println("【LongBlack + 牛奶 + 巧克力*2】 费用=" + order4.cost());
        System.out.println("【LongBlack + 牛奶 + 巧克力*2】 描述=" + order4.getDes());
        System.out.println("============================================");
    }
}
