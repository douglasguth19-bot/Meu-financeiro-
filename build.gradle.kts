plugins {
    id("com.android.application")
}

android {
    namespace = "com.meufinanceiro.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.meufinanceiro.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-ktx:1.10.0")
}
