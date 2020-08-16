package structural.proxy.orderExample.dynamicproxy;

import structural.proxy.orderExample.IOrderService;
import structural.proxy.orderExample.Order;
import structural.proxy.orderExample.OrderServiceImpl;
import structural.proxy.orderExample.staticproxy.OrderServiceStaticProxy;

public class Test {
    public static void main(String[] args) {
        Order order= new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy= (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
