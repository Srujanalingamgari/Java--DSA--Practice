/**
 * Determines whether using a coupon is beneficial.
 * Compares total price with discounted price plus coupon cost.
 */
public class CouponDecision {

    public static String checkCoupon(int[] prices, int couponCost, int discount) {
        int totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }

        int discountedTotal = 0;
        for (int price : prices) {
            discountedTotal += Math.max(0, price - discount);
        }

        if (couponCost + discountedTotal < totalPrice) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int couponCost = 50;
        int discount = 30;

        System.out.println(checkCoupon(prices, couponCost, discount));
    }
}
