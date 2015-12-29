import io.vertx.core.AbstractVerticle;

public class VerticleDeploy extends AbstractVerticle {

    @Override
    public void start() throws InterruptedException {

        System.out.println("SingletonClass.getId() = " + SingletonClass.getId());
    }
}
