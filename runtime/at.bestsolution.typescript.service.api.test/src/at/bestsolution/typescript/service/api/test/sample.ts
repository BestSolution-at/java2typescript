class Person {
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

var p : Person = new Person("Tom","Schindl");
p.getF