package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSkeleton$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cas$1";
		else
			return "net/minecraft/client/renderer/entity/RenderSkeleton$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cas$1";
		else
			return "RenderSkeleton$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcas$1;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSkeleton$1;";
	}

	/**
	 * <p>
	 * Name: initArmor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177177_a = McMappingDatabase.getSRG("RenderSkeleton$1.func_177177_a");

}
