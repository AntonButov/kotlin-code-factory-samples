plugins {
    kotlin("jvm") version "1.9.24"
    id("com.google.devtools.ksp") version "1.9.24-1.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    ksp("io.github.antonbutov:code-factory-processor:0.0.6")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}