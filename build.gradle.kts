import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.70"
    java
}

repositories {
    mavenCentral()
}

group = "com.enjoycode"
version = "0.0.1-SNAPSHOT"
description = "kotlin-bbl"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.31")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.3.31")
    testImplementation("org.assertj:assertj-core:3.12.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    sourceSets["main"].apply {
        java.srcDir("src/main/kotlin")
    }
}

tasks {
    withType(KotlinCompile::class).configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_11.toString()
        }
    }

    withType(Test::class).configureEach {
        useJUnitPlatform()
    }

}