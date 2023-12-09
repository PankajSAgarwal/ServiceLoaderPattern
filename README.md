# Java ServiceLoader API
- JavaServiceLoader API along with strong encapsulation provided by Java Module Systems can be used to develop plugin architecture .
- Plugin architecture usually have a core set of services and these core behaviour can be extended by different plugins which can implement a certain part of your application.
- Plugins are dynamic , you want to be able to pull things at runtime dynamically and be able to use them without knowing them ahead of time.
- Plugin architecture will fall apart if u need to tell what plugin implementations are ahead of time . 
- In plugin architecture you don't want to recompile or re-deploy or modify your code to say what your dependencies are .
- Plugin architecture requires dynamic discovery and ServiceLoader API can be used for this dynamic discovery .
## Application
- Application consists of following modules
  - `softdrink` - It has an interface `SoftDrink` and a module descriptor exporting the package `com.pankaj.softdrink`
````
  module softdrink{
    exports com.pankaj.softdrink;
}
````
  - `client` - This module is defines a `Client` class and a `main` method that calls `ServiceLoader` API to dynamically discover and load all implementations of providers of `SoftDrink`.
`client` module also defines a module descriptor to maintain the encapsulation with `softdrink` module
````
module client {
    requires softdrink;
    uses com.pankaj.softdrink.SoftDrink;
}
````
  - `cococola` - This module is a provider that provides implementation `Coke`, `DietCoke` for the interface `SoftDrink`
````
module cococola {
    requires softdrink;
    provides com.pankaj.softdrink.SoftDrink with
            com.pankaj.coke.Coke,
            com.pankaj.coke.DietCoke;
}
````
 - `pepsico` - This module is another provider that provides implementation `Pepsi`, `DietPepsi` for the interface `SoftDrink`
````  
module pepsico {
    requires softdrink;
    provides com.pankaj.softdrink.SoftDrink with
            com.pankaj.pepsi.Pepsi,
            com.pankaj.pepsi.DietPepsi;
}
````
    
  
 