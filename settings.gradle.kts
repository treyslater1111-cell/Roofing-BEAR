pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = java.net.URI("https://jcenter.bintray.com") }
        maven { url = java.net.URI("https://repo.gradle.org/gradle/libs-releases") }
    }
}

rootProject.name = "The Roofing BEAR"
include(":app")
