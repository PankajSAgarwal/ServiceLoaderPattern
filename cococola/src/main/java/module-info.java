module cococola {
    requires softdrink;
    provides com.pankaj.softdrink.SoftDrink with
            com.pankaj.coke.Coke,
            com.pankaj.coke.DietCoke;
}