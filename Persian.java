public class Persian extends Cat {

  public Persian() {
    super();
    this.weight = 20;
  }

  void eat(Goldfish goldeen) {
    this.weight += (int) Math.ceil(goldeen.weight / 10);
    goldeen.die();
    System.out.println("Tweetie. Where are you Tweetie?");
  }

  void eat(String food) {
    this.weight += 2;
    System.out.println("Kitty food is purrfect.");
  }

  void annoy(Entity other) {
    System.out.println("Bop. Meow. Bop. Bop. Bop...");
    other.weight -= 1;
    if (other.weight <= 0) {
      other.die();
    }
  }

  void act() {
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 3 + 1);
      if (random == 3) {
        this.sleep();
      } else if (random == 2) {
        random = (int) Math.floor(Math.random() * 2 + 1);
        if (random == 1) {
          this.eat(new Goldfish());
        } else {
          this.eat("Cat Food");
        }
      } else if (random == 1) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    }
  }
}


// ​
// - Subclasses Cat.
// - Size is set to "small".
// - Only eats the following:
//   - Small fish.
//   - String "Catfood".
// - Has method called annoy.
//   - returns void.
//   - Has parameter of type Entity.
//   - The passed in entity loses one weight.
