# Composite projects

This project allows one to include several other projects, defined by a comma spearated list in a `.include` file.

### Usage

- Clone all the projects you need into the same directory, i.e.
    ```
    Projects
    ├───A
    ├───B
    └───C
    ```
- Open this project in your IDE
- Create a `.include` file, add a comma separated project list, ex `A,B,C`
- Run `gradle build` on the master project and all your subprojects should build together.

#### Build Specific Projects in IntelliJ:

- To build a specific project, double tap control, type `gradle build` and select the project from the top right
  dropdown that says `Project` by default.
- After doing so, you'll se a configuration next to the green arrow in the top right. You may select one from the
  dropdown and run it with `Shift + F10`.
