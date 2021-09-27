import com.lambda.client.plugin.api.Plugin

internal object PluginExample: Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        //hudElements.add(CustomTextHud)
        modules.add(ModuleTest)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}