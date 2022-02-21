import exatoster.WebConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private Logger logger = LogManager.getLogger(SpringWebInitializer.class);


    @Override
    protected Class<?>[] getRootConfigClasses() {
        logger.fatal("getting getRootConfigClasses");
        return new Class[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        logger.fatal("getting webconfig class");
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        logger.fatal("getting getServletMappings");
        return new String[] { "/" };
    }

}
