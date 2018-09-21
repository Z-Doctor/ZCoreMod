package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemOverrideList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwa";
		else
			return "net/minecraft/client/renderer/block/model/ItemOverrideList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwa";
		else
			return "ItemOverrideList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwa;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemOverrideList;";
	}

	/**
	 * <p>
	 * Name: applyOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188021_a = McMappingDatabase.getSRG("ItemOverrideList.func_188021_a");

	/**
	 * <p>
	 * Name: NONE
	 * </p>
	 */
	public static McObfPair field_188022_a = McMappingDatabase.getSRG("field_188022_a");

	/**
	 * <p>
	 * Name: overrides
	 * </p>
	 */
	public static McObfPair field_188023_b = McMappingDatabase.getSRG("field_188023_b");

}
