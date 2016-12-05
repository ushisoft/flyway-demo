package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by leibo on 2016/11/16.
 */
public class V1_3__add_person implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {

        PreparedStatement statement =
                connection.prepareStatement("insert into PERSON (ID, NAME) values (7, 'Axel@1.3');");

        try {
            statement.execute();
        } finally {
            statement.close();
        }
    }
}
