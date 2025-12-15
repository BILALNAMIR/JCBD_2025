package hibernate.sports.ex1.sports.ex1.web.delegate;

import br.com.jarch.model.MultiTenant;
import br.com.jarch.model.UserInformation;
import br.com.jarch.model.UserSystem;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.enterprise.inject.spi.CDI;

public abstract class BaseDelegate implements JavaDelegate {

    private DelegateExecution delegateExecution;

    public abstract void processamento(DelegateExecution delegateExecution) throws Exception;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        this.delegateExecution = delegateExecution;
        contextoInicial("" + delegateExecution.getVariable("idMultiTenant"));
        processamento(delegateExecution);
    }

    private void contextoInicial(String idMultitenant) throws Exception {
        contextoInicial(Long.parseLong(idMultitenant));
    }

    private void contextoInicial(Long idMultitenant) throws Exception {
        MultiTenant multiTenant = CDI.current().select(MultiTenant.class).get();
        UserInformation userInformation = CDI.current().select(UserInformation.class).get();

        multiTenant.set(idMultitenant);

        if (!userInformation.exists()) {
            userInformation.set(new UserSystem());
        }
    }
}