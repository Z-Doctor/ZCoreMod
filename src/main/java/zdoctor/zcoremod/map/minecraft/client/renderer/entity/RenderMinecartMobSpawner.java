package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderMinecartMobSpawner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cae";
		else
			return "net/minecraft/client/renderer/entity/RenderMinecartMobSpawner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cae";
		else
			return "RenderMinecartMobSpawner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcae;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderMinecartMobSpawner;";
	}

}
