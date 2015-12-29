import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class MainClass {

    public static void main(String[] args) {
        // access to the core api
        Vertx vertx = Vertx.vertx();

        // set option by default
        DeploymentOptions opt = new DeploymentOptions().setInstances(4);

        vertx.deployVerticle("VerticleDeploy", opt);

    }

}
