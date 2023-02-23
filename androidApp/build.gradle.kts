@file:Suppress("UnstableApiUsage")

plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
}

android {
    namespace = "com.buildmidwestern.lemonwire.android"
    compileSdk = Config.compileSdkVersion
    defaultConfig {
        applicationId = "com.buildmidwestern.lemonwire.android"
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = Config.versionCode
        versionName = Config.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.androidxComposeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))

    implementation(Deps.androidxActivityCompose)

    implementation(Deps.androidxComposeUi)
    implementation(Deps.androidxComposeUiTooling)
    implementation(Deps.androidxComposeUiToolingPreview)
    implementation(Deps.androidxComposeFoundation)
    implementation(Deps.androidxComposeMaterial)
}