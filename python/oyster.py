import logging

logging.basicConfig(level=logging.DEBUG)


class Journey(object):
    pass


class OysterCard(object):

    def __init__(self):
        self.journeys = []
        self.balance = 0  # in pence

    def touch_in(self, mode, station_name=None):
        pass

    def touch_out(self, mode, station_name=None):
        pass

    def top_up(self, amount):
        pass
