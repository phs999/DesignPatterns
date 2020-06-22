package phs999.tank;
/**
 * 坦克开火策略接口,实现该接口的子类具体定义了坦克发射炮弹的策略
 * @author phs
 *
 */
public interface FireSrategy {
	void fire(Tank tank);
}
