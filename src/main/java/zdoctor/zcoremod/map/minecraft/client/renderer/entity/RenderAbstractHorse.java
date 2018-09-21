package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderAbstractHorse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byn";
		else
			return "net/minecraft/client/renderer/entity/RenderAbstractHorse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byn";
		else
			return "RenderAbstractHorse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyn;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderAbstractHorse;";
	}

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 */
	public static McObfPair field_191360_j = McMappingDatabase.getSRG("field_191360_j");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderAbstractHorse.func_110775_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/AbstractHorse;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderAbstractHorse.func_77041_b");

	/**
	 * <p>
	 * Name: MAP
	 * </p>
	 */
	public static McObfPair field_191359_a = McMappingDatabase.getSRG("field_191359_a");

}
