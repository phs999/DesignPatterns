package behavioral.state;
//抽象状态类
public abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);//存款
    public abstract void withdraw(double amount);//取款
    public abstract void computeInterest();//计算利息
    public abstract void stateCheck();//检查和切换状态
}