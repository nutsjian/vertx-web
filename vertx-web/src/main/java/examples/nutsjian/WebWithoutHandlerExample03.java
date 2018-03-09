package examples.nutsjian;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

public class WebWithoutHandlerExample03 {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    HttpServer server = vertx.createHttpServer();
    Router router = Router.router(vertx);
    server.requestHandler(router::accept).listen(8080);
  }

}
