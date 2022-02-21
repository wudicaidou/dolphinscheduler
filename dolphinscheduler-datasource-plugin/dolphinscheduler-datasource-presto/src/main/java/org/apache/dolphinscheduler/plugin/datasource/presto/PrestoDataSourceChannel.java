package org.apache.dolphinscheduler.plugin.datasource.presto;

import org.apache.dolphinscheduler.spi.datasource.BaseConnectionParam;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannel;
import org.apache.dolphinscheduler.spi.datasource.DataSourceClient;
import org.apache.dolphinscheduler.spi.enums.DbType;

/**
 * @author cai
 * @date 2022/2/21 11:20
 */
public class PrestoDataSourceChannel implements DataSourceChannel {

    @Override
    public DataSourceClient createDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        return new PrestoDataSourceClient(baseConnectionParam, dbType);
    }

}
