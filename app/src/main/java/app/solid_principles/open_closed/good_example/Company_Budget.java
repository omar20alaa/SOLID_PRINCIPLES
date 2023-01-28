package app.solid_principles.open_closed.good_example;

class Company_Budget implements Entity {

   @Override
   public int CalculateBudget() {
      return 80 * 600 / 1000;
   }

}




