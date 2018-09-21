package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MultiPartEntityPart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abb";
		else
			return "net/minecraft/entity/MultiPartEntityPart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abb";
		else
			return "MultiPartEntityPart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labb;";
		else
			return "Lnet/minecraft/entity/MultiPartEntityPart;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("MultiPartEntityPart.func_70037_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("MultiPartEntityPart.func_70097_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("MultiPartEntityPart.func_70088_a");

	/**
	 * <p>
	 * Name: isEntityEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70028_i = McMappingDatabase.getSRG("MultiPartEntityPart.func_70028_i");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("MultiPartEntityPart.func_70014_b");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_70259_a = McMappingDatabase.getSRG("field_70259_a");

	/**
	 * <p>
	 * Name: partName
	 * </p>
	 */
	public static McObfPair field_146032_b = McMappingDatabase.getSRG("field_146032_b");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("MultiPartEntityPart.func_70067_L");

}
