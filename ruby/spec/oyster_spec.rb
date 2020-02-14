 require 'spec_helper'

 RSpec.describe Card do

  it "should not allow entry if there is not enough credit" do
    card = Card.new()
    expect{card.touch_in("TUBE", "Earl's Court")}.to raise_error(RuntimeError)
  end

  it "charges the max fare when touching in" do
    card = Card.new()
    card.touch_in("TUBE", "Holborn")
    expect(card.balance).to eq(6.80)
  end

  it "charges the correct fare when touching out" do
    card = Card.new()
    card.touch_in("TUBE", "Holborn")
    card.touch_out("TUBE", "Earl's Court")
    expect(card.balance).to eq(7.50)
  end

  it "charges the correct fare on a bus" do
    card = Card.new()
    card.touch_in("TUBE", "Earl's Court")
    expect(card.balance).to eq(8.20)
  end

  it "should charge the max fare if only swiping out" do
    #TODO
  end
end
