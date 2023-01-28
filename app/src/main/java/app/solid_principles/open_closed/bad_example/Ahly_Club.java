package app.solid_principles.open_closed.bad_example;

class Ahly_Club {


   public int calculate_Ahly_Budget(Club ahly) {
      return ahly.budget / 100 * ( 500 * 200 );
   }


   public int calculate_Smoha_Budget(Club smoha) {
      return smoha.budget / 200 * ( 400 * 200 );
   }


   /*

   The problem with this is that we keep modifying the code every time we need to calculate the budget of another club.

   This also violates the SRP because the class now has more than one reason to change.

   Although the code above may work perfectly, it's not efficient. We modify the code constantly which may lead to bugs.
   What if we have to calculate for a company or an object?

   Let's fix the problem using the open-closed principle.
    */

}
