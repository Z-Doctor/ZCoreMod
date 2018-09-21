package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderCreeper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byx";
		else
			return "net/minecraft/client/renderer/entity/RenderCreeper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byx";
		else
			return "RenderCreeper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyx;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderCreeper;";
	}

	/**
	 * <p>
	 * Name: getColorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCreeper;FF)I, (Lnet/minecraft/entity/EntityLivingBase;FF)I]
	 * </p>
	 */
	public static McObfPair func_77030_a = McMappingDatabase.getSRG("RenderCreeper.func_77030_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCreeper;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderCreeper.func_77041_b");

	/**
	 * <p>
	 * Name: CREEPER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110830_f = McMappingDatabase.getSRG("field_110830_f");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCreeper;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderCreeper.func_110775_a");

}
