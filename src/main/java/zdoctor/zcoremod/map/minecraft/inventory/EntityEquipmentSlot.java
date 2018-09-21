package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEquipmentSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vl";
		else
			return "net/minecraft/inventory/EntityEquipmentSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vl";
		else
			return "EntityEquipmentSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvl;";
		else
			return "Lnet/minecraft/inventory/EntityEquipmentSlot;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_188465_j = McMappingDatabase.getSRG("field_188465_j");

	/**
	 * <p>
	 * Name: slotType
	 * </p>
	 */
	public static McObfPair field_188462_g = McMappingDatabase.getSRG("field_188462_g");

	/**
	 * <p>
	 * Name: getSlotType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/EntityEquipmentSlot$Type;]
	 * </p>
	 */
	public static McObfPair func_188453_a = McMappingDatabase.getSRG("EntityEquipmentSlot.func_188453_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_188463_h = McMappingDatabase.getSRG("field_188463_h");

	/**
	 * <p>
	 * Name: fromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/inventory/EntityEquipmentSlot;]
	 * </p>
	 */
	public static McObfPair func_188451_a = McMappingDatabase.getSRG("EntityEquipmentSlot.func_188451_a");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188454_b = McMappingDatabase.getSRG("EntityEquipmentSlot.func_188454_b");

	/**
	 * <p>
	 * Name: getSlotIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188452_c = McMappingDatabase.getSRG("EntityEquipmentSlot.func_188452_c");

	/**
	 * <p>
	 * Name: slotIndex
	 * </p>
	 */
	public static McObfPair field_188464_i = McMappingDatabase.getSRG("field_188464_i");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188450_d = McMappingDatabase.getSRG("EntityEquipmentSlot.func_188450_d");

}
