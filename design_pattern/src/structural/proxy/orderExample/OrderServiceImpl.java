package structural.proxy.orderExample;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring自行注入
        orderDao=new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return orderDao.insert(order);
    }
}
