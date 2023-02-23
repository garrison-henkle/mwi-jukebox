object Versions{
    const val androidPlugin = "7.4.1"
    const val androidxActivityCompose = "1.6.1"
    const val androidxCompose = "1.3.1"
    const val androidxComposeFoundationAndMaterial = "1.3.1"
    const val androidxComposeCompiler = "1.4.3"
    const val kotlin = "1.8.10"
}

object Deps{
    const val androidxActivityCompose = "androidx.activity:activity-compose:${Versions.androidxActivityCompose}"
    const val androidxComposeFoundation = "androidx.compose.foundation:foundation:${Versions.androidxComposeFoundationAndMaterial}"
    const val androidxComposeMaterial = "androidx.compose.material:material:${Versions.androidxComposeFoundationAndMaterial}"
    const val androidxComposeUi = "androidx.compose.ui:ui:${Versions.androidxCompose}"
    const val androidxComposeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.androidxCompose}"
    const val androidxComposeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.androidxCompose}"
}

object ClasspathDeps{

}

object Plugins{
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinMultiplatform = "org.jetbrains.kotlin.multiplatform"
    const val kotlinNativeCocoapods = "org.jetbrains.kotlin.native.cocoapods"
}