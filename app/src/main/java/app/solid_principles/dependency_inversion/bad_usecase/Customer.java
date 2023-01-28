package app.solid_principles.dependency_inversion.bad_usecase;

class Customer {

   private Bank myBank = new Bank();

   public void withdraw() {
      myBank.GIVE_CUSTOMER_MONEY_OTC();
   }

}
