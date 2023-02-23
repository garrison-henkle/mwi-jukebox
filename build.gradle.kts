plugins {
    id(Plugins.androidApplication).version(Versions.androidPlugin).apply(false)
    id(Plugins.androidLibrary).version(Versions.androidPlugin).apply(false)
    id(Plugins.kotlinAndroid).version(Versions.kotlin).apply(false)
    id(Plugins.kotlinMultiplatform).version(Versions.kotlin).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
