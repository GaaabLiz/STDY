package it.gabliz.stdy.view

import it.gabliz.stdy.Main
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import mu.KLoggable
import mu.KLogger

/**
 * Class that load all the guis.
 */
object FxGuiLoader : KLoggable {
    override val logger: KLogger = logger()

    private const val GUI_SPLASH_FXML_NAME = "splash.fxml"

    internal fun loadSplash(stage:Stage) {
        val fxmlLoader = FXMLLoader(Main::class.java.getResource(GUI_SPLASH_FXML_NAME))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }

    internal fun loadDashboard(stage:Stage) {
        val fxmlLoader = FXMLLoader(Main::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}