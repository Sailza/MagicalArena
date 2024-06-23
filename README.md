# Magical Arena

This project is a simple simulation of a magical arena where two players fight until one of them dies. Each player has attributes for health, strength, and attack. Players take turns attacking and defending, and the battle continues until one player's health reaches zero.

## Project Description

In the Magical Arena, two players engage in a turn-based combat where they attack and defend based on their attributes and the roll of dice. The player with lower health attacks first. The damage dealt by the attacking player is determined by multiplying their attack attribute by the outcome of an attacking dice roll. The defending player mitigates some of this damage using their strength attribute multiplied by the outcome of a defending dice roll. The remaining damage is subtracted from the defender's health. The game continues until one player's health reaches zero.

This simulation aims to provide a simple yet engaging demonstration of turn-based combat mechanics commonly found in role-playing games.

### Features

- **Player Attributes**: Each player has health, strength, and attack attributes.
- **Turn-Based Combat**: Players take turns attacking and defending.
- **Dice Rolls**: Combat outcomes are influenced by the roll of a six-sided die.
- **Battle Simulation**: The game continues until one player's health reaches zero.

### Example Scenario

- Player A: 50 health, 5 strength, 10 attack
- Player B: 100 health, 10 strength, 5 attack

**Turn 1:**
- Player A attacks and rolls a 5.
- Player B defends and rolls a 2.
- Attack damage: 5 * 10 = 50
- Defense strength: 10 * 2 = 20
- Player B's health is reduced by 30 (50 - 20) to 70.

**Turn 2:**
- Player B attacks and rolls a 4.
- Player A defends and rolls a 3.
- Attack damage: 4 * 5 = 20
- Defense strength: 5 * 3 = 15
- Player A's health is reduced by 5 (20 - 15) to 45.

The game continues until one player's health reaches zero.


## Requirements

- Java Development Kit (JDK) 11 or higher
- Visual Studio Code with Java Extension Pack or IntelliJ IDEA
- (Optional) JUnit 5 for running tests

## Setup Instructions

### Using Visual Studio Code

1. **Install Required Extensions:**
   - Install the Java Extension Pack from the VS Code marketplace.

2. **Clone the Repository:**
   - Open a terminal and clone the repository:
     ```sh
     git clone https://github.com/yourusername/MagicalArena.git
     ```
   - Navigate into the project directory:
     ```sh
     cd MagicalArena
     ```

3. **Open the Project:**
   - Open the project directory in VS Code.

4. **Add JUnit Jars (if running tests):**
   - Download JUnit jars from the [JUnit website](https://junit.org/junit5/).
   - Place the `junit-jupiter-api-5.7.0.jar` and `junit-jupiter-engine-5.7.0.jar` in the `lib` directory.
   - Ensure your `.vscode/settings.json` includes:
     ```json
     {
         "java.project.referencedLibraries": [
             "lib/**/*.jar"
         ]
     }
     ```

### Using IntelliJ IDEA

1. **Clone the Repository:**
   - Open IntelliJ IDEA and clone the repository:
     ```sh
     git clone https://github.com/yourusername/MagicalArena.git
     ```
   - Navigate into the project directory:
     ```sh
     cd MagicalArena
     ```

2. **Open the Project:**
   - Open the project directory in IntelliJ IDEA.

3. **Add JUnit Dependency (if running tests):**
   - Open `File > Project Structure > Libraries`.
   - Add the JUnit jars to the project.

## Running the Program

1. **Compile and Run:**
   - Open `Main.java` in your IDE.
   - Click the `Run` button or use the terminal:
     ```sh
     javac src/Main.java
     java src/Main
     ```

2. **Follow Prompts:**
   - Enter the attributes for Player 1 and Player 2 when prompted.
   - Watch the battle unfold in the terminal.

## Running Tests

### Using Visual Studio Code

1. **Open the Command Palette:**
   - Press `Ctrl+Shift+P`.
   - Type `Java: Test` and select it.
   - This will discover and run all the test files in your project.

### Using IntelliJ IDEA

1. **Run Tests:**
   - Open `PlayerTest.java` or `ArenaTest.java`.
   - Right-click and select `Run 'PlayerTest'` or `Run 'ArenaTest'`.

