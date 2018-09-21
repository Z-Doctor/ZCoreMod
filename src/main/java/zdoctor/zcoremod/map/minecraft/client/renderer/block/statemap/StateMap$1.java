package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StateMap$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr$1";
		else
			return "net/minecraft/client/renderer/block/statemap/StateMap$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr$1";
		else
			return "StateMap$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwr$1;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/StateMap$1;";
	}

}
