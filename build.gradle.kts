plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
}

group = "com.alexfu"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}