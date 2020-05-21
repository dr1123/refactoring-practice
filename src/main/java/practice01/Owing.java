package practice01;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Owing {
    private static final double TAZ_RAZ = 0.1;
    private Vector orders;
    private String name;

    public Owing(Vector<Order> orders, String name) {
        this.orders = orders;
        this.name = name;
    }

    public String printOwing() {
        StringBuilder result = new StringBuilder();
        result.append(printBanner());
        result.append(printDetail());
        return result.toString();
    }

    private String printDetail() {
        StringBuilder result = new StringBuilder();
        double amount = getAmount();
        result.append("name:" + name);
        result.append("total:" + String.format("%.2f", amount * (1 + TAZ_RAZ)));
        result.append("date:" + new Date());
        return result.toString();
    }

    private double getAmount() {
        double amount = 0.0;
        Enumeration e = orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            amount += each.getAmount();
        }
        return amount;
    }

    private String  printBanner() {
        StringBuilder banner = new StringBuilder();
        banner.append("**************************");
        banner.append("***** Customer Owes ******");
        banner.append("**************************");
        return banner.toString();
    }
}
