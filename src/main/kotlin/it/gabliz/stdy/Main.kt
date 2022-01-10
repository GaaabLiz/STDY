package it.gabliz.stdy

import it.gabliz.stdy.view.FxGuiLoader
import javafx.application.Application
import javafx.stage.Stage
import mu.KotlinLogging

/**
 * Main method of this software.
 *
 * @author Gabliz
 * @since 1.0
 */
class Main : Application() {

    companion object {
        val logger = KotlinLogging.logger {}
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Main::class.java, *args)
        }
    }

    override fun start(stage: Stage) {
        FxGuiLoader.loadSplash(stage)
    }
}