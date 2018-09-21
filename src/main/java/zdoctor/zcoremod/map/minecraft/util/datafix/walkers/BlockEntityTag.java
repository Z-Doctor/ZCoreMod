package zdoctor.zcoremod.map.minecraft.util.datafix.walkers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockEntityTag {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tl";
		else
			return "net/minecraft/util/datafix/walkers/BlockEntityTag";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tl";
		else
			return "BlockEntityTag";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltl;";
		else
			return "Lnet/minecraft/util/datafix/walkers/BlockEntityTag;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188266_a = McMappingDatabase.getSRG("BlockEntityTag.func_188266_a");

	/**
	 * <p>
	 * Name: NEW_TO_OLD_ID_MAP
	 * </p>
	 */
	public static McObfPair field_190892_b = McMappingDatabase.getSRG("field_190892_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188268_a = McMappingDatabase.getSRG("field_188268_a");

	/**
	 * <p>
	 * Name: getBlockEntityID
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188267_a = McMappingDatabase.getSRG("BlockEntityTag.func_188267_a");

	/**
	 * <p>
	 * Name: ITEM_ID_TO_BLOCK_ENTITY_ID
	 * </p>
	 */
	public static McObfPair field_188269_b = McMappingDatabase.getSRG("field_188269_b");

}
