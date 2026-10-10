# First-java-project
This is my first java language project.

This was my made when i was learning the java language with JetBrain Accadamy.

# Store Income Calculator

A simple Java console program that shows a candy and dessert store's monthly earnings per item, calculates the total income, and then works out the net income after staff expenses.

## What It Does

1. Prints the amount earned in one month for each item:
   - Bubblegum
   - Toffee
   - Ice cream
   - Milk chocolate
   - Doughnut
   - Pancake
2. Calculates and prints the **total income** across all items.
3. Asks you to enter:
   - **Staff expenses**
   - **Other staff expenses**
4. Subtracts both expenses from the total income and prints the **net income**.

## Requirements

- Java Development Kit (JDK) 8 or newer

Check that Java is installed:

```bash
java -version
javac -version
```

## How to Run

1. Save the code as `Main.java`.
2. Compile it:

   ```bash
   javac Main.java
   ```

3. Run it:

   ```bash
   java Main
   ```

## Example Output

```
Earned amount :
Bubblegum: $202
Toffee: $118.0
Ice cream: $2250
Milk chocolate: $1680
Doughnut: $1075.0
Pancake: $80.0
Total Income: $5405.0
Staff expenses: 
1500
Other Staff expenses: 
500
Net Income: $3405
```

(The values `1500` and `500` above are typed in by the user.)

## Project Structure

```
.
├── Main.java    # The whole program
└── README.md
```

## Notes

- The monthly earnings for each item are hardcoded in the source code. To change them, edit the `total...` constants in `Main.java`.
- Staff expense inputs must be whole numbers (`int`). Decimal values will cause an `InputMismatchException`.
- Net income is converted to an `int`, so any cents are dropped (truncated, not rounded).
- The per-item prices (bubblegum, toffee, etc.) are present in the code as comments and are not used in the calculation.