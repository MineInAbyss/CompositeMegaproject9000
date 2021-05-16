# CompositeMegaproject9000

A master project that lets you easily work on several projects at once with Gradle's composite builds.

### Usage

- Clone all the projects you need into the same directory, i.e.
    ```
    Projects
    ├───A
    ├───B
    └───C
    ```
- Open CompositeMegaproject9000
- Edit `gradle.properties` to include the names/paths of all your projects.
- Run `gradle build` on the master project and all your subprojects should build together.

#### Build Specific Projects in IntelliJ:

- To build a specific project, double tap control, type `gradle build` and select the project from the top right 
  dropdown that says `Project` by default.
- After doing so, you'll se a configuration next to the green arrow in the top right. You may select one from the dropdown and run it with `Shift + F10`.
