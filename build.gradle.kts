plugins {
    kotlin("jvm") version "1.8.0"
    application
}

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("net.pdutta.sandbox.MainKt")
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
