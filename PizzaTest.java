class Pizza {
    protected Pizza topping;

    Pizza() {}

    Pizza(Pizza topping) {
        this.topping = topping;
    }

    public String add() {
        return ""; // Pizza with nothing
    }

    // Make System.out.println
    public String toString() {
        if(add() == ""){
            return "none topping";
        }
        else{
            return this.add();
        }
    }
}


class WithOnions extends Pizza {
    WithOnions(Pizza topping) {
        super(topping);
    }

    public String add() {
        if(this.topping.add() != ""){
            return this.topping.add() + ", Onions";
        }
        else{
            return this.topping.add() + "Onions"; // Additional Onions
        } 
    }
}

class WithMushrooms extends Pizza {
    WithMushrooms(Pizza topping) {
        super(topping);
    }

    public String add() {
        if(this.topping.add() != ""){
            return this.topping.add() + ", Mushrooms";
        }
        else{
            return this.topping.add() + "Mushrooms"; // Additional Mushrooms
        } 
    }
}

class WithPepperonis extends Pizza {
    WithPepperonis(Pizza topping) {
        super(topping);
    }

    public String add() {
        if(this.topping.add() != ""){
            return this.topping.add() + ", Pepperonis";
        }
        else{
            return this.topping.add() + "Pepperonis"; // Additional Pepperonis
        } 
    }
}

class WithSausages extends Pizza {
    WithSausages(Pizza topping) {
        super(topping);
    }

    public String add() {
        if(this.topping.add() != ""){
            return this.topping.add() + ", Sausages";
        }
        else{
            return this.topping.add() + "Sausages"; // Additional Sausages
        } 
    }
}

class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1 = new WithMushrooms(pizza1);
        pizza1 = new WithOnions(pizza1);
        pizza1 = new WithPepperonis(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2 = new WithSausages(pizza2);
        pizza2 = new WithMushrooms(pizza2);
        pizza2 = new WithPepperonis(pizza2);
        
        System.out.println("Pizza1 with "+ pizza1);
        System.out.println("Pizza2 with "+ pizza2);
    }
}
