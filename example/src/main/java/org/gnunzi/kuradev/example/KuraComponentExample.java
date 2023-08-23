package org.gnunzi.kuradev.example;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Map;

import org.eclipse.kura.KuraErrorCode;
import org.eclipse.kura.KuraException;
import org.eclipse.kura.cloudconnection.message.KuraMessage;
import org.eclipse.kura.cloudconnection.request.RequestHandler;
import org.eclipse.kura.cloudconnection.request.RequestHandlerContext;
import org.eclipse.kura.cloudconnection.request.RequestHandlerRegistry;
import org.eclipse.kura.configuration.ConfigurableComponent;
import org.eclipse.kura.message.KuraPayload;
import org.eclipse.kura.message.KuraRequestPayload;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The Service Component.
 */
@Component(immediate = true, //
        configurationPolicy = ConfigurationPolicy.REQUIRE//, //
        //property = "service.pid=com.beegy.shaun.service.configuration.ConfigurationServiceHandler"//
)
//@Designate(ocd = KuraComponentExampleConfig.class)
public class KuraComponentExample implements ConfigurableComponent {
    private static final Logger logger = LoggerFactory.getLogger(KuraComponentExample.class);
    private static final String SERVICE_NAME = "Configuration Service";
    private ComponentContext componentContext;

    @Activate
    protected void activate(ComponentContext componentContext, Map<String, Object> properties) {
        logger.info(MessageFormat.format("Activating {0}", KuraComponentExample.class));
        this.componentContext = componentContext;
    }

    @Deactivate
    protected void deactivate(ComponentContext componentContext) {
        logger.info(MessageFormat.format("Deactivating {0}", KuraComponentExample.class));
    }

    @Modified
    public void updated(Map<String, Object> properties) {
        logger.info(MessageFormat.format("Updating {0}", KuraComponentExample.class));
    }

}