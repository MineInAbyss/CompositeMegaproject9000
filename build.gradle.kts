val includedProjects: String by project

fun taskFromChildren(taskName: String) {
    tasks.register(taskName) {
        for (project in includedProjects.split(',')) {
            dependsOn(gradle.includedBuild(project).task(":$taskName"))
        }
    }

}

taskFromChildren("build")
taskFromChildren("clean")
