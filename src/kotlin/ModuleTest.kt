
import com.lambda.client.event.SafeClientEvent
import com.lambda.client.manager.managers.PlayerPacketManager.sendPlayerPacket
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule
import com.lambda.client.util.text.MessageDetection
import net.minecraft.advancements.critereon.PlacedBlockTrigger
import net.minecraft.block.BlockSign
import net.minecraft.network.play.client.CPacketUpdateSign
import net.minecraft.network.play.server.SPacketBlockChange
import net.minecraft.network.play.server.SPacketSignEditorOpen
import net.minecraft.util.math.BlockPos
import net.minecraft.util.text.ITextComponent
import net.minecraft.util.text.Style
import net.minecraft.util.text.TextComponentString

internal object ModuleTest: PluginModule(
    name = "ModuleTest",
    category = Category.MISC,
    description = "Example",
    pluginMain = PluginExample
) {
    private val signText by setting("Text", "")
    private val ModeSwitch by setting("Mode", "true")

    private fun PlacedBlockTrigger.setSignText() {
        mc.player.connection.sendPacket(SPacketSignEditorOpen())

    }}
