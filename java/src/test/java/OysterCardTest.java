import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OysterCardTest {
  @Test
  public void testLowCredit() {
    OysterCard card = new OysterCard();
    card.topUp(100);

    assertThrows(Exception.class, () -> {
      card.touchIn("BUS", "Earl's Court");
    });
  }

  @Test
  public void testSwipeIn() {
    OysterCard card = new OysterCard();
    card.topUp(1000);

    card.touchIn("TUBE", "Earl's Court");

    assertEquals(680, card.getBalance());
  }

  @Test
  public void testFullJourney() {
    OysterCard card = new OysterCard();
    card.topUp(1000);

    card.touchIn("BUS", "Earl's Court");

    assertEquals(820, card.getBalance());
  }

  @Test
  @Disabled("Write this test")
  public void testSwipeOutWithoutSwipingIn() {
    // TODO
  }
}
