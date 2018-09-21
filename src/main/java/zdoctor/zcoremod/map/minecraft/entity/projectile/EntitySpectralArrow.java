package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpectralArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeu";
		else
			return "net/minecraft/entity/projectile/EntitySpectralArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeu";
		else
			return "EntitySpectralArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeu;";
		else
			return "Lnet/minecraft/entity/projectile/EntitySpectralArrow;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntitySpectralArrow.func_70071_h_");

	/**
	 * <p>
	 * Name: registerFixesSpectralArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189659_b = McMappingDatabase.getSRG("EntitySpectralArrow.func_189659_b");

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_184562_f = McMappingDatabase.getSRG("field_184562_f");

	/**
	 * <p>
	 * Name: arrowHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_184548_a = McMappingDatabase.getSRG("EntitySpectralArrow.func_184548_a");

	/**
	 * <p>
	 * Name: getArrowStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184550_j = McMappingDatabase.getSRG("EntitySpectralArrow.func_184550_j");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntitySpectralArrow.func_70037_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntitySpectralArrow.func_70014_b");

}
