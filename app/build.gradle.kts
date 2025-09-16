plugins {
    // Apply the shared build logic from a convention plugin.
    // The shared code is located in `buildSrc/src/main/kotlin/kotlin-jvm.gradle.kts`.
    id("buildsrc.convention.kotlin-jvm")

    alias(libs.plugins.detekt)
}

dependencies {
    implementation(project(":utils"))
}

detekt {
    config.setFrom(project.rootProject.file("config/detekt/detekt.yml"))
}