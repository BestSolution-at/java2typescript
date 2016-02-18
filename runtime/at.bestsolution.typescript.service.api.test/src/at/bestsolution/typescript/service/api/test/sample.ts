

class Person {
    firstname : string;
    lastname : string;
    car : Car[];

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
p.