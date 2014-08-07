package dk.kyuff.basefx.core;

import javafx.fxml.FXMLLoader;
import javafx.util.Callback;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.nio.charset.StandardCharsets;

/**
 * User: swi
 * Date: 07/08/14
 * Time: 21.44
 */
public class FXMLLoaderProducer {

    @Inject
    Instance<Object> instance;

    @Produces
    public FXMLLoader createLoader() {
        Callback<Class<?>, Object> controllerFactory = param -> {
            System.out.println("Creating : " + param.getTypeName());
            return instance.select(param).get();
        };
        return new FXMLLoader(null, null, null, controllerFactory, StandardCharsets.UTF_8);
    }
}
