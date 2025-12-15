package hibernate.sports.ex1.sports.ex1.client.flyway;

//import org.flywaydb.core.Flyway;

//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
//import javax.sql.DataSource;

@Startup
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class FlywaySetupEjb {

//    @Resource(lookup = "java:/ds/flyway")
//    private DataSource dataSourceStructure;

//    @PostConstruct
//    public void init() {
//        Flyway
//            .configure()
//            .cleanDisabled(true)
//            .dataSource(dataSourceStructure)
//            .schemas("SCHEMA")
//            .table("TB_FLYWAYSTRUCTURE")
//            .outOfOrder(true)
//            .locations("db/migration")
//            .baselineOnMigrate(true)
//            .load()
//            .migrate();
//    }
}