package hibernate.sports.ex1.sports.ex1.web.listener;

import br.com.jarch.annotation.JArchJsfEventAfter;
import br.com.jarch.annotation.JArchJsfEventRestoreView;
import br.com.jarch.model.MultiTenant;
import br.com.jarch.model.UserInformation;
import br.com.jarch.util.BundleUtils;
import br.com.jarch.faces.util.JavaScriptUtils;

import javax.enterprise.event.Observes;
import javax.faces.event.PhaseEvent;
import javax.servlet.http.HttpSession;

public class SessionExpiredJsfListener {

    private void verifySessionExpired(@Observes @JArchJsfEventAfter @JArchJsfEventRestoreView PhaseEvent event) {

        boolean pageLogin = event.getFacesContext().getViewRoot().getViewId().contains("/login.xhtml");
        HttpSession session = ((HttpSession) event.getFacesContext().getExternalContext().getSession(false));

        if (pageLogin && session != null && session.isNew()) {
            event.getFacesContext().getExternalContext().getSession(true);
            showMessageLoginExpired();
        }

        if (pageLogin)
            return;

        if (session == null || session.isNew() || !UserInformation.getInstance().exists())
            showMessageSessionExpired();
    }

    private static void showMessageLoginExpired() {
        JavaScriptUtils.showMessageBodyErrorRedirect(getLoginPage(),
                BundleUtils.messageBundle("message.loginExpirado"),
                BundleUtils.messageBundle("message.tempoLoginExpirado"));
    }

    private static void showMessageSessionExpired() {
        JavaScriptUtils.showMessageBodyErrorRedirect(getLoginPage(),
                BundleUtils.messageBundle("message.sessaoExpirada"),
                BundleUtils.messageBundle("message.sessaoExpirada"));
    }

    private static String getLoginPage() {
        String result = "../login/login.jsf";

        if (MultiTenant.getInstance().exists())
            result += "?multiTenantId=" + MultiTenant.getInstance().get();

        return result;
    }
}