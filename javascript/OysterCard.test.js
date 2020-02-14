const OysterCard = require('./OysterCard.class');

test("denies entry if there is not enough credit", () => {
    const card = new OysterCard(1);
	expect(() => { card.enterStation("EarlsCourt") }).toThrow("Not enough credit");
});

test("charges max fare when swiping in to a station", () => {
    const card = new OysterCard(10);
    card.enterStation("EarlsCourt");
    expect(card.getCredit()).toBe(6.80);
});

test("charges the correct fare when completing a journey", () => {
    const card = new OysterCard(10);
    card.enterStation("EarlsCourt");
    card.exitStation("Holborn");
    expect(card.getCredit()).toBe(7.50);
});

test("handles bus journey correctly", () => {
    const card = new OysterCard(10);
    card.enterBus();
    expect(card.getCredit()).toBe(8.20);
});

test("swiped out without swiping in", () => {
});
