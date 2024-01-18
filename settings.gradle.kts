rootProject.name = "composite-projects"
val includedProjects: String = file(".include")
    .readLines()
    .first()

for (project in includedProjects.split(',')) {
    includeBuild("../$project")
}
