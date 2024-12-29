plugins {
    kotlin("jvm") version "2.1.0"
    application
}

kotlin {
    jvmToolchain(21)
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

tasks.register<Copy>("copyDeps") {
    into("$buildDir/libs")
    from(project.configurations.runtimeClasspath.get().files.filter({ !it.toString().contains("jdk7") }))
}

// from https://stackoverflow.com/questions/71478456/how-to-collect-all-dependencies-in-gradle-7
// tasks.register<Copy>("copyDeps") {
//     into("$buildDir/libs")
//     from(project.configurations.runtimeClasspath)
//     doLast {
//         println("copyDeps:\n  ${project.configurations.runtimeClasspath.get().files.joinToString("\n  ") { it.absolutePath }}\n  ->\n  $buildDir/libs")
//     }
// }
