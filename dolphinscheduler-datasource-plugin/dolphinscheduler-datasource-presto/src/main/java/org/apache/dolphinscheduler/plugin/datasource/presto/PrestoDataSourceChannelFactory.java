package org.apache.dolphinscheduler.plugin.datasource.presto;

import com.google.auto.service.AutoService;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannel;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannelFactory;

/**
 * @author cai
 * @date 2022/2/21 11:19
 */
@AutoService(DataSourceChannelFactory.class)
public class PrestoDataSourceChannelFactory implements DataSourceChannelFactory {

    @Override
    public String getName() {
        return "presto";
    }

    @Override
    public DataSourceChannel create() {
        return new PrestoDataSourceChannel();
    }

}
