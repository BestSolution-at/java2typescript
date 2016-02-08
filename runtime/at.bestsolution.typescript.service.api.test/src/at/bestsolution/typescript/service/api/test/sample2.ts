class Blim {
    private firstname : string;
    private lastname : string;

    constructor(firstname : string, lastname : string) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public getName() {
        return this.lastname + ", " + this.firstname;
    }

    public getFirstname() {
        return this.firstname;
    }
}

var p : Blim = new Blim("Tom","Schindl");
