package app.solid_principles.open_closed.good_example;

class Smoha_club implements Entity{

   @Override
   public int CalculateBudget() {
      return 30 * 200 * ( 1000 * 20 );
   }

}

   /*

   In the code above, we have created an interface called Entity with a CalculateBudget() method.

   Each entity – Ahly, Smoha and Company – extends the functionality of the Entity interface.

   Now we no longer have to modify existing code when we create a new entity - we just extend the functionality we need and apply it to the new entity.

   */