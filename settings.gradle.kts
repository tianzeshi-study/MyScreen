pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url="https://developer.huawei.com/repo/")
        maven(url = "https://github.io")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url="https://developer.huawei.com/repo/")
        maven(url = "https://github.io")
    }
}

rootProject.name = "TEST2"
include(":app")

buildscript {
    repositories {
        // 添加需要的仓库
        mavenCentral()
        google()
        maven(url="https://developer.huawei.com/repo/")
    }
    dependencies {
        // 添加构建脚本的类路径依赖
        // classpath("com.huawei.agconnect:agcp:1.4.2.300")
            }
}
