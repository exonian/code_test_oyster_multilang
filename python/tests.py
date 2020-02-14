import unittest

import oyster


class OysterTestCase(unittest.TestCase):

    def test_low_credit(self):
        card = oyster.OysterCard()
        card.top_up(100)

        with self.assertRaises(Exception):
            card.touch_in('BUS', "Earl's Court")

    def test_swipe_in(self):
        card = oyster.OysterCard()
        card.top_up(1000)

        card.touch_in('TUBE', "Earl's Court")
        self.assertEquals(card.balance, 680)

    def test_full_journey(self):
        card = oyster.OysterCard()
        card.top_up(1000)

        card.touch_in('TUBE', "Earl's Court")
        card.touch_out('TUBE', "Holborn")
        self.assertEquals(card.balance, 750)

    def test_bus_journey(self):
        card = oyster.OysterCard()
        card.top_up(1000)

        card.touch_in('BUS', "Earl's Court")
        self.assertEquals(card.balance, 820)

    def test_swipe_out_without_swiping_in(self):
        pass  #TODO
