import static org.junit.jupiter.api.Assertions.*;

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
}
