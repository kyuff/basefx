package dk.kyuff.basefx.github;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.ws.rs.client.Client;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 16.26
 */
public class GithubClientProducer {

    @Produces
    @Singleton
    Client createClient() {
        Client client = ResteasyClientBuilder.newBuilder().build();
        client.register(new HeaderRequestFilter("User-Agent", "JavaFX Github Client"));
        return client;
    }

    @Produces
    GithubClient createGithubClient(Client client) {
        ResteasyWebTarget target = (ResteasyWebTarget) client.target("https://api.github.com");
        return target.proxy(GithubClient.class);
    }

}
