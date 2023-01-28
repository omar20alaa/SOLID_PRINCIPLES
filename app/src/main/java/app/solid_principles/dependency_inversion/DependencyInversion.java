package app.solid_principles.dependency_inversion;

class DependencyInversion {

   /*


   Dependency Inversion Principle (DIP)
   The dependency inversion principle states:

   High-level modules should not import anything from low-level modules. Both should depend on abstractions (e.g., interfaces).


   Imagine taking a one minute walk to the bank every time you had to withdraw money over the counter. It then takes an extra thirty seconds for you get your money.
   This is quite efficient because very little time is wasted. We'll assume you're the high-level module and the bank is the low-level module.

   But what happens when the bank is closed for a holiday or an emergency? You have absolutely no access to your funds.
   If you move further away from the bank, it becomes a bigger problem because you'd spend more time getting there.

   To solve this problem, an interface is introduced – an automated teller machine (ATM) or a mobile banking app. Even though you have a relationship with the bank,
   you are no longer required to interact with them physically to be served.

   This example is similar to the dependency inversion principle. We should make our classes rely on properties in our interfaces instead of relying on each other.

   The implications of violating this principle would result in a rigid system where testing blocks of code independently would be very difficult,
   reusability of code would be near impossible, and the addition or removal of code would lead to further complexity of the system and introduce bugs.


    */

}
