plugins {
    id("com.android.application")
    kotlin("android")
}

val projectId = "123"
val projectSecretKey = "321"
val gPayMerchantId = "BCR2DN6TZ75OBLTH"

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.ecommpay.msdk.ui.example"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("debug") {
            buildConfigField(
                "String",
                "PROJECT_SECRET_KEY",
                "\"" + projectSecretKey + "\""
            )

            buildConfigField(
                "int",
                "PROJECT_ID",
                projectId
            )

            buildConfigField(
                "String",
                "GPAY_MERCHANT_ID",
                "\"" + gPayMerchantId + "\""
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("com.ecommpay:msdk-ui:2.0.0")

    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.activity:activity-compose:1.5.1")

    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("androidx.activity:activity-ktx:1.5.1")
    implementation("androidx.core:core-ktx:1.8.0")
}
