package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderVindicator$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbh$1";
		else
			return "net/minecraft/client/renderer/entity/RenderVindicator$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbh$1";
		else
			return "RenderVindicator$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbh$1;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderVindicator$1;";
	}

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("RenderVindicator$1.func_177141_a");

	/**
	 * <p>
	 * Name: translateToHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_191361_a = McMappingDatabase.getSRG("RenderVindicator$1.func_191361_a");

}
