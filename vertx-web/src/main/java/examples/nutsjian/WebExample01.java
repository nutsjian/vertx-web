package examples.nutsjian;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

public class WebExample01 extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    HttpServer server = vertx.createHttpServer();

    server.requestHandler(request -> {

      // This handler gets called for each request that arrives on the server
      HttpServerResponse response = request.response();
      response.putHeader("content-type", "text/plain");

      // Write to the response and end it
      response.end("Hello World!");
    });

    server.listen(8080);
  }

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(WebExample01.class.getName());
  }

}
