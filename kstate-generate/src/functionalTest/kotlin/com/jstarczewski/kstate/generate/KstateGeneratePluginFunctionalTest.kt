/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.jstarczewski.kstate.generate

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class KstateGeneratePluginFunctionalTest {
    @get:Rule
    val tempFolder = TemporaryFolder()

    private fun getProjectDir() = tempFolder.root
    private fun getBuildFile() = getProjectDir().resolve("build.gradle")
    private fun getSettingsFile() = getProjectDir().resolve("settings.gradle")

    @Test
    fun `can run task`() {
        getSettingsFile().writeText("")
        getBuildFile().writeText(
            """
        plugins {
            id('com.jstarczewski.kstate.generate')
        }
        """
        )
    }
}
