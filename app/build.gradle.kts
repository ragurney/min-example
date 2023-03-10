/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.1.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")

    implementation("org.apache.commons:commons-exec:1.3")
    implementation("io.vavr:vavr:0.10.4")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("min.example.App")
}

subprojects {
    apply {
        plugin("com.diffplug.spotless")
        plugin("com.github.johnrengelman.shadow")
    }

}

tasks.test {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    manifest {
        attributes(
                "Main-Class" to "min.example.App"
        )
    }
}
