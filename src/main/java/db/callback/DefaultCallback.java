package db.callback;

import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.callback.FlywayCallback;
import org.flywaydb.core.internal.util.logging.Log;
import org.flywaydb.core.internal.util.logging.LogFactory;

import java.sql.Connection;

/**
 * Created by leibo on 2016/11/16.
 */
public class DefaultCallback implements FlywayCallback {

    /**
     * Use flyway maven plugin logger
     */
    private static Log logger = LogFactory.getLog(DefaultCallback.class);

    @Override
    public void beforeClean(Connection connection) {

    }

    @Override
    public void afterClean(Connection connection) {
        logger.info("clean completed!");
    }

    @Override
    public void beforeMigrate(Connection connection) {

    }

    @Override
    public void afterMigrate(Connection connection) {

    }

    @Override
    public void beforeEachMigrate(Connection connection, MigrationInfo migrationInfo) {

    }

    @Override
    public void afterEachMigrate(Connection connection, MigrationInfo migrationInfo) {

    }

    @Override
    public void beforeValidate(Connection connection) {

    }

    @Override
    public void afterValidate(Connection connection) {

    }

    @Override
    public void beforeBaseline(Connection connection) {

    }

    @Override
    public void afterBaseline(Connection connection) {

    }

    @Override
    public void beforeRepair(Connection connection) {

    }

    @Override
    public void afterRepair(Connection connection) {

    }

    @Override
    public void beforeInfo(Connection connection) {

    }

    @Override
    public void afterInfo(Connection connection) {

    }

}
