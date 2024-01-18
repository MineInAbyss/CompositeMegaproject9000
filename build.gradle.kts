val includedProjects: String = file(".include")
    .readLines()
    .first()

fun taskFromChildren(taskName: String) {
    tasks.register(taskName) {
        for (project in includedProjects.split(',')) {
            dependsOn(gradle.includedBuild(project).task(":$taskName"))
        }
    }
}

taskFromChildren("build")
taskFromChildren("clean")
taskFromChildren("assemble")
