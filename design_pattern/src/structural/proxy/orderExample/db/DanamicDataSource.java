package structural.proxy.orderExample.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DanamicDataSource extends AbstractRoutingDataSource {

    /**
     * 返回当前线程对应的db
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
