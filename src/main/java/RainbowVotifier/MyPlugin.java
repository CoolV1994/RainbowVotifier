package RainbowVotifier;

import PluginReference.MC_Server;
import PluginReference.PluginBase;
import PluginReference.PluginInfo;
import com.vexsoftware.votifier.Votifier;

/**
 * Created by Vinnie on 10/15/14.
 */
public class MyPlugin extends PluginBase {
    Votifier votifier;
    String version = "1.0";

    public void onStartup(MC_Server argServer) {
        votifier = new Votifier();
        votifier.onEnable(argServer);
    }

    public PluginInfo getPluginInfo()
    {
        PluginInfo info = new PluginInfo();
        info.description = "Votifier Port by CoolV1994. Version " + version;
        info.eventSortOrder = 1000.0D;
        return info;
    }

    public void onShutdown() {
        votifier.onDisable();
    }
}
