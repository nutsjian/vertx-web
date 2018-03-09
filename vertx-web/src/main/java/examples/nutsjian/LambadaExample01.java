package examples.nutsjian;

public class LambadaExample01 {
  public static void main(String[] args) {
    Bar bar = new Bar();
    new Foo().requestHandler(bar::accept);
  }

  private static class Bar {
    public void accept(FooRequest request) {

    }
  }

  private static class Foo {
    void requestHandler(Handler<FooRequest> handler) {

    }
  }

  private static class FooRequest {

  }

  @FunctionalInterface
  private interface Handler<E> {
    void handle(E event);
  }

}
