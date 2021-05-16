rootProject.name = "composite-master"
val includedProjects: String by settings

for (project in includedProjects.split(',')) {
    includeBuild("../$project")
}
