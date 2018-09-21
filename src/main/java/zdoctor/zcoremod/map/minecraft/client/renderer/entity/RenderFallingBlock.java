package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderFallingBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzk";
		else
			return "net/minecraft/client/renderer/entity/RenderFallingBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzk";
		else
			return "RenderFallingBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzk;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderFallingBlock;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityFallingBlock;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderFallingBlock.func_110775_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityFallingBlock;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderFallingBlock.func_76986_a");

}
