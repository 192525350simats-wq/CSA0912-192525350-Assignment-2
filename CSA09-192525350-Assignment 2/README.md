# CSA09-192525350-Assignment1 – Java CO1 Smart Parking

**Student:** Yameenullah M H  
**Register Number:** 192525350  
**Assignment:** Programming in Java – Assignment 1 (CO1)  
**Java used for verification:** OpenJDK 21.0.12 (source is compatible with Java 17+; Task 8 uses pattern matching for instanceof, Java 16+).

## Repository structure

- `Task01` … `Task12`: one folder per assignment task.
- Each task folder contains `src/`, `input/`, `output/`, and a task README.
- `output/console_output.txt` is the captured output from an actual compile/run. `output/execution_screenshot.png` is a visual capture of that console output.
- Task 06 includes a PlantUML class hierarchy source. Task 10 demonstrates package separation.

## Compile and run

Run commands from the relevant task folder. For a simple task:

```bash
mkdir -p out
javac -d out src/*.java
java -cp out MainClassName
```

For Task 10 (package structure):

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out parking.app.Main
```

Use the main class named in each task README. On macOS/Linux, these commands work in Terminal; on Windows, compile the listed `.java` files with `javac -d out` and run with `java -cp out`.

## Task index

| Task | Coverage | Main runnable class |
|---|---|---|
| 01 | Problem analysis, objects, alternative arrays | Task01 |
| 02 | Data types, jagged arrays, casting/precision | Task02 |
| 03 | Allocation/release, fee logic, completed code | ParkingFacility |
| 04 | Classes, objects, constructors, chaining | Task04 |
| 05 | Static members, ticket counter, life cycle | Task05 |
| 06 | Inheritance and constructor trace, UML | Task06 |
| 07 | Overriding, equals/hashCode/toString | Task07 |
| 08 | Polymorphism, overloading, Chargeable, completed FeeDemo | FeeDemo |
| 09 | Abstract class and interface | Task09 |
| 10 | Packages, access control, encapsulation | parking.app.Main |
| 11 | Integrated baseline test scenario | Task11 |
| 12 | New categories, time-based rate, one-day pass | Task12 |

## Notes on evidence

Screenshots show the output produced by executing the Java programs in this package. Task 01, 02, 04–07, 09–12 are focused demonstrations of the concepts and design evidence requested; Task 03 and Task 08 complete the supplied code exercises. Task 11 is a compact validation harness, not a full production parking application. The assignment also asks for written analysis, pseudocode, complexity comparisons, test tables and a full report; those explanations should be included in the separate assignment report and defended in the viva.

## GitHub submission reminder

Create a repository named `CSA09-192525350-Assignment1`, upload these folders, and commit progressively (at least one commit per task). Add the faculty as collaborator if the repository is private. Paste the real repository URL into the assignment cover page; no URL is fabricated in this package.
