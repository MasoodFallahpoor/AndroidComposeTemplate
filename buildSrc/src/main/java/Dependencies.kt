object Dependencies {

    internal const val kotlinVersion = "1.5.21"
    internal const val composeVersion = "1.0.1"

    object App {
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}"
        const val appCompat = "androidx.appcompat:appcompat:1.3.0"
        const val activityCompose = "androidx.activity:activity-compose:1.3.0"
        const val material = "com.google.android.material:material:1.4.0-rc01"
        const val composeUi = "androidx.compose.ui:ui:$composeVersion"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val composeFoundation = "androidx.compose.foundation:foundation:$composeVersion"
        const val composeMaterial = "androidx.compose.material:material:$composeVersion"
        const val composeMaterialIcons =
            "androidx.compose.material:material-icons-core:$composeVersion"
    }

}