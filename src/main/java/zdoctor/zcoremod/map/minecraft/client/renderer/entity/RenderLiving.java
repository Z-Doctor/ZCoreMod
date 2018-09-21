package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderLiving {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caf";
		else
			return "net/minecraft/client/renderer/entity/RenderLiving";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caf";
		else
			return "RenderLiving";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcaf;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderLiving;";
	}

	/**
	 * <p>
	 * Name: renderLeash
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_110827_b = McMappingDatabase.getSRG("RenderLiving.func_110827_b");

	/**
	 * <p>
	 * Name: setLightmap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;)V]
	 * </p>
	 */
	public static McObfPair func_177105_a = McMappingDatabase.getSRG("RenderLiving.func_177105_a");

	/**
	 * <p>
	 * Name: canRenderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z, (Lnet/minecraft/entity/Entity;)Z, (Lnet/minecraft/entity/EntityLiving;)Z]
	 * </p>
	 */
	public static McObfPair func_177070_b = McMappingDatabase.getSRG("RenderLiving.func_177070_b");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z, (Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_177071_a = McMappingDatabase.getSRG("RenderLiving.func_177071_a");

	/**
	 * <p>
	 * Name: interpolateValue
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_110828_a = McMappingDatabase.getSRG("RenderLiving.func_110828_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderLiving.func_76986_a");

}
