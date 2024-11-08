plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.github.georgeh1998.appnameoverride"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.github.georgeh1998.appnameoverride"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        debug {
            manifestPlaceholders["appName"] = "@string/app_name"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}

dependencies {

    implementation(project(":myModule"))

    val composeBom = platform(libs.androidx.compose.bom)
    implementation(composeBom)
    debugImplementation(libs.androidx.compose.ui.tooling)

    // This app name will be Spotlight if you uncomment the below line.
    // implementation(libs.androidx.compose.ui.viewbinding)

    // Spotlight
    implementation(libs.com.github.takusemba.spotlight)
}