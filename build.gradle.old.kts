buildscript {
    repositories {
        mavenCentral()
        maven(url = "https://plugins.gradle.org/m2/")
    }
}

group = "com.dugan.aoc"

plugins {
    kotlin("jvm") version "1.3.72"
}

dependencies {
    implementation(kotlin("stdlib"))
}


tasks.withType<Test> {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}

dependencies {
    val kotestVersion = "4.1.1"
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core-jvm:$kotestVersion")
    testImplementation("io.kotest:kotest-property-jvm:$kotestVersion")
    testImplementation("io.kotest:kotest-runner-console-jvm:$kotestVersion")
}
