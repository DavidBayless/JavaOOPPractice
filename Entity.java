public abstract Entity {

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
