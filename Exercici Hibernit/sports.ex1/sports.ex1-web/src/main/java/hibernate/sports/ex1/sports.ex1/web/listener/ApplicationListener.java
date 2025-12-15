package hibernate.sports.ex1.sports.ex1.web.listener;

import br.com.jarch.util.LogUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Locale;

@WebListener
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LogUtils.warning("START APPLICATION");
        Locale.setDefault(new Locale("pt", "BR"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LogUtils.warning("END APPLICATION");
    }
}
