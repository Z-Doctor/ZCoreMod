package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderMooshroom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cag";
		else
			return "net/minecraft/client/renderer/entity/RenderMooshroom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cag";
		else
			return "RenderMooshroom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcag;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderMooshroom;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityMooshroom;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderMooshroom.func_110775_a");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelBase;, ()Lnet/minecraft/client/model/ModelCow;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderMooshroom.func_177087_b");

	/**
	 * <p>
	 * Name: MOOSHROOM_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110880_a = McMappingDatabase.getSRG("field_110880_a");

}
