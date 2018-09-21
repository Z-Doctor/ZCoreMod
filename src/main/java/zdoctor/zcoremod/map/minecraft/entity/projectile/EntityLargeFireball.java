package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLargeFireball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aen";
		else
			return "net/minecraft/entity/projectile/EntityLargeFireball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aen";
		else
			return "EntityLargeFireball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laen;";
		else
			return "Lnet/minecraft/entity/projectile/EntityLargeFireball;";
	}

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLargeFireball.func_70014_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLargeFireball.func_70037_a");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70227_a = McMappingDatabase.getSRG("EntityLargeFireball.func_70227_a");

	/**
	 * <p>
	 * Name: explosionPower
	 * </p>
	 */
	public static McObfPair field_92057_e = McMappingDatabase.getSRG("field_92057_e");

	/**
	 * <p>
	 * Name: registerFixesLargeFireball
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189744_a = McMappingDatabase.getSRG("EntityLargeFireball.func_189744_a");

}
