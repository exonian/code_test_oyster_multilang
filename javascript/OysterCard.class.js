"use strict";

class OysterCard {

    constructor (credit = 0) {
        this.credit = credit;
        this.points = [];
    }

    getCredit() {
        return this.credit;
    }
    
    enterStation(station) {
    }

    exitStation(finalStation) {
    }
   
    enterBus() {  
    }
}

module.exports = OysterCard;
