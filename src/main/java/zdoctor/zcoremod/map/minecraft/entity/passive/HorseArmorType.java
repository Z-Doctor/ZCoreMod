package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HorseArmorType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aar";
		else
			return "net/minecraft/entity/passive/HorseArmorType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aar";
		else
			return "HorseArmorType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laar;";
		else
			return "Lnet/minecraft/entity/passive/HorseArmorType;";
	}

	/**
	 * <p>
	 * Name: getTextureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188574_d = McMappingDatabase.getSRG("HorseArmorType.func_188574_d");

	/**
	 * <p>
	 * Name: textureName
	 * </p>
	 */
	public static McObfPair field_188586_e = McMappingDatabase.getSRG("field_188586_e");

	/**
	 * <p>
	 * Name: getProtection
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188578_c = McMappingDatabase.getSRG("HorseArmorType.func_188578_c");

	/**
	 * <p>
	 * Name: getByOrdinal
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/passive/HorseArmorType;]
	 * </p>
	 */
	public static McObfPair func_188575_a = McMappingDatabase.getSRG("HorseArmorType.func_188575_a");

	/**
	 * <p>
	 * Name: hash
	 * </p>
	 */
	public static McObfPair field_188587_f = McMappingDatabase.getSRG("field_188587_f");

	/**
	 * <p>
	 * Name: protection
	 * </p>
	 */
	public static McObfPair field_188588_g = McMappingDatabase.getSRG("field_188588_g");

	/**
	 * <p>
	 * Name: isHorseArmor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_188577_b = McMappingDatabase.getSRG("HorseArmorType.func_188577_b");

	/**
	 * <p>
	 * Name: getOrdinal
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188579_a = McMappingDatabase.getSRG("HorseArmorType.func_188579_a");

	/**
	 * <p>
	 * Name: getByItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/entity/passive/HorseArmorType;]
	 * </p>
	 */
	public static McObfPair func_188580_a = McMappingDatabase.getSRG("HorseArmorType.func_188580_a");

	/**
	 * <p>
	 * Name: getHash
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188573_b = McMappingDatabase.getSRG("HorseArmorType.func_188573_b");

	/**
	 * <p>
	 * Name: getByItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/entity/passive/HorseArmorType;]
	 * </p>
	 */
	public static McObfPair func_188576_a = McMappingDatabase.getSRG("HorseArmorType.func_188576_a");

}
