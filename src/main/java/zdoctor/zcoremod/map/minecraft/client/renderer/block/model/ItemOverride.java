package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemOverride {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvz";
		else
			return "net/minecraft/client/renderer/block/model/ItemOverride";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvz";
		else
			return "ItemOverride";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvz;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemOverride;";
	}

	/**
	 * <p>
	 * Name: getLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188026_a = McMappingDatabase.getSRG("ItemOverride.func_188026_a");

	/**
	 * <p>
	 * Name: mapResourceValues
	 * </p>
	 */
	public static McObfPair field_188029_b = McMappingDatabase.getSRG("field_188029_b");

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_188028_a = McMappingDatabase.getSRG("field_188028_a");

	/**
	 * <p>
	 * Name: matchesItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_188027_a = McMappingDatabase.getSRG("ItemOverride.func_188027_a");

}
