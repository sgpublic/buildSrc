package io.github.sgpublic.gradle.common.utils

object OsCheck {
    val isWindows: Boolean get() {
        return System.getProperties().getProperty("os.name")
            .toLowerCase().indexOf("WINDOWS") != -1;
    }
}