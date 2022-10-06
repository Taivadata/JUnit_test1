package org.example.BaiTap2;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    @Test
    public void TestGiaTriTrucTiep(){ //Test bang gia tri trưc tiep
    Customer c = new Customer();
    Order o = new Order();
    OrderService os = new OrderService();

    o.Amount = 100; //giá tiền của sản phẩm
    c.CustomerType = "A"; //loại khách hàng
    o.ProductQuantity = 3; //Số lượng sản phẩm
    int expect = 270; //giá trị mong đợi

    o.Amount();     // Giá tiền x Số lượng
    os.ApplyDiscount(c, o);     //Áp dụng giảm giá cho loại khách hàng
    // 100 x 3 = 300. Giảm 10% còn 270
    assertEquals(expect, o.Amount);
    }

    @Test
    public void TestGiaTriTuFile(){ //Test bang gia tri từ file
        Customer c = new Customer();
        Order o = new Order();
        OrderService os = new OrderService();
        Scanner sc;
        String url = "src/main/resources/data1.csv";
        try{
            FileInputStream fi = new FileInputStream(url);
            sc = new Scanner(fi);
            while(sc.hasNextLine()){
                o.Amount = Integer.parseInt(sc.nextLine()); //giá tiền của sản phẩm
                c.CustomerType = sc.nextLine(); //loại khách hàng
                o.ProductQuantity = Integer.parseInt(sc.nextLine());//Số lượng sản phẩm
                o.Amount(); // Giá tiền x Số lượng
                os.ApplyDiscount(c, o); //Áp dụng giảm giá cho loại khách hàng
                int expect = 240;//giá trị mong đợi
                assertEquals(expect, o.Amount);// 100 x 3 = 300. Giảm 20% còn 240
            }
            sc.close();
            fi.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}
