package org.example.BaiTap2;

public class OrderService {
    public void ApplyDiscount(Customer customer, Order order)
    {
        if (customer.CustomerType.equals("A"))
        {
            order.Amount = order.Amount - ((order.Amount * 10) / 100);
        }
        else if (customer.CustomerType.equals("B"))
        {
            order.Amount = order.Amount - ((order.Amount * 20) / 100);
        }
    }

}
