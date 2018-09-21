package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SharedMonsterAttributes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adh";
		else
			return "net/minecraft/entity/SharedMonsterAttributes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adh";
		else
			return "SharedMonsterAttributes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladh;";
		else
			return "Lnet/minecraft/entity/SharedMonsterAttributes;";
	}

	/**
	 * <p>
	 * Name: setAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_151475_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_151475_a");

	/**
	 * <p>
	 * Name: applyModifiersToAttributeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttributeInstance;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_111258_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_111258_a");

	/**
	 * <p>
	 * Name: MOVEMENT_SPEED
	 * </p>
	 */
	public static McObfPair field_111263_d = McMappingDatabase.getSRG("field_111263_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151476_f = McMappingDatabase.getSRG("field_151476_f");

	/**
	 * <p>
	 * Name: LUCK
	 * </p>
	 */
	public static McObfPair field_188792_h = McMappingDatabase.getSRG("field_188792_h");

	/**
	 * <p>
	 * Name: readAttributeModifierFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/entity/ai/attributes/AttributeModifier;]
	 * </p>
	 */
	public static McObfPair func_111259_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_111259_a");

	/**
	 * <p>
	 * Name: writeAttributeModifierToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_111262_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_111262_a");

	/**
	 * <p>
	 * Name: ATTACK_DAMAGE
	 * </p>
	 */
	public static McObfPair field_111264_e = McMappingDatabase.getSRG("field_111264_e");

	/**
	 * <p>
	 * Name: writeBaseAttributeMapToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_111257_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_111257_a");

	/**
	 * <p>
	 * Name: ARMOR_TOUGHNESS
	 * </p>
	 */
	public static McObfPair field_189429_h = McMappingDatabase.getSRG("field_189429_h");

	/**
	 * <p>
	 * Name: FLYING_SPEED
	 * </p>
	 */
	public static McObfPair field_193334_e = McMappingDatabase.getSRG("field_193334_e");

	/**
	 * <p>
	 * Name: KNOCKBACK_RESISTANCE
	 * </p>
	 */
	public static McObfPair field_111266_c = McMappingDatabase.getSRG("field_111266_c");

	/**
	 * <p>
	 * Name: FOLLOW_RANGE
	 * </p>
	 */
	public static McObfPair field_111265_b = McMappingDatabase.getSRG("field_111265_b");

	/**
	 * <p>
	 * Name: ATTACK_SPEED
	 * </p>
	 */
	public static McObfPair field_188790_f = McMappingDatabase.getSRG("field_188790_f");

	/**
	 * <p>
	 * Name: MAX_HEALTH
	 * </p>
	 */
	public static McObfPair field_111267_a = McMappingDatabase.getSRG("field_111267_a");

	/**
	 * <p>
	 * Name: ARMOR
	 * </p>
	 */
	public static McObfPair field_188791_g = McMappingDatabase.getSRG("field_188791_g");

	/**
	 * <p>
	 * Name: writeAttributeInstanceToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttributeInstance;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_111261_a = McMappingDatabase.getSRG("SharedMonsterAttributes.func_111261_a");

}
