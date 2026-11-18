# Task 12 – Day-4 design challenge
Redesign decision: MODIFY. Pricing is delegated to `PricingRule`, making rates independently replaceable; unequal floor capacities use a jagged array; `DayPass` models visitor pass validity. E-bike flat fee is Rs 25; delivery van is double the car rate during 09:00–17:00. Compile/run: `javac -d out src/Task12.java && java -cp out Task12`.
