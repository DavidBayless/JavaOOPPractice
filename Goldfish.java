public class Goldfish extends Fish {

  public Goldfish() {
    super();
    this.weight = 6;
  }

  void eat(String food) {
    if (food == "Fishfood") {
      this.weight += 2;
      System.out.println("Blub nom Blub Glub.");
    } else {
      int random = (int) Math.floor(Math.random()  * 2 + 1);
      if (random == 1) {
        this.weight += 2;
        System.out.println("Blub Blub Glub Nom Om Nom.");
      } else {
        this.weight -= 2;
        System.out.println("Blub Blub Blech");
      }
    }
  }

  void act() {
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 7 + 1);
      if (random == 1) {
        this.sleep();
      } else if (random == 2 || random == 3 || random == 4) {
        random = (int) Math.floor(Math.random() * 2 + 1);
        if (random == 2) {
          this.eat("Fishfood");
        } else {
          this.eat("Trash");
        }
      } else if (random == 5 || random == 6 || random == 7) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    }
  }


}

// - Subclasses Fish.
// - Size is set to "Small".
// - Only eats the following:
//   - String "Fishfood".
//     - Increases weight by 2.
//   - String "Trash".
//     - Has a 50% chance of increasing weight by 2 or decreasing weight by 2.
// - Is 3x as likely to poop than sleep.
// - Is 3x as likely to eat than sleep.
