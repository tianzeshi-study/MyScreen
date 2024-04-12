plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // id("com.huawei.agconnect")
}


android {
    lintOptions {
        // abortOnError = false
        isAbortOnError = false
        // disable("ResourceType")
    }
    namespace = "love.flowersky.test2"
    compileSdk = 33

    defaultConfig {
        applicationId = "love.flowersky.test2"
        minSdk = 24
        targetSdk = 27
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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
        viewBinding = true
    }
}

dependencies {
    // 引入基础SDK
    implementation("com.huawei.hms:ml-computer-vision-classification:3.7.0.301")
    // 引入图片分类模型包
    implementation("com.huawei.hms:ml-computer-vision-image-classification-model:3.7.0.301")
    // implementation("io.github.java-diff-utils:4.12")
    implementation("io.github.java-diff-utils:java-diff-utils:4.12")
    // 引入基础SDK
    implementation("com.huawei.hms:ml-computer-vision-face:3.11.0.301")
    // 引入人脸轮廓+关键点检测模型包
    implementation("com.huawei.hms:ml-computer-vision-face-shape-point-model:3.7.0.301")
    // 引入表情检测模型包
    implementation("com.huawei.hms:ml-computer-vision-face-emotion-model:3.7.0.301")
    // 引入特征检测模型包
    implementation("com.huawei.hms:ml-computer-vision-face-feature-model:3.7.0.301")
    // 引入3d检测模型包
    implementation("com.huawei.hms:ml-computer-vision-face-3d-model:3.7.0.301")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    // 引入基础SDK
    implementation("com.huawei.hms:ml-computer-vision-ocr:3.11.0.301")
    // 引入拉丁语文字识别模型包
    implementation("com.huawei.hms:ml-computer-vision-ocr-latin-model:3.11.0.301")
    // 引入日韩语文字识别模型包
    implementation("com.huawei.hms:ml-computer-vision-ocr-jk-model:3.11.0.301")
    // 引入中英文文字识别模型包
    implementation("com.huawei.hms:ml-computer-vision-ocr-cn-model:3.11.0.301")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}