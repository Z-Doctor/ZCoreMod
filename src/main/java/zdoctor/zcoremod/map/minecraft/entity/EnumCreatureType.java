package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumCreatureType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vr";
		else
			return "net/minecraft/entity/EnumCreatureType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vr";
		else
			return "EnumCreatureType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvr;";
		else
			return "Lnet/minecraft/entity/EnumCreatureType;";
	}

	/**
	 * <p>
	 * Name: maxNumberOfCreature
	 * </p>
	 */
	public static McObfPair field_75606_e = McMappingDatabase.getSRG("field_75606_e");

	/**
	 * <p>
	 * Name: isAnimal
	 * </p>
	 */
	public static McObfPair field_82707_i = McMappingDatabase.getSRG("field_82707_i");

	/**
	 * <p>
	 * Name: getMaxNumberOfCreature
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75601_b = McMappingDatabase.getSRG("EnumCreatureType.func_75601_b");

	/**
	 * <p>
	 * Name: getCreatureClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_75598_a = McMappingDatabase.getSRG("EnumCreatureType.func_75598_a");

	/**
	 * <p>
	 * Name: getAnimal
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82705_e = McMappingDatabase.getSRG("EnumCreatureType.func_82705_e");

	/**
	 * <p>
	 * Name: isPeacefulCreature
	 * </p>
	 */
	public static McObfPair field_75604_g = McMappingDatabase.getSRG("field_75604_g");

	/**
	 * <p>
	 * Name: creatureClass
	 * </p>
	 */
	public static McObfPair field_75605_d = McMappingDatabase.getSRG("field_75605_d");

	/**
	 * <p>
	 * Name: creatureMaterial
	 * </p>
	 */
	public static McObfPair field_75603_f = McMappingDatabase.getSRG("field_75603_f");

	/**
	 * <p>
	 * Name: getPeacefulCreature
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75599_d = McMappingDatabase.getSRG("EnumCreatureType.func_75599_d");

}
