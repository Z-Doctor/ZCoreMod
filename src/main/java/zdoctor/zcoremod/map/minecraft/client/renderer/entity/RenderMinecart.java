package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cad";
		else
			return "net/minecraft/client/renderer/entity/RenderMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cad";
		else
			return "RenderMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcad;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderMinecart;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityMinecart;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderMinecart.func_76986_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityMinecart;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderMinecart.func_110775_a");

	/**
	 * <p>
	 * Name: modelMinecart
	 * </p>
	 */
	public static McObfPair field_77013_a = McMappingDatabase.getSRG("field_77013_a");

	/**
	 * <p>
	 * Name: MINECART_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110804_g = McMappingDatabase.getSRG("field_110804_g");

	/**
	 * <p>
	 * Name: renderCartContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityMinecart;FLnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_188319_a = McMappingDatabase.getSRG("RenderMinecart.func_188319_a");

}
