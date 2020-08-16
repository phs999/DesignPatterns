package structural.proxy.orderExample.staticproxy;

import structural.proxy.orderExample.IOrderService;
import structural.proxy.orderExample.Order;
import structural.proxy.orderExample.OrderServiceImpl;
import structural.proxy.orderExample.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService orderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        orderService=new OrderServiceImpl();
        int result=orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        System.out.println("静态代理 before code ");
        int userId=order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 [db "+dbRouter+"] 处理数据");
        // TODO: 设置dataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("静态代理 after code ");
    }
}
