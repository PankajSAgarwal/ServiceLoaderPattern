module pepsico {
    requires softdrink;
    provides com.pankaj.softdrink.SoftDrink with
            com.pankaj.pepsi.Pepsi,
            com.pankaj.pepsi.DietPepsi;
}