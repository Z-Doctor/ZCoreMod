package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderIllusionIllager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzt";
		else
			return "net/minecraft/client/renderer/entity/RenderIllusionIllager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzt";
		else
			return "RenderIllusionIllager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzt;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderIllusionIllager;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderIllusionIllager.func_76986_a");

	/**
	 * <p>
	 * Name: renderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;DDD)V, (Lnet/minecraft/entity/Entity;DDD)V, (Lnet/minecraft/entity/EntityLivingBase;DDD)V]
	 * </p>
	 */
	public static McObfPair func_177067_a = McMappingDatabase.getSRG("RenderIllusionIllager.func_177067_a");

	/**
	 * <p>
	 * Name: ILLUSIONIST
	 * </p>
	 */
	public static McObfPair field_193121_a = McMappingDatabase.getSRG("field_193121_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderIllusionIllager.func_77041_b");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;)Z, (Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_193115_c = McMappingDatabase.getSRG("RenderIllusionIllager.func_193115_c");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderIllusionIllager.func_110775_a");

}
