class Card
  attr_accessor :balance, :journeys

  def initialize
    @balance = 0
    @journeys = []
  end

  def touch_in(mode, station)
  end

  def touch_out(mode, station)
  end

end

class Journey
end
