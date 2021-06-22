plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {

    compileSdk = Config.compileSdkVersion

    defaultConfig {
        applicationId = Config.appId
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = Config.versionCode
        versionName = Config.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = Config.isMinifyEnabledForReleaseBuilds
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Config.composeVersion
    }

}

dependencies {
    implementation(Dependencies.App.kotlinStdLib)
    implementation(Dependencies.App.appCompat)
    implementation(Dependencies.App.activityCompose)
    implementation(Dependencies.App.material)
    implementation(Dependencies.App.composeFoundation)
    implementation(Dependencies.App.composeUi)
    implementation(Dependencies.App.composeUiTooling)
    implementation(Dependencies.App.composeMaterial)
    implementation(Dependencies.App.composeMaterialIcons)
}