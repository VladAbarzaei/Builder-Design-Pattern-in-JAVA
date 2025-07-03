# Burger Builder – Java Design Pattern Demo

This project demonstrates the **Builder Design Pattern** in Java by modeling the construction of customizable burgers. Each burger type (Standard, Premium, Deluxe) is built step-by-step through a dedicated builder class, coordinated by a director. A simple GUI and command-line interface showcase the pattern in action.

## Features

- Modular implementation of the Builder Pattern
- Multiple burger types: Standard, Premium, Deluxe
- Director class that coordinates the building process
- GUI for user interaction (based on Swing)
- Console-based testing in `TestBurgerBuilder.java`

## Files Overview

- `Burger.java` - the product class
- `BurgerPlan.java` - interface defining the burger construction steps
- `StandardBurgerBuilder`, `PremiumBurgerBuilder`, `DeluxeBurgerBuilder` - concrete builders
- `BurgerDirector.java` - orchestrates the construction process
- `GUI.java` - graphical interface for burger selection
- `TestBurgerBuilder.java` - main test class

## How to Run

1. Open the project in any Java IDE (e.g., Eclipse, IntelliJ).
2. Run `TestBurgerBuilder` to test in console.
3. Run `GUI.java` for graphical interaction.

## Pattern Highlights

This example cleanly separates the construction logic from the product itself, demonstrating how the Builder pattern allows for flexible object creation without complex constructors or parameter overloading.
