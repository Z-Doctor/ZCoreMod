package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemRecord {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajf";
		else
			return "net/minecraft/item/ItemRecord";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajf";
		else
			return "ItemRecord";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajf;";
		else
			return "Lnet/minecraft/item/ItemRecord;";
	}

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_185077_c = McMappingDatabase.getSRG("field_185077_c");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumRarity;]
	 * </p>
	 */
	public static McObfPair func_77613_e = McMappingDatabase.getSRG("ItemRecord.func_77613_e");

	/**
	 * <p>
	 * Name: getBySound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/item/ItemRecord;]
	 * </p>
	 */
	public static McObfPair func_185074_a = McMappingDatabase.getSRG("ItemRecord.func_185074_a");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemRecord.func_77624_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemRecord.func_180614_a");

	/**
	 * <p>
	 * Name: RECORDS
	 * </p>
	 */
	public static McObfPair field_150928_b = McMappingDatabase.getSRG("field_150928_b");

	/**
	 * <p>
	 * Name: getRecordNameLocal
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150927_i = McMappingDatabase.getSRG("ItemRecord.func_150927_i");

	/**
	 * <p>
	 * Name: sound
	 * </p>
	 */
	public static McObfPair field_185076_b = McMappingDatabase.getSRG("field_185076_b");

	/**
	 * <p>
	 * Name: getSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185075_h = McMappingDatabase.getSRG("ItemRecord.func_185075_h");

}
