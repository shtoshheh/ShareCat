@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "by.bsuir.tatianakazimirovich.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "by.bsuir.tatianakazimirovich.myapplication"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes +="META-INF/DEPENDENCIES"
            excludes +="META-INF/LICENSE"
            excludes +="META-INF/LICENSE.txt"
            excludes +="META-INF/license.txt"
            excludes +="META-INF/NOTICE"
            excludes +="META-INF/NOTICE.txt"
            excludes +="META-INF/notice.txt"
            excludes +="META-INF/ASL2.0"
            excludes +="META-INF/*.kotlin_module"
            excludes +="META-INF/INDEX.LIST"
            excludes +="META-INF/io.netty.versions.properties"
        }
    }


}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.commons.collections)
    implementation(libs.androidx.paging.runtime)


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    implementation(libs.accomponist)

    implementation(libs.permission)
    implementation(libs.navigation.material)
    implementation(libs.adaptive)
    implementation(libs.testharness)
    implementation(libs.core)
    implementation(libs.animation)
    implementation(libs.animation.compose)
    implementation(libs.coil)
    implementation(libs.coil.compose)
    implementation(libs.foundation.compose)
    implementation(libs.constraintlayout)
    implementation(libs.runtime)
    implementation(libs.ui.util)
    implementation(libs.viewmodel)
    implementation(libs.kotlin.coroutines)
    implementation(libs.lifecycle.process)
    implementation(libs.lifecycle.service)
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.kotlin)
    implementation(libs.ctesting)
    implementation(libs.animation.testing)
    implementation(libs.role)

    implementation(libs.datastore)
    implementation(libs.serialization)
    implementation(libs.koin)
    implementation(libs.work)
    implementation(libs.ktor)
    implementation(libs.ksp)
    implementation(libs.room)
}
