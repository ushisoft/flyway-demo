package db.migration;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by leibo on 2016/11/16.
 */
public class V1_4__add_person implements SpringJdbcMigration {

    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        jdbcTemplate.execute("insert into PERSON (ID, NAME) values (8, 'Mr. Foo@1.4');");
    }
}
