package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionItems {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ta";
		else
			return "net/minecraft/util/datafix/fixes/PotionItems";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ta";
		else
			return "PotionItems";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lta;";
		else
			return "Lnet/minecraft/util/datafix/fixes/PotionItems;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("PotionItems.func_188217_a");

	/**
	 * <p>
	 * Name: POTION_IDS
	 * </p>
	 */
	public static McObfPair field_188223_a = McMappingDatabase.getSRG("field_188223_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("PotionItems.func_188216_a");

}
