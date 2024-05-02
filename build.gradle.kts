plugins {
    idea
}

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

repositories {
    mavenCentral()
    google()
    maven("https://repo.mineinabyss.com/releases")
    maven("https://repo.mineinabyss.com/snapshots")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.dmulloy2.net/repository/public/")

}
taskFromChildren("build")
taskFromChildren("clean")
taskFromChildren("assemble")

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
