import com.lambda.client.event.SafeClientEvent
import com.lambda.client.plugin.api.PluginLabelHud
import com.lambda.client.util.color.ColorHolder

internal object CustomTextHud: PluginLabelHud(
    name = "CustomText",
    category = Category.MISC,
    description = "Simple On Screen Text",
    pluginMain = PluginExample
) {
    private val text by setting("Text","Liberalis On Top!", description = "First Words")
    private val color by setting("Color", ColorHolder())
    //private val test by = setting("Mount Entity", false, description = "Mounts the saved entity or falls back to the closest one")


    override fun SafeClientEvent.updateText() {
        displayText.add(text, color)

    }
}