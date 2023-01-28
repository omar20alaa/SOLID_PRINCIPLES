package app.solid_principles.liskov_substitution.bad_usecase;

class Frog extends Amphibian {

    public void swim() {
        System.out.println("The frog is swimming");
    }

    public void walk() {
        System.out.println("The frog is walking on land");
    }


   /*

     The Amphibian class can extend to a Frog class because frogs are amphibians,
     so they can inherit the properties of the Amphibian class without altering the logic and purpose of the class.

     But we cannot extend the Amphibian class to a Dolphin class because dolphins only live in water
     which implies that the walk() method would be irrelevant to the Dolphin class.

      So, when you extend a class, if some of the properties of the initial class are not useful for the new class,
      the Liskov substitution principle has been violated.

      The solution to this is simple: create interfaces that match the needs of the inheriting class.

      In summary, if a class inherits another,
      it should do so in a manner that all the properties of the inherited class would remain relevant to its functionality.



    */


}
