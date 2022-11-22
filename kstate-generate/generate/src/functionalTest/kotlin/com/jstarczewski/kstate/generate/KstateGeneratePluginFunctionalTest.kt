/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.jstarczewski.kstate.generate

import kotlin.test.assertTrue
import kotlin.test.Test
import org.gradle.testkit.runner.GradleRunner
import org.junit.Rule
import org.junit.rules.TemporaryFolder

/**
 * A simple functional test for the 'com.jstarczewski.kstate.generate.greeting' plugin.
 */
class KstateGeneratePluginFunctionalTest {
    @get:Rule val tempFolder = TemporaryFolder()

    private fun getProjectDir() = tempFolder.root
    private fun getBuildFile() = getProjectDir().resolve("build.gradle")
    private fun getSettingsFile() = getProjectDir().resolve("settings.gradle")

    @Test fun `can run task`() {
        // Setup the test build
        getSettingsFile().writeText("")
        getBuildFile().writeText("""
plugins {
    id('com.jstarczewski.kstate.generate.greeting')
}
""")

        // Run the build
        val runner = GradleRunner.create()
        runner.forwardOutput()
        runner.withPluginClasspath()
        runner.withArguments("greeting")
        runner.withProjectDir(getProjectDir())
        val result = runner.build();

        // Verify the result
        assertTrue(result.output.contains("Hello from plugin 'com.jstarczewski.kstate.generate.greeting'"))
    }
}
