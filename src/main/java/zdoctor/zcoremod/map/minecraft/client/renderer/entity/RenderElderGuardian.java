package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderElderGuardian {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bza";
		else
			return "net/minecraft/client/renderer/entity/RenderElderGuardian";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bza";
		else
			return "RenderElderGuardian";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbza;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderElderGuardian;";
	}

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGuardian;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderElderGuardian.func_77041_b");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGuardian;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderElderGuardian.func_110775_a");

	/**
	 * <p>
	 * Name: GUARDIAN_ELDER_TEXTURE
	 * </p>
	 */
	public static McObfPair field_177116_j = McMappingDatabase.getSRG("field_177116_j");

}
