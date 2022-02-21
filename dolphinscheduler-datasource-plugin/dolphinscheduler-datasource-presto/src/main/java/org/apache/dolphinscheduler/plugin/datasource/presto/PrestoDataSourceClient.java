package org.apache.dolphinscheduler.plugin.datasource.presto;

import org.apache.dolphinscheduler.plugin.datasource.api.client.CommonDataSourceClient;
import org.apache.dolphinscheduler.spi.datasource.BaseConnectionParam;
import org.apache.dolphinscheduler.spi.enums.DbType;

/**
 * @author cai
 * @date 2022/2/21 11:18
 */
public class PrestoDataSourceClient extends CommonDataSourceClient {

    public PrestoDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        super(baseConnectionParam, dbType);
    }
    
}
