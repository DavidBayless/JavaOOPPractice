abstract class Entity {
  public enum Size {Large, Small}
  boolean isDead;
  boolean isSleeping;
  double weight;
  String size;

  public Entity() {
    this.isDead = false;
    this.isSleeping = false;
    this.weight = 10;
    setSize();
  }

  public void setSize(Size size) {
    switch (size) {
      case Large:
        this.size = "Large";
        break;
      case Small:
        this.size = "Small";
        break;
      default:
        this.size = "Small";
        break;
     }
  }

  public void setSize() {
    this.size = "Small";
  }

  void poop() {
    this.weight -= Math.ceil(this.weight / 10);
    System.out.println("Pooping");
    if (this.weight <= 0) {
      this.die();
    }
  }

  void eat(Entity other) {
    this.weight += other.weight / 10;
    other.die();
    System.out.println("Died");
  }

  void eat() {
    this.weight += this.weight * 1.1;
    System.out.println("Eating");
  }

  void sleep() {
    if (this.isSleeping == true) {
      if (Math.floor(Math.random() * 2 + 1) == 2) {
        this.isSleeping = false;
        System.out.println("Woke up");
      } else {
        System.out.println("Still sleeping");
      }
    } else {
      this.isSleeping = true;
      System.out.println("Sleeping");
    }
  }

  void act() {
    if (weight <= 0) {
      this.isDead = true;
    }
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 3 + 1);
      if (random == 3) {
        this.sleep();
      } else if (random == 2) {
        this.eat();
      } else if (random == 1) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    } else if (this.isDead == true) {
      System.out.println("is dead");
    }
  }

  void die() {
    this.isDead = true;
  }
}

// - Is an abstract class
// - Has a field named size of type String
//   - String "large" or "small" as possible values.
//   - Bonus: enum for size field.
// - Has a field named isDead of type boolean.
// - Has a field named isSleeping of type boolean.
// - Has a field named weight of type int.
// - Has a method eat().
//   - Has one parameter of type Entity
//   - Increases weight by 1/10th weight of Eaten entity.
//   - Eaten entity dies.
// - Has a method sleep.
//   - Sets isSleeping to true;
// - Has a method poop.
//   - Decreases weight by 1/10th.
//   - If weight is zero Entity dies.
// - Has a method act.
//   - Does nothing if isDead.
//   - Does nothing if isSleeping.
//   - If isSleeping it has of 50% chance of setting isSleeping to true.
//   - Randomly will either eat(), sleep() or poop();
// - Has a method die.
//   - set isDead to true.
