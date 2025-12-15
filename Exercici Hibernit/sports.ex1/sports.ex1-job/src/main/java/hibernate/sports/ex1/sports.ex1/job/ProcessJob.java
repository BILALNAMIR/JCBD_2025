package hibernate.sports.ex1.sports.ex1.job;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Singleton
@Startup
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ProcessJob {

    @Schedule(hour = "1", persistent = false)
    public void process() {
//    	LogUtils.warning("INICIO - Processando o Tenant " + idMultTenant);
        // execute your action
//        LogUtils.warning("FIM - Processando o Tenant "+idMultTenant);
    }
}
